package Zadanie2.Zadanie2;

public class Buyer {
	String email;
	String phone;
	String firstName;
	String lastName;
	String language;
	public String password="password";
	////////////////////////////////////////////////////
	public Buyer() {
		email="lukasz.ggrabias@gmail.com";
		phone="790500500";
		firstName="John";
		lastName="Kowalsky";
		language="pl";
	}
	//////////////////////////////////////
	public String getEmail() {
		return email;
	}
	//////////////////////////////////////
	public String getPhone() {
		return phone;
	}
	/////////////////////////////////////////
	public String getFirstName() {
		return firstName;
	}
	/////////////////////////////////////////////////
	public String getLastName() {
		return lastName;
	}
	public String getLanguage() {
		return language;
	}
}
