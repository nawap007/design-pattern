package com.geek.singleton.serialization;

import java.io.Serializable;

public class Singleton1 implements Serializable {
	// public instance initialized when loading the class
	public static Singleton1 instance = new Singleton1();

	private Singleton1() {
		// private constructor
	}
}