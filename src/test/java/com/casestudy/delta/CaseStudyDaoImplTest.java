package com.casestudy.delta;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import junit.framework.TestCase;


public class CaseStudyDaoImplTest extends TestCase {

	 CaseStudyDaoImpl daoimpl = new CaseStudyDaoImpl();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("start of new testcase");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("End of new testcase");
	}
	@Test
	public void testgetRestaurantByRating() {
		
		assertEquals(Arrays.asList("Meghana","BiryaniZone"), daoimpl.getRestaurantByRating());
	}
	
	@Test
	public void testgetRestaurantAvail() {
		assertEquals("Meghana",daoimpl.getRestaurantAvail().get(0).getRestaurantName());
	}

}
