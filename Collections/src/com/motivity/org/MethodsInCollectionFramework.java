package com.motivity.org;

import java.util.HashSet;
import java.util.Iterator;

public class MethodsInCollectionFramework {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(100);
		set.add(120);
		set.add(130);
		set.add(150);
		set.add(160);
		set.add(100);
		set.add(130);
		set.add(200);
		System.out.println("adding elements....");
		System.out.println("**********************************************************");
		System.out.println(set);
		HashSet<Integer> hs2 = new HashSet<>();
		
		hs2.add(12);
		hs2.add(2120);
		hs2.add(101);
		set.addAll(hs2);//to add new elements to existing class and print all the elements
		System.out.println("add new elements to existing object and print both the elements");
		System.out.println("**********************************************************");
		System.out.println(set);
		set.clear();//to clear all the elements
		System.out.println("to clear all elements"+set);
		System.out.println("**********************************************************");
		HashSet<String> s1 = new HashSet<String>();
		s1.add("bunty");
		s1.add("pintu");
		s1.add("dolly");
		
		System.out.println(s1);
		System.out.println("it is used to find element is present or not and it ill give boolean value");
		System.out.println("**********************************************************");
		System.out.println(s1.contains("pintu"));
		s1.remove("bunty");
		System.out.println("remove method is used to remove a particular element ..");
		System.out.println("**********************************************************");
		System.out.println(s1);
		System.out.println("it is used to find wheather the set is emepty r not and returns boolean");
		System.out.println("**********************************************************");
		System.out.println(s1.isEmpty());
		System.out.println("used to find how size of set");
		System.out.println("**********************************************************");
		System.out.println(s1.size());
		System.out.println("irrespective of order .equals is used to check wheater the values in set and s1 are same or not and returns boolean values");
		System.out.println("**********************************************************");
	    System.out.println(s1.equals(set));
	    System.out.println("the method returns hashcode value of set");
	    System.out.println("**********************************************************");
	    System.out.println(s1.hashCode());
	    
	    Iterator<String > itr = s1.iterator();
	     while (itr.hasNext()) {
	    	 System.out.println(itr.next() +" , ");
	     }
	     System.out.println("**********************************************************");
	     HashSet<Integer> cloned_setHashSet = new HashSet<Integer>();
	     cloned_setHashSet =(HashSet)hs2.clone();
	     System.out.println("the new cloned set is : "+cloned_setHashSet);
		System.out.println("************************************************************");
		  System.out.println("containsAll method used to give boolean values if set contains all the values returns true else false");
		  System.out.println(s1.containsAll(hs2));
		  System.out.println("************************************************************");
		  
		  //creating array by using toArray()..
		  Object arr []= s1.toArray();
		  for(int i=0;i<arr.length;i++) {
			  System.out.println("it is used to convert set to array");
		  System.out.println(arr[i]);
		  }
		

	}

}
