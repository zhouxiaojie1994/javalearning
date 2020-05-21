package com.javalearn;

public class TestSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {1,2,3,4,5};
		//线性查找，逐一往后查找，找到返回下标，找不到返回-1
		int e=0;//查找的元素
		int index=-1;//下标默认值
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==e) {
				index=i+1;
				break;//找到结束
			}
		}
		System.out.println("元素"+e+"在第"+index+"位！");
	}

}
