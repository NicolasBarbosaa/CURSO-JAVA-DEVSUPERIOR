package application;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entites.OrderItem;
import entites.client;
import entites_enum.OrderStatus;

public class order {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	

	private OrderStatus status;
	private Date moment;
	
	private client client;
	private List<OrderItem> itens = new ArrayList<>();
	
	
	
	public order(OrderStatus status, Date moment, client client	) {
		this.status = status;
		this.moment = moment;
		this.client = client;
	}
	

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}


	public Date getMoment() {
		return moment;
	}


	public void setMoment(Date moment) {
		this.moment = moment;
	}


	public client getClient() {
		return client;
	}


	public void setClient(client client) {
		this.client = client;
	}

	

	public List<OrderItem> getItens() {
		return itens;
	}

	public void addItens(OrderItem item){
		itens.add(item);
	}
	
	public void removeItens(OrderItem item){
		itens.remove(item);
	}

	public double total() {
		double sum = 0.0;
		for (OrderItem item : itens) {
			sum += item.subTotal();
		}
		return sum;
	}
		
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (OrderItem item : itens) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
		
		
}
