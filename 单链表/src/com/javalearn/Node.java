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
	
	
	//ɾ���¸��ڵ�
	public void removeNext() {
		//��ȡ���¸��ڵ�
		Node newNext=next.next;
		//���¸��ڵ����ӵ�ǰ�ڵ�
		this.next=newNext;
	}
	
	//���뵽һ���ڵ�
	public void insert(Node node) {
		//ȡ����һ���ڵ㣬��Ϊ���¸��ڵ�
		Node nextNext=next;
		//���½ڵ���Ϊ��ǰ�ڵ���¸��ڵ�
		this.next=node;
		//�����¸��ڵ���Ϊ�½ڵ���¸��ڵ�
		node.next=nextNext;
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
	//��ʾ���нڵ�
	public void show() {
		Node curNode=this;
		while(true) {
			System.out.print(curNode.data+",");
			//��ȡ�¸��ڵ�
			curNode=curNode.next;
			//��������һ���ڵ�
			if(curNode==null) {
				break;
			}
		}
		System.out.println();
	}
}
