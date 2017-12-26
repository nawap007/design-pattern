package com.javapapers.sample.designpattern.builder;

public class BuilderSample {

	public static void main(String[] args) {

		HouseBuilder iglooBuilder = new IglooHouseBuilder();
		CivilEngineer engineer = new CivilEngineer(iglooBuilder);

		engineer.constructHouse();

		House house = engineer.getHouse();

		System.out.println("Builder constructed: " + house);
	}
}