package com.javalearn;
import java.math.*;;

public class NarcissusNum {

	public void  NumReturn() {
		for(int m=100;m<1000;m++) {
			int a=m/100;
			int b=(m-a*100)/10;
			int c=m-a*100-b*10;
			if(Math.pow(a, 3)+Math.pow(b, 3)+Math.pow(c, 3)==m)
				System.out.println(m+',');		
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("100-1000֮���ˮ�ɻ���");
		NarcissusNum num=new NarcissusNum();
		System.out.println("ˮ�ɻ����У�");	
		num.NumReturn();
		
		}

	}


