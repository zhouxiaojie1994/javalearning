package com.javalearn.test;

import com.javalearn.loopNode;

public class TestLoopNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loopNode n1=new loopNode(1);
		loopNode n2=new loopNode(2);
		loopNode n3=new loopNode(3);
		loopNode n4=new loopNode(4);
		//n1后增加节点n2
		n1.insert(n2);
		n2.insert(n3);
		n3.insert(n4);
		System.out.println(n1.next().getData());
		System.out.println(n2.next().getData());
		System.out.println(n3.next().getData());
		System.out.println(n4.next().getData());
	}

}
