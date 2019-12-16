package com.casestudy.delta;

public class Dishes {
	private int restId;
	private String dishName;
	private int price;
	private int discount;
	public Dishes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dishes(int restId, String dishName, int price, int discount) {
		super();
		this.restId = restId;
		this.dishName = dishName;
		this.price = price;
		this.discount = discount;
	}
	public int getRestId() {
		return restId;
	}
	public void setRestId(int restId) {
		this.restId = restId;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "Dishes [restId=" + restId + ", dishName=" + dishName + ", price=" + price + ", discount=" + discount
				+ "]";
	}
	
	

}
