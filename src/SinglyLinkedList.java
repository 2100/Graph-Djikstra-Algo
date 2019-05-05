/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

/**
 *
 * @author Wael-PC
 */
public class SinglyLinkedList<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public SinglyLinkedList() {
        head = tail = null;
        size = 0;
    }

    public SinglyLinkedList(Node<E> head, Node<E> tail, int size) {
        this.head = head;
        this.tail = tail;
        this.size = size;
    }
    

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) 
        {
            return true;
        }
        return false;
    }

    public E first() {
        return head.getElement();
    }

    public E last() {
        return tail.getElement();
    }
    public void addFirst(E e) {
        if (head == null) {
            head = tail = new Node(e, null);
        } else {
            Node<E> newest = new Node(e, head);
            head = newest;
        }
        size++;
    }

    public void addLast(E e) {
        if (tail == null) {
            head = tail = new Node(e, null);
        } else {
            Node<E> newest = new Node(e, null);
            tail.setNext(newest);
            tail = newest;
        }
        size++;
    }

    public E removeFirst() {
        E e = head.getElement();
        head = head.getNext();
        size--;
        return e;
    }

    @Override
    public String toString() {
        Node<E> tmp = head;
        String s = "[";
        while (tmp != null) {
            s += tmp.getElement()+",";
            tmp = tmp.getNext();
        }
        return s+"]";
    }
}