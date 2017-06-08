package com.designpattern.creational.singleton;
/**
 * This is creational patterns.
 * Restrict to instantiation of the class and allow only one instance,it also provide global pint of access to get the instace of the class
 * it is useful for logging, thread pool,cache, configuration setting*/
public class SingletonPattern {

	public static void main(String[] args){
		//illegal construct
	    //Compile Time Error: The constructor SingleObject() is not visible
		//SingleObject obj=new SingletObject();
		
		SingleObject object=SingleObject.getInstance();
		object.showMessage();
		
	}
}
