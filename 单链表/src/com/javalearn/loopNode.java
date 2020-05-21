package com.javalearn;

//一个节点
public class loopNode {
	//节点内容
	int data;
	//下个节点
	loopNode next=this;
	
	public loopNode(int data) {
		this.data=data;
	}
		
	//删除下个节点
	public void removeNext() {
		//获取下下个节点
		loopNode newNext=next.next;
		//下下个节点连接当前节点
		this.next=newNext;
	}
	
	//插入到一个节点
	public void insert(loopNode node) {
		//取出下一个节点，作为下下个节点
		loopNode nextNext=next;
		//把新节点作为当前节点的下个节点
		this.next=node;
		//把下下个节点作为新节点的下个节点
		node.next=nextNext;
	}
	//获取下个节点
	public loopNode next() {
		return this.next;
	}
	
	//获取节点data
	public int getData() {
		return this.data;
	}

}
