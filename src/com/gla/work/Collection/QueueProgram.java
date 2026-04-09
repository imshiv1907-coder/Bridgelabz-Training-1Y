package com.gla.work.Collection;
import java.util.*;
public class QueueProgram {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(56);
        q.offer(76);
        q.offer(90);
        q.offer(23);
        //56 76 90 23
        System.out.println(q);

        System.out.println(q.peek());
        System.out.println(q.element());

        q.remove();
        q.poll();
        System.out.println(q);
    }
}
