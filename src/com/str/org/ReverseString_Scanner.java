package com.str.org;

import java.util.Scanner;

public class ReverseString_Scanner {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The String:");
		String str = s.nextLine();
		
		String rev="";
		
		for (int i = str.length()-1; i >=0; i--) {//i=9;9>=0 ---->i=8
			
			char ch = str.charAt(i);//ch=n--->ch=i
			rev = rev+ch;//rev=n--->ni
			
		}
		System.out.println("Reversed String is:"+rev);
		
		String[] split = str.split("");
		System.out.println(split);
		
		for (String sp : split) {
			System.out.println(sp);
			
		}
			
		
	}

}
