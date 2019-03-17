package Zadanie2.Zadanie2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Token {
	String access_token;		
	String token_type;
	int expiresIn;
	String grantType;
	//////////////////////////////////////////////////////
	public Token() {
		/////////////////////////////////
	}
	/////////////////////////////////////////////////////

	public void setAccess_token(String access_token) {
		this.access_token=access_token;
	}
	public String getAccess_token() {
		return access_token;
	}
	////////////////////////////////////////////////
	public void setToken_type(String token_type) {
		this.token_type=token_type;
	}
	public String getToken_type() {
		return token_type;
	}
	//////////////////////////////////////////////////////
	public void setExpires_in(int expiresIn) {
		this.expiresIn=expiresIn;
	}
	public int getExpires_in() {
		return expiresIn;
	}
	//////////////////////////////////////////////////////////
	public void setGrant_type(String grantType) {
		this.grantType=grantType;
	}
	public String getGrant_type() {
		return grantType;
	}
}
