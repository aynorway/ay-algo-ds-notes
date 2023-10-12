public class SinglyLinkedListTest {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        list.loop1(value -> {
            System.out.println(value);
        });
        list.loop2(value -> {
            System.out.println(value);
        });
    }

}
