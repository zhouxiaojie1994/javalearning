package com.javalearn;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������
		int[] arr1=new int[5];
		//��ȡ���鳤��
		int len=arr1.length;
		System.out.println("����arr1�ĳ���Ϊ��"+len);
		//��������Ԫ��
		int element0=arr1[0];
		System.out.println("�����һ��Ԫ��Ϊ��"+element0);
		//��ֵ
		arr1[0]=666;
		int element0_1=arr1[0];
		System.out.println("�����һ��Ԫ��Ϊ��"+element0_1);
		//��������
		for(int i=0;i<len;i++) {
			System.out.println("��"+i+"��Ԫ��Ϊ��"+arr1[i]);//���鶨��ʱ�ḳ��Ĭ��ֵ��int������Ĭ��Ԫ�ض���0
		}
		
		//������ֵ
		int[] arr2=new int[] {1,2,3,4,5,6};
		System.out.println("����arr2�ĳ���Ϊ:"+arr2.length);
	}

}
