package com.edutilos.groovy;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class WorkerTest {
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
	  Worker w = new Worker("foobar"); 
	  assertEquals("foobar", w.getName());
  }
}
