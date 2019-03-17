package Zadanie2.Zadanie2;

public class Product {
	String name;
	String unitPrice;
	String quantity;
	///////////////////////////////////////////////
	public Product() {
		name="";
		unitPrice="";
		quantity="";
	}
	//////////////////////////////////////////////////
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	//////////////////////////////////////////////////
	public void setUnitPrice(String unitPrice) {        //powątpiewam czy ja mogę ustawiać cenę
		this.unitPrice=unitPrice;
	}
	public String getUnitPrice() {
		return unitPrice;
	}
	////////////////////////////////////////////////////////
	public void setQuantity(String quantity) {
		this.quantity=quantity;
	}
	public String getQuantity() {
		return quantity;
	}
}
