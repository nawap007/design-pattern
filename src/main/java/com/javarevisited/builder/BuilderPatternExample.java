package com.javarevisited.builder;

public class BuilderPatternExample {

	public static void main(String args[]) {

		// Creating object using Builder pattern in java
		Cake whiteCake = new Cake.Builder().sugar(1).butter(0.5).eggs(2).vanila(2).flour(1.5).bakingpowder(0.75)
				.milk(0.5).build();

		// Cake is ready to eat :)
		System.out.println(whiteCake);
	}
}

// Read more:
// http://javarevisited.blogspot.com/2012/06/builder-design-pattern-in-java-example.html#ixzz4xAxyfkON