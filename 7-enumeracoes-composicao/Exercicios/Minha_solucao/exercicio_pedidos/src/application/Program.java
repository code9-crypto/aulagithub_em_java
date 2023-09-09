package application;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		//Configurações padrões
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try{
			//Recebendo dados do cliente
			System.out.println("Enter client data:");
			System.out.print("Name: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Birth date (DD/MM/YYYY): ");
			LocalDate birth = LocalDate.parse(sc.next(), fmt);
			System.out.println("Enter order data:");
			sc.nextLine();
			System.out.print("Status: ");
			String status = sc.nextLine();
			System.out.print("How many items to this order? ");
			int n = sc.nextInt();
			
			//Instanciando objetos
			LocalDateTime dataPedido = LocalDateTime.now();
			Order order = new Order(dataPedido, OrderStatus.valueOf(status), new Client(nome, email, birth));
			
			//Recebendo dados do pedido
			for( int i = 1; i <= n; i++ ) {
				sc.nextLine();
				System.out.println("Enter #"+i+" item data:");
				System.out.print("Product name: ");
				String prodName = sc.nextLine();
				System.out.print("Product price: ");
				double prodPrice = sc.nextDouble();
				System.out.print("Quantity: ");
				int qtd = sc.nextInt();
				order.addItem(new OrderItem(qtd, prodPrice, new Product(prodName, prodPrice)));
			}
			
			
			
			//Exibindo dados
			System.out.println();
			System.out.println("ORDER SUMMARY:");
			System.out.println(order);
			System.out.println("Order items:");
			for( OrderItem item : order.getOrders() ) {  
				System.out.print(item.getProduct().getName()+ ", $" +
				String.format("%.2f", item.getProduct().getPrice()) + ", " +
				"Quantity: " + item.getQuantity() + ", " +
				"Subtotal: $" + String.format("%.2f", item.subTotal())  + "\n"
				);
			}
			System.out.print("Total price: $" + String.format("%.2f", order.total()));
			
			
		}catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		
		
		sc.close();

	}

}
