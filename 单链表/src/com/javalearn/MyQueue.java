package com.javalearn;

public class MyQueue {
	//初始化
	int[] elements;
	public MyQueue() {
		elements=new int[0];
	}
	
	//入队
	public void add(int element) {
		int[] arr=new int[elements.length+1];
		for(int i=0;i<elements.length;i++) {
			arr[i]=elements[i];
		}
		arr[arr.length-1]=element;
		
		elements=arr;
	}
	
	//出队
	public int poll() {
		if(elements.length==0) {
			throw new RuntimeException("Queue is empty!");
		}
		//创建新数组，长度-1
		int[] newarr=new int[elements.length-1];
		//新数组赋值，从第二个元素开始
		for(int i=1;i<elements.length;i++) {
			newarr[i-1]=elements[i];
		}
		//取出数组队头元素
		int element=elements[0];
		//替换数组
		elements=newarr;
		return element;
	}
	
	//判断队列是否为空
	public boolean empty() {
		return elements.length==0;
	}

}
