package com.javalearn.test;

import com.javalearn.Node;

public class TestNode {
	public static void main(String[] args) {
		//创建节点
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		//追加节点
		n1.append(n2).append(n3).append(new Node(4));
		//取出下个节点的数据
		System.out.println(n1.next().next().next().getData());
		//判断是否为最后一个节点
		System.out.println(n1.next().next().isLast());
	}
	
}
