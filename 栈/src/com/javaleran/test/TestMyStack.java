package com.javaleran.test;

import com.javaleran.MyStack;

public class TestMyStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack ms=new MyStack();
		//压入数据
		ms.push(9);
		ms.push(5);
		ms.push(2);	
		//输出栈顶元素
		int pop1=ms.pop();
		System.out.println(pop1);
		//输出栈顶元素
		int pop2=ms.pop();
		System.out.println(pop2);
		//输出栈顶元素
		int pop3=ms.pop();
		System.out.println(pop3);
		//查看栈顶元素
//		System.out.println(ms.get());
		//判断栈是否为空
		System.out.println(ms.isEmpty());
	}

}
