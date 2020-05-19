package com.javaleran;

public class MyStack {
	//栈的底层用数组存储数据
	int[] elements;
	
	public MyStack() {
		elements=new int[0];
	}
	
	//压入元素
	public void push(int element) {
		//创建一个新数组
		int[] arr=new int[elements.length+1];
		//把原数组中的元素复制到新数组中
		for(int i=0;i<elements.length;i++) {
			arr[i]=elements[i];
		}
		//把新元素添加到数组最后
		arr[elements.length]=element;
		//用新数组替换旧数组
		elements=arr;
	}
	
	//取出栈顶元素
	public int pop() {
		if(elements.length==0) {
			throw new RuntimeException("Stack is empty!");
		}
		//取出数组的最后一个元素
		int element=elements[elements.length-1];
		//创建一个新数组
		int[] newarr=new int[elements.length-1];
		//剩余元素都放入新数组中
		for(int i=0;i<newarr.length;i++) {
			newarr[i]=elements[i];
		}
		//替换数组
		elements=newarr;
		//返回栈顶元素
		return element;
	}
	
	//查看栈顶元素
	public int get() {
		if(elements.length==0) {
			throw new RuntimeException("Stack is empty!");
		}
		//取出数组最后一个元素
		int element=elements[elements.length-1];
		return element;
	}
	
	//判断栈是否为空
	public boolean isEmpty(){
		return elements.length==0;
	}
}
