package com.javalearn;

import java.util.Arrays;

public class selectSort {

	public static void main(String[] args) {
		int[] arr=new int[] {2,7,3,9,4,6,1,0,5};
		selectSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void selectSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[minIndex]>arr[j]) {
					minIndex=j;
				}
			}
			if(minIndex!=i) {
				int tmp=arr[i];
				arr[i]=arr[minIndex];
				arr[minIndex]=tmp;
			}
		}
		
		
	}

}
