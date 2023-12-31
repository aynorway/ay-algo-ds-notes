public class DoublyLinkedListSentinel implements Iterable<Integer> {
    // prev指针, value值, next指针, 找到
    static class Node {
        Node prev;
        int value;
        Node next;

        public Node(Node prev, int value, Node next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }
    }

    // 头哨兵, 尾哨兵
    private Node head;
    private Node tail;

    public DoublyLinkedListSentinel() {
        head = new Node(null, 666, null);
        tail = new Node(null, 888, null);
        head.next = tail;
        tail.prev = head;

    }

    // 工具方法, 根据索引找节点
    private Node findNode(int index) {
        int i = -1;
        for (Node p = head; p != tail; p = p.next, i++) {
            if (i == index) {
                return p;
            }
        }
        return null;
    }

    public void addFirst(int value) {

    }

    public void addLast(int value){
        Node last = tail.prev; 
        Node added = new Node (last, value, tail);
        last.next = added; 
        tail.prev = added;
    }

    public void removeLast(){
        Node removed = tail.prev;
        if (removed == head) {
            throw illegalIndex(0);
        }
        Node prev = removed.prev;
        prev.next = tail;
        tail.prev = prev;

        // 特殊情况 
        // 没有元素的时候不能删除 
    }

    public void instert(int index, int value) {
        Node prev = findNode(index - 1);
        if (prev == null) {
            throw illegalIndex(index);
        }
        Node next = prev.next;
        Node inserted = new Node(prev, value, next);
        prev.next = inserted;
        next.prev = inserted;

    }

    public void remove (int index) {
        Node prev = findNode (index -1); 
        if (prev == null) {
            throw illegalIndex(index);
        }
        Node removed = prev.next; 
        if (removed == tail) {
            throw illegalIndex(index);
        }
        Node next = removed.next;

        prev.next = next; 
        next.prev = prev; 
    }

    private IllegalArgumentException illegalIndex(int index) {
        return new IllegalArgumentException(String.format("index [%d] 不合法%n", index));
    }

    public Iterator<Iterator> iterator (){
        return new Iterator<Integer> (){
            Node p = head.next; 

            public boolean hasNext(){
                return p != tail; 
            }

            public Integer next (){
                int value = p.value; 
                p = p.next; 
                return value;
            }
        };
    }
}