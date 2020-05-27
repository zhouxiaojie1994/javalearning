package com.javalearn;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr=new int[] {1,4,8,3,666,36,76,43,24,3,45};
		BubbleSort b=new BubbleSort();
		b.BubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public void BubbleSort(int[] arr) {
		//控制比较的轮次
		for(int i=0;i<arr.length-1;i++) {
			//控制比较的次数
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int tmp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=tmp;
				}
			}
		}
	}

}
