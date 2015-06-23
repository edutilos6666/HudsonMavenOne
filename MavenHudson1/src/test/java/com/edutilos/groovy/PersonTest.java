package com.edutilos.groovy;

import org.junit.After;
import static org.junit.Assert.* ;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PersonTest {

	 @Before
	 public void setup() {
		 System.out.println("setup");
	 }
	 
	 @After
	 public void tearDown() {
		 System.out.println("tearDown");
	 }
	 
	 @Test
	 public void testMethod1() {
		 Person p = new Person(1, "foo", 10, 100); 
		 assertEquals(1, p.getId());
		 assertEquals("foo", p.getName()); 
		 assertEquals(10, p.getAge()); 
		 assertEquals(100.0, p.getWage(), 1.0); 
	 }
}
