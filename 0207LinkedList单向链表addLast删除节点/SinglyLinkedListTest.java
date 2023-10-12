public class SinglyLinkedListTest {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        // list.testindex();

        // System.out.println(list.get(2));
        // System.out.println(list.get(10));

        // list.insert(2, 7);
        // for (Integer value : list) {
        // System.out.println(value);
        // }

        // list.insert(4, 7);
        // for (Integer value : list) {
        // System.out.println(value);
        // }

        // list.insert(5, 7);
        // for (Integer value : list) {
        // System.out.println(value);
        // }

        // list.insert(0, 7);
        // for (Integer value : list) {
        // System.out.println(value);
        // }

        list.removeFirst();
        for (Integer value : list) {
            System.out.println(value);
        }

        System.out.println("==========");
        list.removeFirst();
        for (Integer value : list) {
            System.out.println(value);
        }

        System.out.println("==========");
        list.removeFirst();
        for (Integer value : list) {
            System.out.println(value);
        }

        System.out.println("==========");
        list.removeFirst();
        for (Integer value : list) {
            System.out.println(value);
        }

        System.out.println("==========");
        list.removeFirst();
        for (Integer value : list) {
            System.out.println(value);
        }
    }

}
