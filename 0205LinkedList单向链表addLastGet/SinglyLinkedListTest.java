public class SinglyLinkedListTest {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        list.testindex();

        System.out.println(list.get(2)); 
        System.out.println(list.get(10)); 
    }

}
