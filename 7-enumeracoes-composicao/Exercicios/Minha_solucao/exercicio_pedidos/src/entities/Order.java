package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	//Formato padrão da data
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	private LocalDateTime moment;
	private OrderStatus status;
	
	//Associação lista de pedidos e cliente
	private List<OrderItem> orders = new ArrayList<>();
	private Client client;
	
	public Order() {
		
	}

	public Order(LocalDateTime moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getOrders() {
		return orders;
	}	

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public void addItem(OrderItem order) {
		orders.add(order);
	}
	
	public void removeItem(OrderItem order) {
		orders.add(order);
	}
	
	public Double total() {		
		double sum = 0.0;
		for( OrderItem item : orders ) {
			sum += item.subTotal();
		}		
		return sum;
	}
	
	public String toString() {		
		return "Order moment: " + this.getMoment().format(fmt) +"\n" +
				"Order status: " + this.getStatus().toString() + "\n" +
				"Client: " + this.getClient();
	}
}
