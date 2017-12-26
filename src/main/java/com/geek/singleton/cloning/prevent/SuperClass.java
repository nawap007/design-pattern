package com.geek.singleton.cloning.prevent;

//JAVA code to explain overcome 
//cloning issue with singleton
public class SuperClass implements Cloneable {
	int i = 10;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
