package com.javalearn;

import java.util.Arrays;

public class ShellSort {

	public static void main(String[] args) {
		int[] arr=new int[] {2,6,8,3,5,1,0,5,9,7};
		shellSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	//希尔排序
	public static void shellSort(int[] arr) {
		//遍历步长
		for(int d=arr.length/2;d>0;d/=2) {
			//遍历所有元素
			for(int i=d;i<arr.length;i++) {
				//遍历本组中的所有元素
				for(int j=i-d;j>=0;j-=d) {
					if(arr[j+d]<arr[j]) {
						int tmp=arr[j];
						arr[j]=arr[j+d];
						arr[j+d]=tmp;
					}
				}
			}
		}
	}

}
