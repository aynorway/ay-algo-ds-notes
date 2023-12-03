import java.util.Iterator;
import java.util.function.Consumer;

// 单向链表 head指针 Node[value值 next指针] 
public class SinglyLinkedList implements Iterable<Integer> { // 整体
    private Node head = null; // 头 指针

    // 节点类
    // 做成了一个内部类, 对外隐藏实现的细节, 对外暴漏越少越好
    private static class Node {
        int value; // 值
        Node next; // 下一个节点指针

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    // 关于内部类, 加不加static. 如果与外部变量没有关系, 就是static, 必须用到外面的成员变量的时候, 就不加static了.

    public void addFrist(int value) {
        if (head == null) {
            // 1. 链表为空
            head = new Node(value, null);
        } else {
            // 2. 链表非空
            head = new Node(value, head); // 新节点有了，并指向之前的头节点
        }
    }

    // 遍历链表

    // public void loop() {
    // Node p = head;
    // while (p != null) {
    // System.out.println(p.value);
    // p = p.next;

    // }
    // }

    // 用consumer, 当参数, 要执行的操作从外界传递进来
    public void loop1(Consumer<Integer> consumer) {
        Node p = head;
        while (p != null) {
            consumer.accept(p.value);
            p = p.next;

        }
    }

    public void loop2(Consumer<Integer> consumer) {
        for (Node p = head; p != null; p = p.next) {
            consumer.accept(p.value);
        }
    }
    // 都要求掌握

    // 第三种 迭代器 范型
    @Override
    public Iterator<Integer> iterator() { 
        // 被称之 匿名内部类 转换成 带名字的 内部类 // 点击下面Iterator 然后 convert anonymous to inner... 
        // 这样就转换一个内部类 
        return new Iterator<Integer>() {
            Node p = head; // 初始值 指向头节点

            @Override
            public boolean hasNext() { // 是否有下一个元素
                return p != null;
            }

            @Override
            public Integer next() { // 返回当前值, 并且指向下一个元素
                int v = p.value; // 拿到当前值
                p = p.next; // 指向下一个元素
                return v;
            }
        };

    }

    // 第四种 递归遍历

}

// 概述

// 链表 不知道位置 O(n), 数越多, 时间越多
// 插入同于删除的 O(): 起始位置插入 O(1); 结束位置, 知道tail节点是O(1), 不知道是O(n); 中间位置, 就是O(n)
// 根据index查找时间+O(1)
// 不连续 , 不同于数组 (地址可以计算, O(1))

// 单向链表 只知道下一个元素

// 双向链表 知道上一个,下一个元素

// 循环链表 tail 指向 head

// 特殊节点, 哨兵节点 sentinel, 或哑元节点 dummy 不存储数据, 用作头尾, 简化边界判断

//