package com.designpattern.creational.singleton;

public class SynchronizedSingletonClass {

	private static SynchronizedSingletonClass instance=null;
	
	private SynchronizedSingletonClass(){
		
	}
	
	public static SynchronizedSingletonClass getInstance(){
		if(instance==null){
			//this is double checked locking methode to creat and singletone object with thread safty.
			synchronized (SynchronizedSingletonClass.class) {
				if(instance==null){
					instance=new SynchronizedSingletonClass();					
				}
			}
		}
		return instance;
	}
}
