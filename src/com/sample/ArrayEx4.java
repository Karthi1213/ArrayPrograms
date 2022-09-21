package com.sample;

import java.util.Arrays;

public class ArrayEx4 {
	public static void main(String[] args)
	 {
	    int[] src = {10, 20, 5, 7, 2, 4, 9};
		System.out.println("Original Array: "+Arrays.toString(src)); 
		int max = src[0];
		int min = src[0];
		float sum = src[0];
		for(int i = 1; i < src.length; i++)
		{
			sum  += src[i];
			if(src[i] > max)
				max = src[i];
			else if(src[i] < min)
				min = src[i];
		}
		float val = ((sum-max-min) / (src.length - 2));
		System.out.printf("Compute the average value of an array of integers except the largest and smallest values: %.2f",val);
			
	  }
	
}
