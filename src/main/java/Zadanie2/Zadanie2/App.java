package Zadanie2.Zadanie2;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		String baseUriAuthorize="https://secure.snd.payu.com/pl/standard/user/oauth/authorize";
		OrderCreateRequest order=new OrderCreateRequest();
		order.setTotalAmount("200");
		order.setCustomerIp("127.0.0.1");
		order.setNotifyUrl("https://pcupgrade.pl/notifyurl");
		order.setDescription("description");
		order.setCurrencyCode("PLN");
		order.setMerchantPosId("337361");
		order.setProducts("Xbox One X", "200", "1");
		//System.out.println("Cena: "+order.getMerchantPosId());
		RestTemplate template=new RestTemplate();
		ObjectMapper objectMapper = new ObjectMapper();
		HttpHeaders headers=new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		MultiValueMap<String, String> map=new LinkedMultiValueMap<String, String>();
		map.add("grant_type", "client_credentials");
		map.add("client_id", "337361");
		map.add("client_secret", "5d61d5b39fd5337aaba131da3c96ea07");
		HttpEntity<MultiValueMap<String, String>> requestEntity=new HttpEntity<MultiValueMap<String, String>>(map, headers);
		String jsonAnswer="";	
		jsonAnswer=template.postForObject(baseUriAuthorize, requestEntity,  String.class);	
		Token token=objectMapper.readValue(jsonAnswer, Token.class);
		System.out.println("Your access token is: " + token.getAccess_token());
		//////////////////////////////////////////////////////////////////////
		String createRequestUrl="https://secure.snd.payu.com/api/v2_1/orders";
		MultiValueMap<String, String> orderRequestHeaders=new LinkedMultiValueMap<String, String>();
		orderRequestHeaders.add("Content-Type", "application/json");
		orderRequestHeaders.add("Authorization", "bearer "+ token.getAccess_token());		
		orderRequestHeaders.add("Accept", "application/json");
		//orderRequestHeaders.add("Accept", "application/json");
		String orderCreateRequest=objectMapper.writeValueAsString(order);
		HttpEntity<String> orderRequest=new HttpEntity<String>(orderCreateRequest, orderRequestHeaders);
		String response=template.postForObject(createRequestUrl, orderRequest, String.class);
		System.out.println(response);
		//mozna by bylo stworzyc interfejs użytkownika zarządzający(Jako stronę web i baze danych) -
		//danymi wysyłanymi w zapytaniu OrderCreateRequest by był to realny system zakupowo-płatnościowy. 
		
	}
}
