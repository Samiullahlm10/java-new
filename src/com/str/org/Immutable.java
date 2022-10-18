package com.str.org;

public class Immutable {
	
	public static void main(String[] args) {
		
		System.out.println("********Immutable*******");
		
//		duplicate
		String a="Java";
		System.out.println(a);
		
		System.out.println(System.identityHashCode(a));
		
		String a1="Java";
		System.out.println(a1);
		
		System.out.println(System.identityHashCode(a1));
		
//		Concordination
		a=a+a1;
		System.out.println(a);
		System.out.println(System.identityHashCode(a));
	}

}
