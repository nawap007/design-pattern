package com.dzone.visitor;

//concrete element
public class Book implements Visitable {
	private double price;
	private double weight;

	// accept the visitor
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public double getPrice() {
		return price;
	}

	public double getWeight() {
		return weight;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}