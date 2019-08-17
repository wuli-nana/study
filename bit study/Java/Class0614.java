
              class ListNode 
{
	public int value;
	public listNode next;
	
	public ListNode (int value)
	{
		this.value = value;
		this.next = null;
	}
}
public class Class04
{
	/*public ListNode FindeTheK1(ListNode head, int k)
	{
		int length ;
		ListNode cur = head;
		while(cur.next != null)
		{
			length++;
			cur = cur.next;
		}
		if(k > length )
		{
			return null;
		}
		int n = length - k;
		ListNode theK = head;
		for(int i; i < n; i++)
		{
			theK = theK.next;
		}
		return theK;
	}
	public ListNode FindTheK2(ListNode head, int k)
	{
		ListNode fast = head;
		ListNode slow = head;
		
		for(int i = 0;i < k; i++)
		{
			if(fast == null)
			{
				return null;
			}
			fast = fast.next;
		}
		while(fast != null)
		{
			fast = fast.next;
			slow = slow.next;
		}
		return slow
	}
	public ListNode FindMid(ListNode head)
	{
		ListNode fast = head;
		ListNode slow = head;
		
		while(fast != null)
		{
			fast = fast.next;
			if(fast == null)
			{
				return slow;
			}
			slow = solw.next;
			fast = fast.next;
		}
		return null;
	}
	*/
	
	public ListNode partition (ListNode head， int x)
	{
		ListNode cur = head;
		
		ListNode small = null;
		ListNode smallLast = null;
		
		ListNode big = null;
		ListNode bigLast = null;
		while(cur.next != null)
		{
			if(cur.value < x)
			{
				if(small == null)
				{
					small = cur;
				}
				else
				{
					smallLast.next = cur;
				}
				cur = smallLast;
			}
			else
			{
				if(big == null)
				{
					big = cur;
				}
				else
				{
					bigLast.next = cur;
				}
				cur = biglast;
			}
			cur = cur.next
		}
		//注意
		if(small == null)
		{
			return big;
		}
		else
		{
			//需要保证最后一链表为空
			smallLast.next = big;
			if(bigLast != null)
			{
				bigLast = null;
			}
			return small;
		}
	}
	
	//
	public listNode deleteDuplication(ListNode phead)
	{
		if(phead == null)
		{
			return null
		}
		ListNode prev = new ListNode(0);
		prev.next =phead;
		ListNode p1 = phead;
		ListNode p2 = phead.next;
		
		while(p2 != null)
		{
			if(pi.value != p2.value)
			{
				prev = p1;
				p1 = p1.next;
				p2 = p2.next;	
			}
			else
			{
				while (p2 != null && p1.value == p2.value)
				{
					p2 = p2.next
				}
				
				prev.next = p2;
				p1 = p2;
				if(p2 ！= null)
				{
					p1 = p2.next;
				}
				
			}
			
		}
		return fast.next;
	}
	
	public static void main( String[] args)
	{
		
		
	}
}