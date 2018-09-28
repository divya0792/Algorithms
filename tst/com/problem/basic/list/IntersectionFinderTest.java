package com.problem.basic.list;

import com.util.basic.list.SingleLinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntersectionFinderTest {

    @Test
    public void findIntersection() {

        int[] arr = {4,5,3,1,2,4,6,7,8,0,7,6,4};
        SingleLinkedList listOne = new SingleLinkedList();
        SingleLinkedList listTwo = new SingleLinkedList();
        int key = 5;
        listTwo.add(3);
        listTwo.add(8);
        listTwo.add(10);
        for (int i = 0; i < arr.length; i++) {
            listOne.add(arr[i]);
        }
        SingleLinkedList.Node first = listOne.head;
        int start = 1;
        while(start != key) {
            first = first.next;
            start++;
        }
        listTwo.tail.next = first;
        listTwo.tail = listOne.tail;

        IntersectionFinder intersectionFinder = new IntersectionFinder();
        boolean isIntersect = intersectionFinder.isIntersect(listOne, listTwo);


        assertTrue(isIntersect);
    }
}