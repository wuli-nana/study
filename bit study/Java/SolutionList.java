class ListNode{
	public int val ;
	public ListNode next;
	public ListNode(int val){
		this.val = val;
	}
	
}
public class SolutionList{
	
	//创建一个链表 1-->2-->3-->4-->5-->null
	public static ListNode createLinkedList() {
		ListNode n1 = new ListNode(1);	// 首结点（头结点）
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(4);
		ListNode n6 = new ListNode(3);
		ListNode n7 = new ListNode(2);
		ListNode n8 = new ListNode(1);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		n8.next =null;
		
		return n1;
	}
	public static void displayList(ListNode head){
		ListNode cur = head;
		while(cur != null){
			System.out.printf(cur.val+" --> ");
			cur = cur.next;
		}
		System.out.println("null");
	}
	//逆置链表
	public static ListNode reverse( ListNode head){
		ListNode cur = head;
		ListNode rhead = head; 
		while(cur.next != null){
			ListNode next = cur.next;
			
			cur.next = rhead;
			rhead = cur;
			
			cur = next;
		}
		return rhead;
	}
	//寻找中间结点
		public static ListNode getMid(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        
        while (fast != null) {
            fast = fast.next;
            if (fast == null) {
                break;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
		
    }
	//
	public static ListNode deleteDup(ListNode pHead){
		if(pHead == null){
			return null;
		}
		ListNode prev = new ListNode(0);
		prev.next = pHead ;
		ListNode fake = prev;
		ListNode p1 = pHead;
		ListNode p2 = pHead.next;
		
		while (p2 != null){
			if(p1.val != p2.val){
				prev = p1;
				p1 = p1.next;
				p2 = p2.next;
			}else{
				while(p2 != null && p2.val == p1.val){
					p2 = p2.next;
				}
				//删除结点
				prev.next = p2;
				p1 = p2;
				if(p2 != null){
					p2 = p2.next;
				}
			}
		}
		return fake.next;
	}
	//判断链表是否为回文链表
	public static boolean chkPalindrome(ListNode pHead){
		ListNode mid = getMid(pHead);
		ListNode h2 = reverse(mid);

        ListNode n1 = pHead;
        ListNode n2 = h2;
        while (n1 != null && n2 != null) {
            if (n1.val != n2.val) {
                return false;
            }
            
            n1 = n1.next;
            n2 = n2.next;
        }
        
        return true;
	}
	public static void main(String[] args){
		ListNode head = createLinkedList();
		displayList(head);
		
		displayList(getMid(head));
		deleteDup(head);
		displayList(head);
		
		System.out.println(chkPalindrome(head));
		
	}
	
}