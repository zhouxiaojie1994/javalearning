package com.javalearn;

public class TestRecurslve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(10);
		
	}
	//�ݹ�
	public static void print(int i) {
		if(i>=0) {
			System.out.println(i);
			print(i-1);
		}
		
	}

}
