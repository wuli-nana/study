import java.util.HashMap;
import java.util.Map;

public class quset2 {
    public static class Node{
        int val;
        Node next;
        Node random;
    }

    /**
     * 链表复制，老方法
     * @param head 头结点
     * @return 返回头结点
     */

    public static Node copyNode(Node head) {
        Node cur = head;
        //复制链表的val与next
        // 并将cur.next指向pev，pev.next指向cur
        while (cur != null) {
            Node pev = new Node();
            pev.val = cur.val;
            pev.next = cur.next;

            cur.next = pev;
            cur = pev.next;
        }
        cur = head;
        //复制random
        while (cur != null) {
            Node pev = cur.next;
            if (cur.random != null) {
                pev.random = cur.random.next;
            } else {
                pev.random = null;
            }
            cur = pev.next;
        }
        return head;
    }

    /**
     * 用Map的形式来进行复制链表
     * @param head 头结点
     * @return 头结点
     */
    public static Node copyNode2(Node head){
        Node cur= head;
        Node result = null;
        Node last = null;
        Map<Node,Node> map = new HashMap<>();
        //复制链表的val与next
        while(cur != null){
            Node pev = new Node();
            pev.val = cur.val;

            if(result == null){
                result = pev;
            }
            else{
                last.next = pev;
            }
            last = pev;
            map.put(cur,pev);
            cur = cur.next;
        }

        cur = head;
        Node pev = result;
        //复制链表的random
        while(cur != null){
            pev.random = map.get(cur.random);
            cur = cur.next;
            pev = pev.next;
        }
        return result;
    }
}

