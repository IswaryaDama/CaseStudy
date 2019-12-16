package com.casestudy.delta;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CaseStudyDaoImpl implements CaseStudyDao {
	
	  List<Restaurant> restaurant = new ArrayList<Restaurant>();

	//List<Reviews> reviewsList= new ArrayList<Reviews>();
	static Reviews r ;
	static Dishes d;
	List<Dishes> dishes= new ArrayList<Dishes>();
	
	public List<Restaurant> getAllRestaurants() {
		// TODO Auto-generated method stub
		try(Stream<String>restaurantdata = Files.lines(Paths.get("src/main/resources/","Restaurant.txt"))){
			
			restaurant = restaurantdata.map(CaseStudyDaoImpl::getRestaurantDetails).collect(Collectors.toList());
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		return restaurant;
	}

	public List<String> getRestaurantByRating() {
		// TODO Auto-generated method stub
		System.out.println("Restaurants with rating <= 4 are ");
   List<String> restbyrating= restaurant.stream().filter(r->r.getRating()<=(4.0)).map(Restaurant::getRestaurantName)
                       .collect(Collectors.toList());
   return restbyrating;
	}

	public  List<Restaurant> getRestaurantAvail() {
		// TODO Auto-generated method stub
		
		System.out.println("Available restaurants are ");
		
   List<Restaurant> availrest=  restaurant.stream().filter(r->r.getOpenTime().isAfter(LocalTime.of(8, 30)) && r.getCloseTime().isBefore(LocalTime.of(23, 00)))
                         .collect(Collectors.toList());
   return availrest;
	}
	
   static Reviews getReviewDetails(String revdata) {
	
		String[] reviews1 = revdata.split(",");
		r = new Reviews(Integer.parseInt(reviews1[0]),reviews1[1]);
		return r;
	}
    static Dishes getDishDetails(String dishdata) {
	
	String[] dishes1 = dishdata.split(",");
	Dishes dishes= new Dishes(Integer.parseInt(dishes1[0]),dishes1[1],Integer.parseInt(dishes1[2]),Integer.parseInt(dishes1[3]));
	return dishes;
}

	static Restaurant getRestaurantDetails(String data) {
		Restaurant re = null;
		try {
		Stream<String>reviewdetails = Files.lines(Paths.get("src/main/resources/","Reviews.txt"));
		Stream<String>dishdetails = Files.lines(Paths.get("src/main/resources/","Dishes.txt"));
		String[] restdetails = data.split(",");
		DateTimeFormatter timeformat = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime openTime = LocalTime.parse(restdetails[3],timeformat);
		LocalTime closeTime = LocalTime.parse(restdetails[4],timeformat);

	 re = new Restaurant(Integer.parseInt(restdetails[0]),restdetails[1],Double.parseDouble(restdetails[2]),openTime,closeTime,reviewdetails.map(CaseStudyDaoImpl::getReviewDetails).filter(rev->rev.getRestId()==Integer.parseInt(restdetails[0])).findAny().get(),dishdetails.map(CaseStudyDaoImpl::getDishDetails).filter(dis->dis.getRestId()==Integer.parseInt(restdetails[0])).findAny().get());
	
   }catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		return re;
	}
	
}
