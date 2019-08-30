public class Main {
    private static void testList(List list) {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.get(2));
        System.out.println(list);
        list.set(2, 100);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.remove(0);
        list.remove(2);
        list.remove(0);
        list.remove(0);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
    }

    public static void main(String[] args) {
        MyArrayList arrayList = new MyArrayList();
        MyLinkedList linkedList = new MyLinkedList();
        testList(arrayList);
        testList(linkedList);
    }

}

