public class LinkedList {
    
    
}

// 概述 

// 链表 不知道位置 O(n), 数越多, 时间越多 
// 插入同于删除的 O(): 起始位置插入 O(1); 结束位置, 知道tail节点是O(1), 不知道是O(n); 中间位置, 就是O(n) 根据index查找时间+O(1)
// 不连续 , 不同于数组 (地址可以计算, O(1))

// 单向链表 只知道下一个元素 

// 双向链表 知道上一个,下一个元素

// 循环链表 tail 指向 head 

// 特殊节点, 哨兵节点 sentinel, 或哑元节点 dummy 不存储数据, 用作头尾, 简化边界判断 

// 