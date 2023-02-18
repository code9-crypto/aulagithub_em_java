package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	//Formatando data e hora para padrão BR
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	
	private Client cli;
	private List<OrderItem> pedido = new ArrayList<OrderItem>();
	
	public Order() {
		
	}

	public Order(Date moment, OrderStatus status, Client cli) {
		this.moment = moment;
		this.status = status;
		this.cli = cli;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getCli() {
		return cli;
	}	
	
	public List<OrderItem> getPedido() {
		return pedido;
	}
	
	public void addItem(OrderItem item) {
		pedido.add(item);
	}
	
	public void removeItem(OrderItem item) {
		pedido.remove(item);
	}
	
	public Double total() {
		double total = 0;
		for (OrderItem p : pedido) {
			total += p.subTotal();
		}
		return total;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append(cli + "\n");
		sb.append("Order items:\n");
		for (OrderItem item : pedido) {
			sb.append(item);
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
}
