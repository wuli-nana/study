class Node{
	public int val;
	public Node next = null;
	
	public Node (int val){
		this.val = val;
	}
}

public class Solution{
	//打印链表
	public static void display(Node head){
		Node cur = head;
		while(cur != null){
			System.out.printf("%d-->",cur.val);
			cur = cur.next;
		}
		System.out.println("null");
	}
	
	//寻找last
	public static Node GetLast(Node head){
		Node last = head;
		while(last.next != null){
			last = last.next;
		}
		return last;
	}
	
	//寻找last的上一个结点
	public static Node GetLast_1(Node head){
		Node last_1 = head;
		while(last_1.next.next != null){
			last_1 = last_1.next;
		}
		return last_1;
	}
	
	//头插
	public static Node pushFront(Node head, int val){
		Node node = new Node(val);
		node.next = head;
		return node;
	}
	
	//尾插
	public static Node pushBack(Node head, int val){
		if(head == null){
			Node node = new Node(val);
			node.next = head;
			return node;
		}else{
			Node node = new Node(val);
			Node last = GetLast(head);
			last.next = node;
			node.next = null;	
		}
		return head;
	}
	
	//头删
	public static Node popFront(Node head){
		if(head == null){
			System.out.println("链表为空");
			return null;
		}else{
			Node cur = head;
			head = cur.next;
		}
		return head;
	}
	
	//尾删
	public static Node popBack(Node head){
		if(head == null){
			System.out.println("链表为空");
			return null;
		}
		
		if(head.next == null){
			return null;
		}
		else{
			Node last_1 = GetLast_1(head);
			last_1.next = null;
			return head;
		}
	}
	public static void main(String[] args){
		Node head = null;	// 表示 head 指向的链表是空链表
		head = pushBack(head, 1);
		head = pushBack(head, 2);
		head = pushBack(head, 3);
		display(head);
		//1-->2-->3-->null
		head = popBack(head);
		head = pushBack(head,4);
		display(head);
		//1-->2-->4-->null
		head = pushFront(head, 10);
		head = pushFront(head, 20);
		head = pushFront(head, 30);
		display(head);
		//30-->20-->10-->1-->2-->4-->null
		head = popFront(head);
		head = popBack(head);
		display(head);
		//20-->10-->1-->2-->null
		head = popBack(head);
		display(head);
		//20-->10-->1-->null
	}
}