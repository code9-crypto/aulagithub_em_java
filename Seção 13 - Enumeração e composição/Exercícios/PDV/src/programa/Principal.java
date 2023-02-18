package programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Principal {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf_nascimento = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data:");
		Date momento_pedido = new Date();
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birth = sdf_nascimento.parse(sc.next()); 
		sc.nextLine();
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String situacao = sc.next();
		
		//Instanciando novo cliente no pedido
		Order novoPedido = new Order(momento_pedido, OrderStatus.valueOf(situacao), new Client(name, email, birth));
		
		System.out.print("How many itens to this order: ");
		int itens = sc.nextInt();
		for ( int i = 0; i < itens; i++ ) {
			System.out.println("Enter #"+(i+1)+" item data:");
			System.out.print("Product name: ");
			String prodName = sc.next();
			System.out.print("Product price: ");
			Double prodPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			OrderItem item = new OrderItem(quantity, prodPrice, new Product(prodName, prodPrice));
			novoPedido.addItem(item);
		}
		//Pulando uma linha
		System.out.println();
		
		
		
		
		
		//Exibindo relatório ao cliente
		System.out.println("0RDER SUMMARY:");
		System.out.println(novoPedido);
		
		
		sc.close();
	}

}
