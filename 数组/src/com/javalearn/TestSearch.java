package com.javalearn;

public class TestSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {1,2,3,4,5};
		//���Բ��ң���һ������ң��ҵ������±꣬�Ҳ�������-1
		int e=0;//���ҵ�Ԫ��
		int index=-1;//�±�Ĭ��ֵ
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==e) {
				index=i+1;
				break;//�ҵ�����
			}
		}
		System.out.println("Ԫ��"+e+"�ڵ�"+index+"λ��");
	}

}
