package com.polovyi.ivan.tutorials;


import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        boolean isAdded = queue.add("Element1");
        System.out.println("isAdded = " + isAdded);
        // isAdded = true
        System.out.println("queue after add() call = " + queue);
        // queue after add() call = [Element1]

        boolean isOffered = queue.offer("Element2");
        System.out.println("isOffered = " + isOffered);
        // isOffered = true
        System.out.println("queue after offer() call= " + queue);
        // queue after offer() call= [Element1, Element2]

        String elementResult = queue.element();
        System.out.println("elementResult = " + elementResult);
        // elementResult = Element1
        System.out.println("queue after element() call= " + queue);
        // queue after element() call= [Element1, Element2]

        String peekResult = queue.peek();
        System.out.println("peekResult = " + peekResult);
        // peekResult = Element1
        System.out.println("queue after peek() call= " + queue);
        // queue after peek() call= [Element1, Element2]

        Queue<String> emptyQueue = new LinkedList<>();
        // emptyQueue.element();
        // NoSuchElementException
        String peekEmptyResult = emptyQueue.peek();
        System.out.println("peekEmptyResult = " + peekEmptyResult);

        String removedResult = queue.remove();
        System.out.println("removedResult = " + removedResult);
        // removedResult = Element1
        System.out.println("queue after remove() call= " + queue);
        // queue after element() call= [Element2]

        String pollResult = queue.poll();
        System.out.println("pollResult = " + pollResult);
        // pollResult = Element2
        System.out.println("queue after pool() call= " + queue);
        // queue after poll() call= []

        // emptyQueue.remove();
        // NoSuchElementException

        String pollEmptyResult = emptyQueue.poll();
        System.out.println("pollEmptyResult = " + pollEmptyResult);

    }
}
