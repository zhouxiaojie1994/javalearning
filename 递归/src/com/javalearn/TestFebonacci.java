package com.javalearn;

public class TestFebonacci {

	public static void main(String[] args) {
		// ì³²¨ÄÇÆõÊıÁĞ£º1,1,2,3,5,8...
		TestFebonacci m=new TestFebonacci();
		System.out.println(m.add(1));
		System.out.println(m.add(2));
		System.out.println(m.add(3));
		System.out.println(m.add(4));
		System.out.println(m.add(5));
		System.out.println(m.add(6));
		System.out.println(m.add(7));
		System.out.println(m.add(8));
		System.out.println(m.add(9));

	}
	public int add(int n) {
		if(n==1||n==2) {
			return 1;
		}
		else {
			return add(n-1)+add(n-2);
		}
	}

}
