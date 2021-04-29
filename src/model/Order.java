package model;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private int quantity;	
	private Product product;
	
	
	public Order(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Order [\nQuantity: " + quantity +  product.toString();
	}
	
	
}
