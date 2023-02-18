package entities;

public class OrderItem {
	private Integer quantity;
	private Double price;
	
	private Product prod;
	
	public OrderItem() {
		
	}

	public OrderItem(Integer quantity, Double price, Product prod) {
		this.quantity = quantity;
		this.price = price;
		this.prod = prod;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}
	
	public Product getProduct() {
		return prod;
	}
	
	public Double subTotal() {
		return quantity * price;
	}
		
	@Override
	public String toString() {
		return getProduct().getName() + ", $" + String.format("%.2f", price) +", " + " Quantity: " + quantity + ", Subtotal: $" + String.format("%.2f", subTotal()) +"\n";
	}
}
