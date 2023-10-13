public class SinglyLinkedListTest {

    public static void main(String[] args) {
        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(3);
        list1.addLast(4);

        // list1.remove(2);
        for (Integer value : list1) {
            System.out.println(value);
        }

        System.out.println("=========2");
        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.addLast(1);
        list2.addLast(2);
        list2.addLast(3);
        list2.addLast(4);

        System.out.println(list2.get(2));

        // for (Integer value : list2) {
        // System.out.println(value);
        // }

        // System.out.println("=========");
        // SinglyLinkedList list3 = new SinglyLinkedList();
        // list3.addLast(1);
        // list3.addLast(2);
        // list3.addLast(3);
        // list3.addLast(4);

        // System.out.println(list2.get(10));

        // for (Integer value : list3) {
        // System.out.println(value);
        // }

        System.out.println("=========");
        SinglyLinkedList list4 = new SinglyLinkedList();
        list4.addLast(1); // 0
        list4.addLast(2); // 1
        list4.addLast(3); // 2
        list4.addLast(4); // 3

        list4.insert(0, 5); // 头部
        // list4.insert(2,5); // 中间
        // list4.insert(4,5); // 尾部
        // list4.insert(5,5); // 非法

        list4.addFirst(7); // 测addFirst

        for (Integer value : list4) {
            System.out.println(value);
        }

        System.out.println("=========5");
        SinglyLinkedList list5 = new SinglyLinkedList();

        list5.addFirst(7); // 测addFirst

        for (Integer value : list5) {
            System.out.println(value);
        }

        System.out.println("=========6");
        SinglyLinkedList list6 = new SinglyLinkedList();
        list6.addLast(1);
        list6.addLast(2);
        list6.addLast(3);
        list6.addLast(4);

        list6.removeFirst(); //一个
        list6.removeFirst(); //
        list6.removeFirst(); // 
        list6.removeFirst(); // 删最后一个
        // list6.removeFirst(); // 删没不能再删, 报错

        for (Integer value : list6) {
            System.out.println(value);
        }

    }

}
