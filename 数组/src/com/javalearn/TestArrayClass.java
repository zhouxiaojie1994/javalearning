package com.javalearn;

import java.util.Arrays;

public class TestArrayClass {
	private int[] elements;//任意类型的数组用object声明
	public void OpArrays() {
		elements=new int[0];
	}

	//获取数组长度
	public int size() {
		return elements.length;
	}
	
	//在数组中添加元素
	public void add(int e,int l) {
		int[] arr1=new int[elements.length+1];
		if(l>=arr1.length||l<0) {
			System.out.println("超出数组长度范围！");
		}
		else {
			for(int i=0;i<elements.length;i++) {
				if(i<l) {
					arr1[i]=elements[i];
				}
				else if(i==l) {
					arr1[i]=e;
				}
				else {
					arr1[i+1]=elements[i];
				}
			}
			elements=arr1;
			System.out.println("插入后的数组为："+elements);
		}
	}
	
	//删除一个元素
	public void delete(int index) {
		if(index<0||index>elements.length-1 ) {
			throw new RuntimeException("下标越界！");
		}
		//创建新数组，长度-1
		int[] newarr=new int[elements.length-1];
		for(int i=0;i<newarr.length;i++) {
			if(i<index) {
				newarr[i]=elements[i];
			}
			else {
				newarr[i]=elements[i+1];
			}
			elements=newarr;
		}
	}
	
	//获取元素
	public int getelement(int index) {
		int element=elements[index];
		return element;
	}
	
	
	//展示数组中的元素
	public void show() {
		System.out.println(Arrays.toString(elements ));
	}
	
	//替换指定位置元素
	public void set(int index,int num) {
		if(index<0||index>elements.length-1 ) {
			throw new RuntimeException("下标越界！");
		}
		elements[index]=num;
	}

}
