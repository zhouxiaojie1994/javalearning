package com.javalearn;

public class TestHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hanoi(5,'A','B','C');
	}
	
	//汉诺塔牌
	
	/**
	 * @param n:n个盘子
	 * @param form：开始的柱子
	 * @param in：中间的柱子
	 * @param to：目标柱子
	 */
	public static void hanoi(int n,char from,char in,char to) {
		//只有一个盘子
		if(n==1) {
			System.out.println("第1个盘子从"+from+"移到"+to);
		}
		//有多个盘子
		else {
			//移动上面所有的盘子到中间位置
			hanoi(n-1,from,to,in);
			//移动下面的盘子
			System.out.println("第"+n+"个盘子从"+from+"移到"+to);
			//把上面的所有盘子移到目标位置
			hanoi(n-1,in,from,to);
		}
	}

}
