package com.javalearn;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建数组
		int[] arr1=new int[5];
		//获取数组长度
		int len=arr1.length;
		System.out.println("数组arr1的长度为："+len);
		//访问数组元素
		int element0=arr1[0];
		System.out.println("数组第一个元素为："+element0);
		//赋值
		arr1[0]=666;
		int element0_1=arr1[0];
		System.out.println("数组第一个元素为："+element0_1);
		//遍历数组
		for(int i=0;i<len;i++) {
			System.out.println("第"+i+"个元素为："+arr1[i]);//数组定义时会赋予默认值，int型数组默认元素都是0
		}
		
		//批量赋值
		int[] arr2=new int[] {1,2,3,4,5,6};
		System.out.println("数组arr2的长度为:"+arr2.length);
	}

}
