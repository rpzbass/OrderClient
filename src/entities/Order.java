package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private Date moment;
	private OrderStatus status;

	private Client client;
	
	List<OrderItem> items = new ArrayList<OrderItem>();
	
	//Create Constructors
	public Order() {
		
	}
	
	public Order(Date moment, OrderStatus status,Client client) {
		
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	// Create Methods Getters and Setters
	
	
	public Client getClient() {
		
		return this.client;
	}
	
	public void setClient(Client client) {
		
		this.client = client;
	}
	
	
	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(Date moment) {
		
		this.moment = moment;
	}
	
	public OrderStatus getStatus() {
		return this.status;
		
	}
	public void setStatus(OrderStatus status) {
		
		this.status = status;
	}
	
	//Methods of project
	
	public void addItem(OrderItem item) {
		
        items.add(item);  //Receive Objects with constructors
	}
	
	public void removeItem(OrderItem item) {
		
		items.remove(item);
	}
	

	public Double total() {
		double sum = 0;
	
		for (OrderItem i : items ) {
			
			sum += i.subTotal();
		}
		
		return sum;
	
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("-------------------------------------------------------------------------------\n");
		sb.append("ORDER SUMMARY:\n");
		sb.append("Order moment: "+ this.getMoment() +"\n");
		sb.append("Order status: "+ this.status + "\n" );
		sb.append("Client: "+ this.getClient().getName() + "("+ this.getMoment() + ") -" + this.getClient().getEmail()+ "\n");
		sb.append("Order items: \n");
		
		for(OrderItem o : items) {
			
			sb.append(o.product.getName() + ", $"+o.getPrice() +",Quantity: "+ o.getQuantity() +" ,"+ o.subTotal() + "\n");
		
		}
		
		sb.append(this.total());
		
		return sb.toString();
		
	}
	
	
	
	
	
}
