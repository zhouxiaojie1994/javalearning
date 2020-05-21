package com.javalearn;

import java.util.Arrays;

public class TestOpArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//数组定义时，规定了长度，长度不可变
		int[] arr1=new int[] {4,5,6};
		//快速查看数组中的元素
		System.out.println(Arrays.toString(arr1));
		//数组添加元素
		int num=9;
		//1.先创建一个新数组，长度为元素组长度+1
		int[] arr2=new int[arr1.length+1];
//		2.把原数组中元素复制到新数组中
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
//		3.把num添加到新数组中
		arr2[arr2.length-1]=num;
//		4.将新数组赋值给原数组变量
		arr1=arr2;
		System.out.println(Arrays.toString(arr1));

	}

}
