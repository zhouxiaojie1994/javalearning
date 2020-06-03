package com.javalearn;

import java.util.Arrays;

public class InsertSort {

	public static void main(String[] args) {
		int[] arr=new int[] {2,6,8,3,5,1,0,5,9,7};
		insertSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	//插入排序
	public static void insertSort(int[] arr) {
		//遍历数组,从第二个数开始
		for(int i=1;i<arr.length;i++) {
			//如果前一个数比后一个数大
			if(arr[i-1]>arr[i]) {
				//存放后一个数
				int tmp=arr[i];
				int j;
				//遍历前面的数组,从第i-1位开始
				for(j=i-1;j>=0&&tmp<arr[j];j--) {
					//前面的数比后面小，就把前面的数往后放
					arr[j+1]=arr[j];
				}
				//前面的数不比tmp小，就把tmp放在j+1位
				arr[j+1]=tmp;
			}
		}
		
	}

}
