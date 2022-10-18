package com.str.org;
 
public class Reverse {
	
	public static void main(String[] args) {
		
		String a="Hello World";
		
		String[] str= a.split(" ");
		
		for (int i = str.length-1; i >= 0; i--) {
			
			System.out.print(str[i]+" ");
			
		}
	}

}
