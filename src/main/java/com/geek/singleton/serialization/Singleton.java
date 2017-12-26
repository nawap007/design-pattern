package com.geek.singleton.serialization;

import java.io.Serializable;

public class Singleton implements Serializable 
{
	// public instance initialized when loading the class
	public static Singleton instance = new Singleton();
	
	private Singleton() 
	{
		// private constructor
	}
	
	// implement readResolve method
	protected Object readResolve()
	{
		return instance;
	}
}
