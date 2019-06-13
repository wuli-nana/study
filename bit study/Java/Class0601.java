
class Node 
{
	public int value;
	public Node next;
	
	public Node (int value)
	{
		this.value = value;
		this.next = null;
	}
}
public class Class0601
{
	
	//打印结点
	public static void displayLinkedList(Node head)
	{
		for(Node cur = head; cur != null; cur = cur.next)
		{
			System.out.printf("(%d)-->",cur.value);
		}
		System.out.println("null");
	}
	
	
	
	public static Node createLinkedList()
	{
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = null;
		
		return n1;
	}


	//头插
	/*
	public static Node pushFront (Node head, int value)
	{
		Node newNode = new Node (value);
		newNode.next = head;
		head = newNode;
		
		return head;
		
	}
	
	
	//尾插
	public  static Node pushBack(Node head,int value)
	{
		Node newNode = new Node(value);
		
		Node last = getLast(head);
		
		last.next = newNode;
		
		return head;
	}

	//寻找结点
	public static Node getLast(Node head)
	{
		Node cur = head;
		while (cur.next != null)
		{
				cur = cur.next;
		}
		return cur;
	}
	*/
	
	
	//头插
	public static Node pushFront(Node head ,int value)
	{
		Node newNode = new Node(value) ;
		
		newNode.next = head;
		
		head = newNode;
		
		return head;
		
	}
	//尾插
	public static Node pushBack (Node head, int value)
	{
		Node newNode = new Node(value)
		if(head == null)
		{
			node.next = head;
			return head;
		}
		
		else
		{
			node.last = getLast()
			node.last = newNode ;
			return head;
		}
		
		
	}
	public static Node getlast()
	{
		Node.cur = head;
		while(cur.next != null)
		{
			cur =cur.next;
		}
		
		return cur; 
	}


	
	
	
	public static void main (String[] args)
	{
		Node head = createLinkedList();
		displayLinkedList(head);
		head = pushFront (head, 100);
		displayLinkedList(head);
		
		
		
		
		
	}

} 