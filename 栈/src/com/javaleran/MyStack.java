package com.javaleran;

public class MyStack {
	//ջ�ĵײ�������洢����
	int[] elements;
	
	public MyStack() {
		elements=new int[0];
	}
	
	//ѹ��Ԫ��
	public void push(int element) {
		//����һ��������
		int[] arr=new int[elements.length+1];
		//��ԭ�����е�Ԫ�ظ��Ƶ���������
		for(int i=0;i<elements.length;i++) {
			arr[i]=elements[i];
		}
		//����Ԫ����ӵ��������
		arr[elements.length]=element;
		//���������滻������
		elements=arr;
	}
	
	//ȡ��ջ��Ԫ��
	public int pop() {
		if(elements.length==0) {
			throw new RuntimeException("Stack is empty!");
		}
		//ȡ����������һ��Ԫ��
		int element=elements[elements.length-1];
		//����һ��������
		int[] newarr=new int[elements.length-1];
		//ʣ��Ԫ�ض�������������
		for(int i=0;i<newarr.length;i++) {
			newarr[i]=elements[i];
		}
		//�滻����
		elements=newarr;
		//����ջ��Ԫ��
		return element;
	}
	
	//�鿴ջ��Ԫ��
	public int get() {
		if(elements.length==0) {
			throw new RuntimeException("Stack is empty!");
		}
		//ȡ���������һ��Ԫ��
		int element=elements[elements.length-1];
		return element;
	}
	
	//�ж�ջ�Ƿ�Ϊ��
	public boolean isEmpty(){
		return elements.length==0;
	}
}
