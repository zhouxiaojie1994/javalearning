package com.javalearn;

import java.util.Arrays;

public class TestArrayClass {
	private int[] elements;//�������͵�������object����
	public void OpArrays() {
		elements=new int[0];
	}

	//��ȡ���鳤��
	public int size() {
		return elements.length;
	}
	
	//�����������Ԫ��
	public void add(int e,int l) {
		int[] arr1=new int[elements.length+1];
		if(l>=arr1.length||l<0) {
			System.out.println("�������鳤�ȷ�Χ��");
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
			System.out.println("����������Ϊ��"+elements);
		}
	}
	
	//ɾ��һ��Ԫ��
	public void delete(int index) {
		if(index<0||index>elements.length-1 ) {
			throw new RuntimeException("�±�Խ�磡");
		}
		//���������飬����-1
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
	
	//��ȡԪ��
	public int getelement(int index) {
		int element=elements[index];
		return element;
	}
	
	
	//չʾ�����е�Ԫ��
	public void show() {
		System.out.println(Arrays.toString(elements ));
	}
	
	//�滻ָ��λ��Ԫ��
	public void set(int index,int num) {
		if(index<0||index>elements.length-1 ) {
			throw new RuntimeException("�±�Խ�磡");
		}
		elements[index]=num;
	}

}
