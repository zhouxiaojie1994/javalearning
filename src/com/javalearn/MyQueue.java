package com.javalearn;

public class MyQueue {
	//��ʼ��
	int[] elements;
	public MyQueue() {
		elements=new int[0];
	}
	
	//���
	public void add(int element) {
		int[] arr=new int[elements.length+1];
		for(int i=0;i<elements.length;i++) {
			arr[i]=elements[i];
		}
		arr[arr.length-1]=element;
		
		elements=arr;
	}
	
	//����
	public int poll() {
		if(elements.length==0) {
			throw new RuntimeException("Queue is empty!");
		}
		//���������飬����-1
		int[] newarr=new int[elements.length-1];
		//�����鸳ֵ���ӵڶ���Ԫ�ؿ�ʼ
		for(int i=1;i<elements.length;i++) {
			newarr[i-1]=elements[i];
		}
		//ȡ�������ͷԪ��
		int element=elements[0];
		//�滻����
		elements=newarr;
		return element;
	}
	
	//�ж϶����Ƿ�Ϊ��
	public boolean empty() {
		return elements.length==0;
	}

}
