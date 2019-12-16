package com.casestudy.delta;

import java.time.LocalTime;
import java.util.List;

public interface CaseStudyDao {

	List<Restaurant> getAllRestaurants();
	List<String> getRestaurantByRating();
	List<Restaurant> getRestaurantAvail();
	
	
	
}
