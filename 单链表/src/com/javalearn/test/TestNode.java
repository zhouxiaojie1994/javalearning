package com.javalearn.test;

import com.javalearn.Node;

public class TestNode {
	public static void main(String[] args) {
		//�����ڵ�
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		//׷�ӽڵ�
		n1.append(n2).append(n3).append(new Node(4));
		//ȡ���¸��ڵ������
//		System.out.println(n1.next().next().next().getData());
		//�ж��Ƿ�Ϊ���һ���ڵ�
//		System.out.println(n1.next().next().isLast());
		//��ʾ���Խڵ���Ϣ
		n1.show();
		//ɾ��һ���ڵ�
		//n1.removeNext();
		//n1.show();
		
		//��n1�ڵ�����һ���½ڵ�
		Node node=new Node(5);
		n1.insert(node);
		n1.show();
	}
	
}
