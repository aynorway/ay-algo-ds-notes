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

    public void addFrist(int value) { 
        // 1 链表为空 
        head = new Node (value, null); // 这行其实可以被优化掉 
        // 2 链表非空 
        head = new Node(value, head); // 新节点有了
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