package com.str.org;

public class String_Method {
	
	public static void main(String[] args) {
		
		String a="Samiullah s";
		String a1=" samiullah syed";
				
	    int b = a.length();
	    System.out.println(b);
	    
	    boolean c = a.equals(a1);
	    System.out.println(c);
				
	    boolean d= a.equalsIgnoreCase(a);
	    System.out.println(d);
	    
	    String e= a1.toUpperCase();
	    System.out.println(e);
	    
	    String f = a.toLowerCase();
	    System.out.println(f);
	    
	    boolean g = a.startsWith("S");
	    System.out.println(g);
	    
	    boolean h= a.endsWith("S");
	    System.out.println(h);
	    
	    boolean i = a.contains("Sam");
	    System.out.println(i);
	    
	    int j = a.indexOf('l');
	    System.out.println(j);
	    
	    int k = a.lastIndexOf('l');
	    System.out.println(k);
	    
	    char l = a.charAt(7);
	    System.out.println(l);
	    
	    String m = a1.replace("s","$");
	    System.out.println(m);
	    
	    String n= a.substring(4);
	    System.out.println(n);
	    
	    boolean o = a.isEmpty();
	    System.out.println(o);
	    
	    String[] p = a.split(" ");
	    
	    for (String sam : p) {
	    	
	    	System.out.println(sam);
			
		}
	    
	    String q = a1.trim();
	    System.out.println(q);
	    
	    System.out.println(a1);
	    
	    String r = a.concat(a1);
	    System.out.println(r);
	    
	    String s = a.valueOf(a1);
	    System.out.println(s);
	    
	    int t = a.compareTo(a1);
	    System.out.println(t);
	    
	}

}
