package com.javalearn;

//һ���ڵ�
public class Node {
	//�ڵ�����
	int data;
	//�¸��ڵ�
	Node next;
	
	public Node(int data) {
		this.data=data;
	}
	
	//׷�ӽڵ�
	public Node append(Node node) {
		//��ǰ�ڵ�
		Node curNode=this;
		//ѭ��������
		while(true) {
			//ȡ���¸��ڵ�
			Node nextNode=curNode.next;
			//����¸��ڵ�Ϊnull,��ǰ�ڵ�Ϊ���һ���ڵ�
			if(nextNode==null) {
				break;
			}
			//������ǰ�ڵ�
			curNode=nextNode;
		}
		//׷�����һ���ڵ�Ϊnode
		curNode.next=node;
		return this;
	}
	
	//��ȡ�¸��ڵ�
	public Node next() {
		return this.next;
	}
	
	//��ȡ�ڵ�data
	public int getData() {
		return this.data;
	}
	
	//��ǰ�ڵ��Ƿ�Ϊ���һ���ڵ�
	public boolean isLast() {
		return next==null;
	}
}
