package aco11_1.week05;

import aco11_1.week05.ds.ArrayQueue;

import java.util.Iterator;

public class TestQueue {

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();


        queue.enqueue("1231");
        queue.enqueue(34);
        queue.enqueue(new Double(34.34));

        String el1 = (String) queue.dequeue();
        Integer el2 = (Integer) queue.dequeue();
        Double el3 = (Double) queue.dequeue();


        // nested
        /*ArrayQueue.MyArrayQueueIterator iterator =
                new ArrayQueue.MyArrayQueueIterator();*/

        //new ArrayQueue().new MyArrayQueueIterator();

        Iterator iterator = queue.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
