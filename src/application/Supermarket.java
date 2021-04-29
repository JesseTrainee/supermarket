package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Order;
import model.Product;

public class Supermarket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Order> list = new ArrayList<>();
		
		System.out.println("Enter with the number of orders:");
		int n = sc.nextInt();
		for(int i = 1 ; i < n ; i++) {
		Order order = new Order(new Product("Feijão", 12.0, 3),2);
		list.add(order);
		}
		
		for(Order item : list) {
			System.out.println(item);
		}
		sc.close();
	}

}
