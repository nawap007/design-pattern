package com.dzone.visitor;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	// normal shopping cart stuff
	private List<Visitable> items;

	public double calculatePostage() {
		// create a visitor
		PostageVisitor visitor = new PostageVisitor();
		// iterate through all items
		for (Visitable item : items) {
			item.accept(visitor);
		}
		double postage = visitor.getTotalPostage();
		return postage;
	}

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		List<Visitable> items = new ArrayList<Visitable>();
		Book book = new Book();
		book.setPrice(10);
		book.setWeight(20);

		Book book1 = new Book();
		book1.setPrice(10);
		book1.setWeight(20);

		items.add(book);
		items.add(book1);
		cart.items = items;
	}
}
