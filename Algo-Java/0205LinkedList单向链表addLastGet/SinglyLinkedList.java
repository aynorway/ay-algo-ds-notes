import java.util.function.Consumer;

// head --》 value p --》 value p --》 null
// addFirst()

public class SinglyLinkedList { // 整体

    private Node head = null; // 头 指针

    // 节点类
    // 内部类, 对外隐藏实现的细节, 对外暴漏越少越好
    private static class Node {
        int value; // 值
        Node next; // 下一个节点指针

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // 向头部添加
    // para: value 带添加值
    public void addFirst(int value) {
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

    // 第四种 递归

    // addLast()
    // 最后一个节点不是已知的 , 所以先找到 , 再添加
    private Node findLast() { // 做一个私用的, 内部查找, 不暴露给外部
        if (head == null) { // 空链表
            return null;
        }

        Node p; // 先设置一个指针 pointer, 最后一个节点的指针 指向null
        for (p = head; p.next != null; p = p.next) { // 循环写完了 不习惯可以改成while 循环

        }
        return p;

    }

    public void addLast(int value) {
        Node last = findLast(); // 先 找到最后节点

        if (last == null) { // 没找到最后节点, 用个add First 即可
            addFirst(value);
            return;
        }

        // 找到后
        last.next = new Node(value, null); // 添加新的尾部节点
    }

    // GET 通过索引 获取节点的值
    // 链表中没有索引
    // 遍历过程中, 逐渐知道的索引位置
    // 节点又没办法存储, 因为后边的索引需要跟着变, 维护成本太高了, 所以链表实现中从来不记录索引 

    // 遍历中计算出每个节点的索引 
    public void testindex() {
        int i = 0; // i 代表 索引, 初始值为0 
        // for 循环只能加一个变量
        // for 循环第三个部分 可以执行多条表达式
        for (Node p = head; p != null; p = p.next, i++) {
            System.out.println(p.value + "索引是: " + i);

        }
    }

    // 抽取成单独的方法, 以后可以重用 
    private Node findNode(int index) {
        int i = 0;
        for (Node p = head; p != null; p = p.next, i++) {
            if (i == index) {
                return p; 
            }
        }
        return null; // 没找到
    }

    public int get(int index) {
        Node node = findNode(index); 
        if (node == null) {
            // 抛出异常 
            throw new IllegalArgumentException(String.format("index [%d] 不合法%n", index));
        }
        return node.value; 
    }

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