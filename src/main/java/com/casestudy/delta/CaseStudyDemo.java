package com.casestudy.delta;

public class CaseStudyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CaseStudyDaoImpl daoimpl = new CaseStudyDaoImpl();
		daoimpl.getAllRestaurants().forEach(System.out::println);
		daoimpl.getRestaurantByRating().forEach(System.out::println);
		daoimpl.getRestaurantAvail().forEach(System.out::println);
		
	}

}
