package com.pom.Test;

public class ReverseString {
	public static void main(String[] args) {
		String str = "Autoamtion";
		String rev = "";

		for (int i = 0; i < str.length(); i++) {
			rev = rev+str.charAt(i) ;
		}

		System.out.println("Reversed string: " + rev);
	}

}