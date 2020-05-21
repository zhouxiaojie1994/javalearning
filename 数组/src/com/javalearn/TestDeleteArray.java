package com.javalearn;
import java.util.Arrays;;
public class TestDeleteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1=new int[] {1,2,3,4,5,6};
		//删除第三个元素
		int del=2;
		int[] newarr=new int[arr1.length-1];
		for(int i=0;i<newarr.length;i++)
		{
			if(i<del) {
				newarr[i]=arr1[i];
			}
			else {
				newarr[i]=arr1[i+1];
			}
		}
		System.out.println(Arrays.toString(newarr));
	}

}
