package com.designpattern.creational.factory;

public class ShapeFactory {
	Shape getShape(String shapetype){
		if(shapetype==null){
			return null;
		}
		if(shapetype.equalsIgnoreCase("Circle")){
			return new Circle();
		}else if(shapetype.equalsIgnoreCase("Square")){
			return new Square();
		}else if(shapetype.equalsIgnoreCase("Rectangle")){
			return new Rectangle();
		}
		return null;
	}
}
