class Node
{
	int val;
	Node random；
	Node next;
	
}


Node copyRandomList(Node head)
{
	Node cur = head;
	while(cur != null)
	{
		Node node = new Node (cur.val);
		
		node.next = cur.next;
		cur.next = node;
		//cur.next已经改变
		cur = cur.next.next;
	}
	
	cur = head;
	while(cur != null)
	{
		if(cur.random != null)
		{
			cur.next.random = cur.random.next;
		}
		else
		{
			cur.next.random = null;
		}
		
		cur = cur.next.next;	
	}
	
	cur = head;
	
	while(cur != null)
	{
		Node node = cur.next;
		
		cur.next = node.next;
		if(node != null)
		{
			node.next =node.next.next;
		}
		else
		{
			node.next = null;
		}
		
		cur = cur.next.next;
		
	}
	
	
	
	
	Node deleteDuplicated(Node pHead)
	{
		if(pHead == null)
		{
			return null;
		}
		Node prev = null;
		Node p1 = pHead;
		Node p2 = pHead.next;
		
		while(p2 != null)
		{
			if(p1.val != p2.val)
			{
				prev = p1;
				p1 = p1.next;
				p2 = p2.next;
			}
			else
			{
				while(p2 != null && p2.val == p1.val)
				{
					p2 = p2.next;
					
				}
				//删除[p1,p2)之间的结点
				//1.如果一开始就相等的话，即prev = null，直接将头结点给p2.
				if(prev == null)
				{
					phead = p2;
				}
				else
				{
					prev = p2;
				}
				//p2 为空时
				if(p2 == null)
				{
					p1 = p2;
				}
				else
				{
					p2 = p2.next;
				}
			}
		}
		return pHead;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}