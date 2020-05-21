package com.javalearn.test;

import com.javalearn.MyQueue;

public class TestMyQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue mq=new MyQueue();
		//入队
		mq.add(2);
		mq.add(4);
		mq.add(6);
		//出队
		System.out.println(mq.poll());
		mq.add(5);
		System.out.println(mq.poll());
		System.out.println(mq.poll());
		System.out.println(mq.empty());
		System.out.println(mq.poll());
		System.out.println(mq.empty());
	}

}
