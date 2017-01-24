package com.tananaev.problems;

import java.util.Deque;
import java.util.LinkedList;

public class ImplementQueueUsingStacks {

    public static class MyQueue {

        private Deque<Integer> front = new LinkedList<>();
        private Deque<Integer> back = new LinkedList<>();

        /** Initialize your data structure here. */
        public MyQueue() {
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            while (!front.isEmpty()) {
                back.push(front.pop());
            }
            back.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            while (!back.isEmpty()) {
                front.push(back.pop());
            }
            return front.pop();
        }

        /** Get the front element. */
        public int peek() {
            while (!back.isEmpty()) {
                front.push(back.pop());
            }
            return front.peek();
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return front.isEmpty() && back.isEmpty();
        }

    }

}
