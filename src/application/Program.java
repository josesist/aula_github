package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Digite os dados do Produto:");
		System.out.print("name:");
		product.name = sc.nextLine();
		
		System.out.print("Price:");
		product.price = sc.nextDouble();
		
		System.out.print("Quantity:");
		product.quantity = sc.nextInt();
		
		System.out.println("name:" + product.name + "," + "price:" + product.price + "," + "Quantity:" + product.quantity);
		
		
		
		
		
		sc.close();
		
	}
}
