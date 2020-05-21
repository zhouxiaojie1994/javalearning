package com.javalearn;

//一个节点
public class Node {
	//节点内容
	int data;
	//下个节点
	Node next;
	
	public Node(int data) {
		this.data=data;
	}
	
	//追加节点
	public Node append(Node node) {
		//当前节点
		Node curNode=this;
		//循环往后找
		while(true) {
			//取出下个节点
			Node nextNode=curNode.next;
			//如果下个节点为null,当前节点为最后一个节点
			if(nextNode==null) {
				break;
			}
			//赋给当前节点
			curNode=nextNode;
		}
		//追加最后一个节点为node
		curNode.next=node;
		return this;
	}
	
	//获取下个节点
	public Node next() {
		return this.next;
	}
	
	//获取节点data
	public int getData() {
		return this.data;
	}
	
	//当前节点是否为最后一个节点
	public boolean isLast() {
		return next==null;
	}
}
