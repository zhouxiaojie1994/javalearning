package com.javalearn;

import java.util.Arrays;

public class TestOpArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���鶨��ʱ���涨�˳��ȣ����Ȳ��ɱ�
		int[] arr1=new int[] {4,5,6};
		//���ٲ鿴�����е�Ԫ��
		System.out.println(Arrays.toString(arr1));
		//�������Ԫ��
		int num=9;
		//1.�ȴ���һ�������飬����ΪԪ���鳤��+1
		int[] arr2=new int[arr1.length+1];
//		2.��ԭ������Ԫ�ظ��Ƶ���������
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
//		3.��num��ӵ���������
		arr2[arr2.length-1]=num;
//		4.�������鸳ֵ��ԭ�������
		arr1=arr2;
		System.out.println(Arrays.toString(arr1));

	}

}
