package com.polovyi.ivan.tutorials;


import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class DequeExample {

    public static void main(String[] args) {
        insertMethods();
        retrieveMethods();
        removeMethods();
    }


    private static void retrieveMethods() {
        Deque<String> deque = new LinkedList<>(List.of("Element0",
                "Element1", "Element2", "Element3", "Element4", "Element5"));

        String removeFirst = deque.removeFirst();
        System.out.println("removeFirst = " + removeFirst);
        // removeFirst = Element0
        System.out.println("deque after removeFirst() = " + deque);
        // deque = [Element1, Element2, Element3, Element4, Element5]

        Deque<String> emptyDeque = new LinkedList<>();
        // emptyDeque.removeFirst();
        // NoSuchElementException

        String removeLast = deque.removeLast();
        System.out.println("removeLast = " + removeLast);
        // removeLast = Element5
        System.out.println("deque after removeLast() = " + deque);
        // deque = [Element1, Element2, Element3, Element4]

        // emptyDeque.removeLast();
        // NoSuchElementException

        String pollFirst = deque.pollFirst();
        System.out.println("pollLast = " + pollFirst);
        // pollLast = Element1
        System.out.println("deque after pollLast() = " + deque);
        // deque = [Element2, Element3, Element4]

        String polledFirstOnEmpty = emptyDeque.pollFirst();
        System.out.println("polledFirstOnEmpty = " + polledFirstOnEmpty);
        // polledLast = null

        String pollLast = deque.pollLast();
        System.out.println("pollLast = " + pollLast);
        // pollLast = Element4
        System.out.println("deque after pollLast() = " + deque);
        // deque = [Element2, Element3]

        String polledLast = emptyDeque.pollLast();
        System.out.println("polledLast = " + polledLast);
        // polledLast = null

        String getFirst = deque.getFirst();
        System.out.println("getFirst = " + getFirst);
        // removeFirst = Element2
        System.out.println("deque after getFirst() = " + deque);
        // deque = [Element2, Element3]

        // emptyDeque.getFirst();
        // NoSuchElementException

        String getLast = deque.getLast();
        System.out.println("getLast = " + getLast);
        // getLAst = Element3
        System.out.println("deque after getLast() = " + deque);
        // deque = [Element2, Element3]

        // emptyDeque.getLast();
        // NoSuchElementException

        String peekFirst = deque.peekFirst();
        System.out.println("peekFirst = " + peekFirst);
        // removeFirst = Element2
        System.out.println("deque after peekFirst() = " + deque);
        // deque = [Element2, Element3]

        String peekedFirstOnEmpty = emptyDeque.peekFirst();
        System.out.println("peekedFirstOnEmpty = " + peekedFirstOnEmpty);
        // peekedFirstOnEmpty = null

        String peekLast = deque.peekLast();
        System.out.println("peekLast = " + peekLast);
        // getLAst = Element3
        System.out.println("deque after peekLast() = " + deque);
        // deque = [Element2, Element3]

        String peekedLastOnEmpty = emptyDeque.peekLast();
        System.out.println("peekedLastOnEmpty = " + peekedLastOnEmpty);
        // peekedFirstOnEmpty = null
    }

    private static void insertMethods() {
        Deque<String> deque = new LinkedList<>(List.of("Element2"));
        deque.addFirst("Element1");
        System.out.println("deque after addFirst() = " + deque);
        // deque = [Element0, Element1]

        boolean isOfferedFirst = deque.offerFirst("Element0");
        System.out.println("isOfferedFirst = " + isOfferedFirst);
        // isAddedFirst = true
        System.out.println("deque after offerFirst() = " + deque);
        // deque = [Element0, Element1, Element2]

        deque.addLast("Element3");
        System.out.println("deque after addLast() = " + deque);
        // deque = [Element0, Element1, Element2, Element3]

        boolean isOfferedLast = deque.offerLast("Element4");
        System.out.println("isOfferedLast = " + isOfferedLast);
        // isAddedLast = true
        System.out.println("deque after offerLast() = " + deque);
        // deque = [Element0, Element1, Element2, Element3, Element4]
    }

    private static void removeMethods() {
        Deque<String> deque = new LinkedList<>(List.of("Element0",
                "Element0", "Element1", "Element2", "Element3", "Element3"));

        boolean isFirstOccurrenceRemoved = deque.removeFirstOccurrence("Element0");
        System.out.println("isFirstOccurrenceRemoved = " + isFirstOccurrenceRemoved);
        // isFirstOccurrenceRemoved = true
        System.out.println("deque after removeFirstOccurrence() = " + deque);
        // [Element0, Element1, Element2, Element3, Element3]

        Deque<String> emptyDeque = new LinkedList<>();
        boolean isFirstRemovedFromEmptyDequeue = emptyDeque.removeFirstOccurrence("Element0");
        System.out.println("isFirstRemovedFromEmptyDequeue = " + isFirstRemovedFromEmptyDequeue);

        boolean isLastOccurrenceRemoved = deque.removeLastOccurrence("Element3");
        System.out.println("isLastOccurrenceRemoved = " + isLastOccurrenceRemoved);
        // isLastOccurrenceRemoved = true
        System.out.println("deque after removeLastOccurrence() = " + deque);
        // [Element0, Element1, Element2, Element3]

        boolean isLastRemovedFromEmptyDequeue = emptyDeque.removeLastOccurrence("Element3");
        System.out.println("isLastRemovedFromEmptyDequeue = " + isLastRemovedFromEmptyDequeue);
    }
}
