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
	
	
	//删除下个节点
	public void removeNext() {
		//获取下下个节点
		Node newNext=next.next;
		//下下个节点连接当前节点
		this.next=newNext;
	}
	
	//插入到一个节点
	public void insert(Node node) {
		//取出下一个节点，作为下下个节点
		Node nextNext=next;
		//把新节点作为当前节点的下个节点
		this.next=node;
		//把下下个节点作为新节点的下个节点
		node.next=nextNext;
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
	//显示所有节点
	public void show() {
		Node curNode=this;
		while(true) {
			System.out.print(curNode.data+",");
			//获取下个节点
			curNode=curNode.next;
			//如果是最后一个节点
			if(curNode==null) {
				break;
			}
		}
		System.out.println();
	}
}
