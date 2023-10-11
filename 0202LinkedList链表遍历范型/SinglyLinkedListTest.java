public class SinglyLinkedListTest {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.addFrist(1);
        list.addFrist(2);
        list.addFrist(3);
        list.addFrist(4);

        for (Integer value : list) {
            System.out.println(value);
        }
        // 迭代器这个, ......................
    }

}
