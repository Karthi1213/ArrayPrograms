package com.sample;

public class ArrayEx1 {
    public static void main(String[] args) throws Exception {
        int[] array_nums = {1,1,2,1,3,1,4,1,5};
         int i = 1;
		System.out.print("\nSample array: \n");
		for (int n : array_nums)
            System.out.print(n+"  ");
		
        for(int j = 1, l = array_nums.length; j < l;) {
            if(array_nums[j] == 1)
                j++;
            else {
                int temp = array_nums[i];
                array_nums[i] = array_nums[j];
                array_nums[j] = temp;
                i ++;
                j ++;
            }
        }
        while (i < array_nums.length)
            array_nums[i++] = 1;
		System.out.print("\nAfter moving 1's to the end of the array: \n");
        for (int n : array_nums)
            System.out.print(n+"  ");
			System.out.print("\n");
    }
}

