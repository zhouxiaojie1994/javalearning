package com.javalearn;
import java.util.Scanner;

public class DivisionWith357 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入要计算的整数：");
		Scanner in=new Scanner(System.in);
		while(in.hasNext()) {
			int m=in.nextInt();
			if( m%3==0&&m%5==0&&m%7==0) {
				System.out.println(m+"可以被3,5,7同时整除。");
				System.out.println("请输入要计算的整数：");
			}
			else {
				System.out.println(m+"不可以被3,5,7同时整除。");
				System.out.println("请输入要计算的整数：");
			}
		}
	}

}
