package com.javalearn;

import java.util.Arrays;

public class InsertSort {

	public static void main(String[] args) {
		int[] arr=new int[] {2,6,8,3,5,1,0,5,9,7};
		insertSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	//��������
	public static void insertSort(int[] arr) {
		//��������,�ӵڶ�������ʼ
		for(int i=1;i<arr.length;i++) {
			//���ǰһ�����Ⱥ�һ������
			if(arr[i-1]>arr[i]) {
				//��ź�һ����
				int tmp=arr[i];
				int j;
				//����ǰ�������,�ӵ�i-1λ��ʼ
				for(j=i-1;j>=0&&tmp<arr[j];j--) {
					//ǰ������Ⱥ���С���Ͱ�ǰ����������
					arr[j+1]=arr[j];
				}
				//ǰ���������tmpС���Ͱ�tmp����j+1λ
				arr[j+1]=tmp;
			}
		}
		
	}

}
