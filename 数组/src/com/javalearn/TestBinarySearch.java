package com.javalearn;

public class TestBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {1,2,3,4,5,6,7,8,9};
		//���ֲ��ң������Ǳ������������飬Ч�����һ����
		int target=6;
		//��¼��ʼλ�úͽ���λ���Լ��м�λ��
		int begin=0;
		int end=arr.length-1;
		int mid=(begin+end)/2;
		//����Ԫ��λ��Ĭ��ֵ
		int index=-1;
		while(true) {
			//����Ԫ�ص����м�λ��Ԫ��
			if(arr[mid]==target) {
				index=mid;
				break;
			}
			else {
				//����Ԫ�����м�����
				if(arr[mid]>target) {
					end=mid-1;
				}
				else {
					//����Ԫ�����м���ұ�
					begin=mid+1;
				}
			}
			//����ȡ�м�λ��
			mid=(begin+end)/2;
		}
		System.out.println("index:"+index);
	}
}
