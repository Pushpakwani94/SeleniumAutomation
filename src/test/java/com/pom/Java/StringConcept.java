package com.pom.Java;

public class StringConcept {
	public static void main(String[] args) {
		String str="Automation Testing";
		String rev ="";
		for(int i=str.length()-1;i>=0;i--) {
			  rev=rev+str.charAt(i);
			 
		}
		System.out.println("Reverse String"+" ================= "+rev);
	}

}
