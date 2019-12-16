package com.casestudy.delta;

import java.time.LocalTime;
import java.util.List;

public class Restaurant {
	
	private int restId;
	private String restaurantName;
	private double rating;
	private LocalTime openTime;
	private LocalTime closeTime;
	private Reviews reviews;
	private Dishes dishes;
	
	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Restaurant(int restId, String restaurantName, double rating, LocalTime openTime, LocalTime closeTime,
			Reviews reviews, Dishes dishes) {
		super();
		this.restId = restId;
		this.restaurantName = restaurantName;
		this.rating = rating;
		this.openTime = openTime;
		this.closeTime = closeTime;
		this.reviews = reviews;
		this.dishes = dishes;
	}

	public int getRestId() {
		return restId;
	}

	public void setRestId(int restId) {
		this.restId = restId;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public LocalTime getOpenTime() {
		return openTime;
	}

	public void setOpenTime(LocalTime openTime) {
		this.openTime = openTime;
	}

	public LocalTime getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(LocalTime closeTime) {
		this.closeTime = closeTime;
	}

	public Reviews getReviews() {
		return reviews;
	}



	public void setReviews(Reviews reviews) {
		this.reviews = reviews;
	}



	public Dishes getDishes() {
		return dishes;
	}



	public void setDishes(Dishes dishes) {
		this.dishes = dishes;
	}


	@Override
	public String toString() {
		return "Restaurant [restId=" + restId + ", restaurantName=" + restaurantName + ", rating=" + rating
				+ ", openTime=" + openTime + ", closeTime=" + closeTime + ", reviews=" + reviews + ", dishes=" + dishes
				+ "]";
	}
	
	

}
