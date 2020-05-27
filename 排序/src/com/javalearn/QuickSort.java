package com.javalearn;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// ����Ҫ���������
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
				//����ұ߱Ȼ���t�󣬾��ұ��±�ݼ�
				while(low<high&&t<=arr[high]) {
					high--;
				}
				//�����ұ������滻�����
				arr[low]=arr[high];
				//�����߱Ȼ���tС��������±����
				while(low<high&&arr[low]<t) {
					low++;
				}
				//���������滻�ұ�
				arr[high]=arr[low];
			}
			//�����滻
			arr[low]=t;
			//����С����
			quickSort(arr,start,low);
			//���Ŵ�����
			quickSort(arr,low+1,end);
		}
	}
	
	}
