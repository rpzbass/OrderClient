package entities;

public class OrderItem {

	private Integer quantity;
	private Double price;
	//Association
	Product product;
	//Create Constructs
	
	public OrderItem() {
		
	}
	// Construct Overload
	
	public OrderItem(Integer quantity,Double price,Product product) {
		
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}
	
	// Methods Getters and Setters
	
	public Integer getQuantity(){
		return this.quantity;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public Double getPrice() {
		return this.price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double subTotal() {
		
		return this.getQuantity() * this.getPrice();
	}

	

}



