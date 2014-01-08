package com.chandruvv.common;

/**
 * Hello world!
 *
 */
public class HelloWorld 
{
	private String name;
	private int age;
	
	HelloWorld(String name)
	{
		this.name=name;
	}
		
	HelloWorld(){
		
	}
	HelloWorld(int age, String name)
	{
		this.age=age;
		this.name=name;
	}
	
	HelloWorld(String name,int age)
	{
		this.age=age;
		this.name=name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	public void printHello() {
		System.out.println("Hello ! " + name);
	}
	
	public void initmethod()
	{
		System.out.println("Custom Init method being called");
	}
	public void destroymethod()
	{
		System.out.println("Custom Destroy method being called");
	}

}
