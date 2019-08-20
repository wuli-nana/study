public class MyLinkedList implements List {
    private static class Node {
        private int val;
        private Node next;
        private Node prev;

        private Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }

        private Node(int val, Node prev, Node next) {
            this(val);
            this.prev = prev;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + val +
                    '}';
        }
    }

    /**
     * 记录第一个结点的位置
     */
    private Node head = null;
    /**
     * 记录最后一个结点的位置
     */
    private Node last = null;
    /**
     * 记录链表的长度
     */
    private int size = 0;

    /**
     * 尾插
     * @param element 数据
     * @return true 插入成功，false插入失败
     */
    @Override
    public boolean add(int element) {
        return add(size,element);
    }

    /**
     * 把 element 插入到index 处
     * @param index 下标
     * @param element 数据
     * @return true 插入成功，false插入失败
     */
    @Override
    public boolean add(int index, int element) {
        //检查下标的合法性
        if(index  < 0 || index > size){
            System.out.println("  ");
            return false;
        }
        //2.1 当 index == 0的时候，需要特殊处理
       if(index == 0){
           head= new Node(element,null,head);
           //头插的结点的下一个结点（原头结点）设置前驱,
           // 原来指向null，现在要指向新头结点
           if(head.next != null){
               head.next.prev = head;
           }
           if(size == 0){
               head = last = null;
           }
           size++;
           return true;
       }
       //2.2 当index == size 的时候，需要特殊处理
       if(index == size) {
           last = new Node(element, last, null);
           if (last.prev != null) {
               last.prev.next = last;
           }
           if(size == 0){
               head = last = null;
           }
           size++;
           return true;
       }
       //2.3其他情况
        // 找到 index 位置的结点
        Node node = getNode(index);
        // 当index === 0 的时候，需要特殊处理
        Node newNode = new Node(element,node.prev,node);
        node.prev.next = newNode;
        node.prev = newNode;
        size++;
        return true;
    }

    /**
     * 找到index 位置的结点并返回
     * @param index 下标
     * @return 返回 node
     */
    private Node getNode(int index) {
        int mid = size / 2;
        if (mid > index) {
            Node cur = head;
            for(int i = 0; i < index; i++) {
                cur = cur.next;
            }
            return cur;
        } else {
            Node cur = last;
            for (int i = 0; i < size - index - 1; i++) {
                cur = cur.prev;
            }
            return cur;
        }
    }

    /**
     * 查询 index 所在的 val
     * @param index 下标
     * @return 返回该下标所在的值
     */
    @Override
    public int get(int index) {
        if(index  < 0 || index >size) {
            System.out.println("  ");
            return -1;
        }
        return getNode(index).val;
    }

    /**
     * 替换 index下标所在的值
     * @param index 下标
     * @param val 替换原来 index 下标所在的值
     * @return 返回原来的值
     */
    @Override
    public int set(int index, int val) {
        if(index  < 0 || index >size) {
            System.out.println("  ");
            return -1;
        }
        Node node = getNode(index);
        int oldValue = node.val;
        node.val = val;
        return oldValue;
    }

    /**
     * 删除
     * @param index 下标
     * @return 删除成功返回 0，删除失败返回 -1
     */
    @Override
    public int remove(int index) {
        if(index  < 0 || index >size) {
            System.out.println("  ");
            return -1;
        }
        if(size == 0){
            System.out.println("链表为空，无法删除");
            return -1;
        }
        //头删
        if(index == 0){
            if(head == null){
                return -1;
            }
            if(head.next != null){
                head.prev = null;
            }
            head = head.next;
            size--;
            return 0;
        }
        //尾删
        if(index == size){
            last = last.prev;
            if(last.prev != null){
                last.next = null;
            }
            size--;
            return 0;
        }

        Node node = getNode(index);
        node.next.prev = node.next;
        node.prev.next = node.next;
        size--;
        return 0;
    }

    /**
     * 链表的长度
     * @return size
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * 是否为空
     * @return false 不为空，true 为空
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
