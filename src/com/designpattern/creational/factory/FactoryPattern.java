package com.designpattern.creational.factory;

/**
 * This is one of the creational pattern.
 * In Factory pattern, we create object without exposing the creation logic to the client
 * and refer to newly created object using a common interface.
 * 
 * e.g. java.util.Calendar#getInstance() - 	getInstance(TimeZone zone, Locale aLocale) Gets a calendar with the specified time zone and locale.
 *      java.util.ResourceBundle#getBundle() -getBundle(String baseName)
 *      java.text.NumberFormat#getInstance() - getInstance(Locale inLocale) Returns a general-purpose number format for the specified locale.
 * */
public class FactoryPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shapeFactory=new ShapeFactory();
		Shape square=shapeFactory.getShape("Square");
		square.draw();
		
		Shape circle=shapeFactory.getShape("cIRCLE");
		circle.draw();
		
		Shape rectangle=shapeFactory.getShape("Rectangle");
		rectangle.draw();
		
		Square squareagain=(Square)shapeFactory.getShape("Square");
		squareagain.draw();
		
	}

}
