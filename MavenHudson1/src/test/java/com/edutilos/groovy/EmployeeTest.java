package com.edutilos.groovy;


import static org.junit.Assert.*; 

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class EmployeeTest {
   @Before
   public void setup() {
	   System.out.println(getClass().getName()+ " setup");
   }
   
   @After
   public void tearDown() {
	   System.out.println(getClass().getName()+ " tearDown");
   }
   
   @Test
   public void testMethod1() {
	 Employee emp = new Employee(1, "foobar", 10); 
	 assertEquals(1, emp.getId());
	 assertEquals("foobar", emp.getName()); 
	 assertEquals(10, emp.getAge()); 
   }
   
   @Test
   public void testMethod2() {
	 Employee emp = new Employee(1, "foobar", 10); 
	 assertEquals(1, emp.getId());
	 assertEquals("foobar", emp.getName()); 
	 assertEquals(10, emp.getAge()); 
   }
}
