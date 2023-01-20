package com.main;

import java.util.regex.*;
import java.util.Scanner;
 
public class Main{
     
	public static boolean check(String s){
	    Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");
	    
	    Matcher m = p.matcher(s);
	    return (m.find() && m.group().equals(s));
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number without any extra character");
	    String s = sc.next();
	     
	    if (check(s))
	        System.out.println("Valid Number");    
	    else
	        System.out.println("Invalid Number");    
	}
}
