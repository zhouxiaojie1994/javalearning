package com.javalearn;
import java.util.Scanner;

public class DivisionWith357 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������Ҫ�����������");
		Scanner in=new Scanner(System.in);
		while(in.hasNext()) {
			int m=in.nextInt();
			if( m%3==0&&m%5==0&&m%7==0) {
				System.out.println(m+"���Ա�3,5,7ͬʱ������");
				System.out.println("������Ҫ�����������");
			}
			else {
				System.out.println(m+"�����Ա�3,5,7ͬʱ������");
				System.out.println("������Ҫ�����������");
			}
		}
	}

}
