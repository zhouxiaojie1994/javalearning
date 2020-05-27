package com.javalearn;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// 给定要排序的数组
		int[] arr=new int[] {1,4,21,7,0,3,6,2,10,4,5,9,1};
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	public static void quickSort(int[] arr, int start,int end){
		if(start<end) {
			int t=arr[start];
			int low=start;
			int high=end;
			while(low<high) {
				//如果右边比基数t大，就右边下标递减
				while(low<high&&t<=arr[high]) {
					high--;
				}
				//否则右边数字替换到左边
				arr[low]=arr[high];
				//如果左边比基数t小，就左边下标递增
				while(low<high&&arr[low]<t) {
					low++;
				}
				//否则就左边替换右边
				arr[high]=arr[low];
			}
			//基数替换
			arr[low]=t;
			//重排小数组
			quickSort(arr,start,low);
			//重排大数组
			quickSort(arr,low+1,end);
		}
	}
	
	}
