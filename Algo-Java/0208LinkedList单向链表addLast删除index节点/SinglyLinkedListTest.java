public class SinglyLinkedListTest {

    public static void main(String[] args) {
        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(3);
        list1.addLast(4);

        list1.remove(2);
        for (Integer value : list1) {
            System.out.println(value);
        }

        System.out.println("=========");
        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.addLast(1);
        list2.addLast(2);
        list2.addLast(3);
        list2.addLast(4);

        list2.remove(0);
        for (Integer value : list2) {
            System.out.println(value);
        }

        // System.out.println("=========");
        // SinglyLinkedList list3 = new SinglyLinkedList();
        // list3.addLast(1);
        // list3.addLast(2);
        // list3.addLast(3);
        // list3.addLast(4);

        // list3.remove(5);
        // for (Integer value : list3) {
        //     System.out.println(value);
        // }

        System.out.println("=========");
        SinglyLinkedList list4 = new SinglyLinkedList();
        list4.addLast(1); // 0
        list4.addLast(2); // 1
        list4.addLast(3); // 2
        list4.addLast(4); // 3

        list4.remove(4); // 不存在4 应该也报出非法 
        for (Integer value : list4) {
            System.out.println(value);
        }

    }

}
