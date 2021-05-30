package com.dailycoder.may_30_2021;

public class InterfaceWithDefaultAndStaticMethod implements Interface2 {

	public static void main(String[] args) {
		
		InterfaceWithDefaultAndStaticMethod obj = new InterfaceWithDefaultAndStaticMethod();
		
		obj.method2("Hello");
		
		System.out.println("--> "+Interface2.isNull("not null"));
		
		obj.log(" from main method ");
		
		System.out.println("--> "+obj.isNull("not null"));
		
	}

	@Override
	public void method2(String str) {
		System.out.println("In method2 implementation");
		
	}
	
	/*
	 * public void log(String str) { System.out.println("Class logging "+str); }
	 */
	
	boolean isNull(String str) {
		System.out.println("class null check ");
		return str==null? true: "".equals(str)?true:false;
	}
	
}



interface Interface2{
	
	void method2(String str);
	
	default void log(String str) {
		System.out.println("I2 logging "+str);
	}
	
	static boolean isNull(String str) {
		System.out.println("Interface null check ");
		return str==null? true: "".equals(str)?true:false;
	}
}