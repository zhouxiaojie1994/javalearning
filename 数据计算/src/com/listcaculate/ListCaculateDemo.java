package com.listcaculate;

public class ListCaculateDemo {
	public static void main(String[] args) {
		int[] nums= new int[]{ 61, 23, 4, 74, 13, 148, 20};
		double sum=0;
		int max=nums[0];
		int min=nums[0];
		for(int i=0; i<nums.length;i++)
		{
			if(max<nums[i]) {
				max=nums[i];
			}
			if(min>nums[i]) {
				min=nums[i];
			}
			sum=sum+nums[i];
		}
		double avg=sum/(nums.length);
		System.out.println("最大值是："+max);
		System.out.println("最小值是："+min);
		System.out.println("平均值是："+avg);
	}
}
