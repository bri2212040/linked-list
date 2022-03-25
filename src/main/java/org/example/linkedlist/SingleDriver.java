package org.example.linkedlist;

public class SingleDriver {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new SingleLinkedList<>();

        linkedList.addFirst("first");
        linkedList.addFirst("second");
        linkedList.addFirst("third");
        linkedList.addFirst("fourth");
        linkedList.addFirst("fifth");

        linkedList.addLast("sixth");
        linkedList.addLast("seventh");
        linkedList.addLast("eigth");

        System.out.println(linkedList);

        System.out.println("Head: " + linkedList.peekFirst());
        System.out.println("Tail: " + linkedList.peekLast());

        linkedList.pollFirst();
        linkedList.pollLast();

        System.out.println("Poll First: " + linkedList);
        System.out.println("Poll Last: " + linkedList);

        System.out.println("Head: " + linkedList.peekFirst());
        System.out.println("Tail: " + linkedList.peekLast());

        System.out.println(linkedList);

        System.out.println(linkedList.size());

        linkedList.clear();

        System.out.println(linkedList.size());


    }
}
