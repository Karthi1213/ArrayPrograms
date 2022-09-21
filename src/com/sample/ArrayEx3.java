package com.sample;

import java.util.Arrays;

public class ArrayEx3 {
	 public static void main(String[] args)
	 {
	    int[] src = {5, 7, 2, 4, 9 ,10 ,11 ,12};
		System.out.println("Original Array: "+Arrays.toString(src)); 
		int max_val = src[0];
		int min = src[0];
		for(int i = 1; i < src.length; i++)
		{
			if(src[i] > max_val)
				max_val = src[i];
			else if(src[i] < min)
				min = src[i];
		}
		System.out.println("Difference between the largest and smallest values of the said array: "+(max_val-min));	
	 }
	
}
