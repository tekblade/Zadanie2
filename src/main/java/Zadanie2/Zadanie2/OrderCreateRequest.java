package Zadanie2.Zadanie2;

import java.util.ArrayList;
import java.util.List;

public class OrderCreateRequest {
	String notifyUrl;
	String customerIp;
	String merchantPosId;
	String description;
	String currencyCode;
	String totalAmount;
	Buyer buyer=new Buyer(); //buyer's personal data // No system implemented for managing clients personal data
	List<Product> products=new ArrayList<Product>(); //jeden tylko produkt poniewaz nie mam systemu w formularzu dla quantity proszę wprowadzić 1
	///////////////////////////////////////////////////dla poprawnosci danych
	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl=notifyUrl;
	}
	public String getNotifyUrl() {
		return notifyUrl;
	}
	///////////////////////////////////////////////////////
	public void setCustomerIp(String customerIp) {
		this.customerIp=customerIp;
	}
	public String getCustomerIp() {
		return customerIp;
	}
	///////////////////////////////////////////////////////
	public void setMerchantPosId(String merchantPosId) {
		this.merchantPosId=merchantPosId;
	}
	public String getMerchantPosId() {
		return merchantPosId;
	}
	///////////////////////////////////////////////////////////
	public void setDescription(String description) {
		this.description=description;
	}
	public String getDescription() {
		return description;
	}
	////////////////////////////////////////////////////////////
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode=currencyCode;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	/////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////
	public void setTotalAmount(String totalAmount) {
		this.totalAmount=totalAmount;
	}
	public String getTotalAmount() {
		return totalAmount;
	}
	////////////////////////////////////////////////////////////////////////
	public void setProducts(String name,String unitPrice, String quantity) {
		Product product=new Product();
		product.setName(name);
		product.setUnitPrice(unitPrice);
		product.setQuantity(quantity);		
		products.add(product);
	}
	public List<Product> getProducts() {
		return products;
	}
	//////////////////////////////////////////////////////////////////////////////
	public Buyer getBuyer() {
		return buyer;
	}
}
