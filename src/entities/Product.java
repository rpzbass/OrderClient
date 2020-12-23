package entities;

public class Product {

	private String name;
	private Double price;

	// CONSTRUCTORS

	public Product() {

	}
	// OVERLOAD

	public Product(String name, Double price) {

		this.name = name;
		this.price = price;
	}
	// METHOD GETTERS AND SETTERS

	public String getName() {

		return this.name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public Double getPrice() {

		return this.price;
	}

	public void setPrice(Double price) {

		this.price = price;
	}

}
