package com.howtodoinjava.prototypeDemo;

public interface PrototypeCapable extends Cloneable {
	public PrototypeCapable clone() throws CloneNotSupportedException;
}