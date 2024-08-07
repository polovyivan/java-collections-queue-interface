package com.polovyi.ivan.tutorials;


import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeSet;

public class PriorityQueueExample {

    public static void main(String[] args) {
        Queue<Integer> pq1 = new PriorityQueue<>();
        Queue<Integer> pq2 = new PriorityQueue<>(10);
        Queue<Integer> pq3 = new PriorityQueue<>(Comparator.reverseOrder());
        Queue<Integer> pq4 = new PriorityQueue<>(10, Comparator.reverseOrder());
        Queue<Integer> pq5 = new PriorityQueue<>(List.of(1, 2, 3));
        Queue<Integer> pq6 = new PriorityQueue<>(new PriorityQueue<>());
        Queue<Integer> pq7 = new PriorityQueue<>(new TreeSet<>());

        priorityQueueReverseOrder();
        priorityQueueOrderByField();
    }

    private static void priorityQueueOrderByField() {
        record PersonalTask(
                int priority,
                String taskName) {

        }
        Queue<PersonalTask> pqTasks = new PriorityQueue<>(Comparator.comparing(
                PersonalTask::priority).reversed());
        pqTasks.offer(new PersonalTask(3, "Buy groceries"));
        pqTasks.offer(new PersonalTask(1, "Watch movie"));
        pqTasks.offer(new PersonalTask(5, "Go to doctor"));
        System.out.println("pqTasks = " + pqTasks);
        // pqTasks = [PersonalTask[priority=5, taskName=Go to doctor],
        // PersonalTask[priority=1, taskName=Watch movie],
        // PersonalTask[priority=3, taskName=Buy groceries]]
        PersonalTask head = pqTasks.peek();
        System.out.println("head = " + head);
        // head = PersonalTask[priority=5, taskName=Go to doctor]
    }

    private static void priorityQueueReverseOrder() {
        Queue<Integer> pqReverseOrder = new PriorityQueue<>(Comparator.reverseOrder());
        pqReverseOrder.offer(1);
        pqReverseOrder.offer(5);
        pqReverseOrder.offer(3);
        pqReverseOrder.offer(0);
        System.out.println("pqReverseOrder = " + pqReverseOrder);
        // pqReverseOrder = [5, 1, 3, 0]
        Integer head = pqReverseOrder.peek();
        System.out.println("head = " + head);
        // head = 5
    }
}
