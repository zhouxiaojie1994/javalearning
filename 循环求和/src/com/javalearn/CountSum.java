package com.javalearn;

public class CountSum {
	//while求100-200累加和
	public int WhileSum() {
		int a=100;
		int sum=0;
		while(a<=200) {
			sum=a+sum;
			a++;
		}
		return sum;
	}

	//do...while求100-200累加和
	public int DoWhileSum() {
		int a=100;
		int sum=0;
		do {
			sum=a+sum;
			a++;
		}while(a<=200);
		return sum;
	}
	
	//for循环求100-200累加和
	public int ForSum() {
		int sum=0;
		for(int a=100;a<=200;a++) {
			sum=a+sum;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountSum sum=new CountSum();
		int WhileSum=sum.WhileSum();
		System.out.println("while循环求得100-200累加和为："+WhileSum);
		int DoWhileSum=sum.DoWhileSum();
		System.out.println("do...while循环求得100-200累加和为："+DoWhileSum);
		int ForSum=sum.ForSum();
		System.out.println("for循环求得100-200累加和为："+ForSum);
	}

}
