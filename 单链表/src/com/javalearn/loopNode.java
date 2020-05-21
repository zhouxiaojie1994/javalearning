package com.javalearn;

//һ���ڵ�
public class loopNode {
	//�ڵ�����
	int data;
	//�¸��ڵ�
	loopNode next=this;
	
	public loopNode(int data) {
		this.data=data;
	}
		
	//ɾ���¸��ڵ�
	public void removeNext() {
		//��ȡ���¸��ڵ�
		loopNode newNext=next.next;
		//���¸��ڵ����ӵ�ǰ�ڵ�
		this.next=newNext;
	}
	
	//���뵽һ���ڵ�
	public void insert(loopNode node) {
		//ȡ����һ���ڵ㣬��Ϊ���¸��ڵ�
		loopNode nextNext=next;
		//���½ڵ���Ϊ��ǰ�ڵ���¸��ڵ�
		this.next=node;
		//�����¸��ڵ���Ϊ�½ڵ���¸��ڵ�
		node.next=nextNext;
	}
	//��ȡ�¸��ڵ�
	public loopNode next() {
		return this.next;
	}
	
	//��ȡ�ڵ�data
	public int getData() {
		return this.data;
	}

}
