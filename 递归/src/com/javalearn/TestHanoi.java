package com.javalearn;

public class TestHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hanoi(5,'A','B','C');
	}
	
	//��ŵ����
	
	/**
	 * @param n:n������
	 * @param form����ʼ������
	 * @param in���м������
	 * @param to��Ŀ������
	 */
	public static void hanoi(int n,char from,char in,char to) {
		//ֻ��һ������
		if(n==1) {
			System.out.println("��1�����Ӵ�"+from+"�Ƶ�"+to);
		}
		//�ж������
		else {
			//�ƶ��������е����ӵ��м�λ��
			hanoi(n-1,from,to,in);
			//�ƶ����������
			System.out.println("��"+n+"�����Ӵ�"+from+"�Ƶ�"+to);
			//����������������Ƶ�Ŀ��λ��
			hanoi(n-1,in,from,to);
		}
	}

}
