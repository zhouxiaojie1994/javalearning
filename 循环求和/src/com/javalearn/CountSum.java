package com.javalearn;

public class CountSum {
	//while��100-200�ۼӺ�
	public int WhileSum() {
		int a=100;
		int sum=0;
		while(a<=200) {
			sum=a+sum;
			a++;
		}
		return sum;
	}

	//do...while��100-200�ۼӺ�
	public int DoWhileSum() {
		int a=100;
		int sum=0;
		do {
			sum=a+sum;
			a++;
		}while(a<=200);
		return sum;
	}
	
	//forѭ����100-200�ۼӺ�
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
		System.out.println("whileѭ�����100-200�ۼӺ�Ϊ��"+WhileSum);
		int DoWhileSum=sum.DoWhileSum();
		System.out.println("do...whileѭ�����100-200�ۼӺ�Ϊ��"+DoWhileSum);
		int ForSum=sum.ForSum();
		System.out.println("forѭ�����100-200�ۼӺ�Ϊ��"+ForSum);
	}

}
