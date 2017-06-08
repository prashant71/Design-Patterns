package com.designpattern.creational.singleton;

/** Rules of singleton class
 * 1.constructor should be private - not able to access from out side of the class so we restrict object creation process.
 * 2.Declare a private static variable of the class that is the only instance of the class.
 * 3.Declare a static method to get that instance of the class this is the global access point of the singleton class.
 * 
 * Type of Singletone class :
 * 1.Early initialization, 2.Lazy initialization, 3.Static block initialization, 4.Thred safe - synchronized, 5. 
 * */
public class SingleObject {

	private static SingleObject instance=new SingleObject();
	
	private SingleObject(){
		
	}
	
	public static SingleObject getInstance(){
		if(instance==null){
			instance=new SingleObject();
		}
		return instance;
	}
	
	public void showMessage(){
		System.out.println("Instance method get called....");
	}
}
