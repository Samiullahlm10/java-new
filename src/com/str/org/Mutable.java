package com.str.org;

public class Mutable {
	
	public static void main(String[] args) {
		
		System.out.println("*******Mutable*******");
		
//		duplicate
		StringBuffer a= new StringBuffer("Python");
		System.out.println(a);
		System.out.println(System.identityHashCode(a));
		
		StringBuffer b= new StringBuffer("Python");
		System.out.println(b);
		System.out.println(System.identityHashCode(b));
		
//		append
		a=a.append(b);
		
		System.out.println(a);
		System.out.println(System.identityHashCode(a));
		
	}

}
