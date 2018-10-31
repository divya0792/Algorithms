package com.util.basic.list;

import org.junit.Test;

import static org.junit.Assert.*;

public class PriorityQueueTest {
    @Test
    public void priorityQueue() {
        PriorityQueue priorityQueue = new PriorityQueue(10);
        priorityQueue.insert(5);
        priorityQueue.insert(10);
        priorityQueue.insert(15);
        priorityQueue.delMax();
        priorityQueue.insert(4);
        priorityQueue.insert(1);
        priorityQueue.insert(18);
        priorityQueue.delMax();
    }

}