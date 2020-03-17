package com.subbu.tricky;

/**
 * @author subbaraop
 *
 */
public class Programs {
	public static void main(String args[]) {
		System.out.println("---Sysout Statements---");
		statements();
		System.out.println("--- Program on Literals---");
		literals();
		
	}
	
	static void statements() {
		//Generic print statements with char and String
		System.out.println('j'+'a'+'v'+'a');
		System.out.println('j'+"a"+'v'+'a');
		System.out.println('j'+"a"+('v'+'a'));
		System.out.println("Java 11 Certification is the Target");
	}
	
	static void literals() {
		//Any constant value which can be assigned to the variable is called as literal/constant.
		int a = 101; // decimal-form literal 
        int b = 0100; // octal-form literal 
        int c = 0xFace; // Hexa-decimal form literal 
        int d = 0b1111; // Binary literal
        
        System.out.println(a); 
        System.out.println(b); 
        System.out.println(c); 
        System.out.println(d); 
        
        char ch = 'a'; 
        System.out.println(ch);
        
        double fa = 101.230;
        System.out.println(fa); 
        
        String s = "Hello"; 
        System.out.println(s); 
	}
}
