package com.sample;

import java.util.Arrays;

public class ArrayEx2 {
	public static void main(String[] args)
	 {
	    int[] src = {1, 2, 3, 4, 5 ,6 ,7 ,8 ,9 ,10};
		System.out.println("Original Array: "+Arrays.toString(src)); 
		int ctr = 0;
		for(int i = 0; i < src.length; i++)
		{
			if(src[i] % 2 == 0)
				ctr++;
		}
		System.out.println("Number of even numbers : "+ctr);
		System.out.println("Number of odd numbers  : "+(src.length-ctr));
	 }
	}

