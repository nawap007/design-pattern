package com.dzone.visitor;

//Element interface
public interface Visitable {
	public void accept(Visitor visitor);
}