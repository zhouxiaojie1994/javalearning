package com.javaleran.test;

import com.javaleran.MyStack;

public class TestMyStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack ms=new MyStack();
		//ѹ������
		ms.push(9);
		ms.push(5);
		ms.push(2);	
		//���ջ��Ԫ��
		int pop1=ms.pop();
		System.out.println(pop1);
		//���ջ��Ԫ��
		int pop2=ms.pop();
		System.out.println(pop2);
		//���ջ��Ԫ��
		int pop3=ms.pop();
		System.out.println(pop3);
		//�鿴ջ��Ԫ��
//		System.out.println(ms.get());
		//�ж�ջ�Ƿ�Ϊ��
		System.out.println(ms.isEmpty());
	}

}
