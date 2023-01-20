package com.main;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type you facebook link here: ");
		String facebook = sc.next();
		
		System.out.println("Type you Linkdin link here: ");
		String linkdin = sc.next();
		
		System.out.println("Type your Email: ");
		String email = sc.next();
		
		System.out.println("Type your contact");
		String contact = sc.next();
		
		System.out.println("");
		
		System.out.println("Social Links: ");
		System.out.println(facebook);
		System.out.println(linkdin);
		
		System.out.println("");
		
		System.out.println("Email/s: ");
		System.out.println(email);
		
		System.out.println("");
		
		System.out.println("Contact: ");
		System.out.println(contact);
		
	}

}
