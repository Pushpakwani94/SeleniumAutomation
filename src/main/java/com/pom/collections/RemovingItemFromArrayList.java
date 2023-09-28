package com.pom.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class RemovingItemFromArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(12);
		arr.add(15);
		Iterator<Integer> itr=arr.iterator();
		while(itr.hasNext()) {
			Integer i=itr.next();
			if(i<12) {
				
				itr.remove();
			}
			
			
			
		}
		System.out.println(arr);
		
	}

}
