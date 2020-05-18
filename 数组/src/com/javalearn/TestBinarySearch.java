package com.javalearn;

public class TestBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {1,2,3,4,5,6,7,8,9};
		//二分查找：条件是必须是有序数组，效率提高一倍；
		int target=6;
		//记录初始位置和结束位置以及中间位置
		int begin=0;
		int end=arr.length-1;
		int mid=(begin+end)/2;
		//定义元素位置默认值
		int index=-1;
		while(true) {
			//查找元素等于中间位置元素
			if(arr[mid]==target) {
				index=mid;
				break;
			}
			else {
				//查找元素在中间的左边
				if(arr[mid]>target) {
					end=mid-1;
				}
				else {
					//查找元素在中间的右边
					begin=mid+1;
				}
			}
			//重新取中间位置
			mid=(begin+end)/2;
		}
		System.out.println("index:"+index);
	}
}
