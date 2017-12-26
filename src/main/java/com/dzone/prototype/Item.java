package com.dzone.prototype;

//Prototype
public abstract class Item implements Cloneable{
	private String title;
	private double price;

	public Item clone() {
		Item clonedItem = null;
		try {
			// use default object clone.
			clonedItem = (Item) super.clone();
			// specialised clone
			clonedItem.setPrice(price);
			clonedItem.setTitle(title);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		} // catch
		return clonedItem;
	}

	private void setTitle(String title2) {
		// TODO Auto-generated method stub
		
	}

	private void setPrice(double price2) {
		// TODO Auto-generated method stub
		
	}

	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}
}
