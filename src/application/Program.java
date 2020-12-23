package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		
		Scanner input = new Scanner(System.in);
		SimpleDateFormat spf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data");
		System.out.print("Name: ");
		String name = input.next();
		input.nextLine();
		System.out.print("Email: ");
		String email = input.next();
		System.out.print("Birth Date  (DD/MM/YYYY)");
		String date = input.next();
		
		System.out.println("Enter order data:");
		System.out.print("Status");
		String status =  input.next();
		System.out.print("How many items  to this order? ");
		
		Client  client = new Client(name,email,spf.parse(date));
		
		Order order = new Order(spf.parse(date),OrderStatus.valueOf(status),client); 
	
		
		int n = input.nextInt();
		
		for (int i =1 ; i <=n;i++) {
			
			System.out.print("Enter #"+i+"item data: \n");
			System.out.print("Product name: ");
			String product = input.next();
			System.out.print("Product price: ");
			Double price = input.nextDouble();
			System.out.print("Quantity: ");
			Integer qtde = input.nextInt();
			
		    OrderItem item = new OrderItem(qtde,price,new Product(product,price));
		    
		    order.addItem(item);	
			
		}
		

		System.out.print(order);
		
		
		
		
		
		
		

	}

}
