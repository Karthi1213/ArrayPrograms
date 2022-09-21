package com.sample;

import java.util.Arrays;

public class ArrayEx5 {
	 public static void main(String[] args)
	 {
	    int[] src = {0, 1, 2, 3, 4, -11};
		System.out.println("Original Array: "+Arrays.toString(src)); 
		System.out.println("Result: "+test(src));
	    }	
	    public static boolean test(int[] numbers) {
	    for (int number : numbers) {
	      if (number == 0 || number == -1) {
	        return false;
	      }
	    }
	    return true;
	  }  
}
