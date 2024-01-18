package application;

import java.util.Date;

import entites_order.Order;
import entitites.OrderStatus;

public class Program {
	
	public static void main(String[] args) {
		Order order = new Order(1080, new Date(),OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
	}

	
}
