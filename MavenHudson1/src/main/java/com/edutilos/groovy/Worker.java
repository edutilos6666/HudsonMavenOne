package com.edutilos.groovy;

public class Worker {
  private String name ;

public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public Worker(String name) {
	super();
	this.name = name;
}


public Worker() {
	super();
}


@Override
public String toString() {
	return "Worker [name=" + name + "]";
}
 
  
  
}
