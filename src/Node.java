/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Wael-PC
 */
public class Node<E> {

    private E element;
    private Node<E> next;

    public Node(E element, Node<E> next) {
        this.element = element;
        this.next = next;
    }

    public E getElement() {
        return element;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setElement(E element) {
        this.element=element;
    }

    public void setNext(Node<E> n) {
        next = n;
    }
   /* public static void main(String[] args) {
        Node<String> n=new Node("Mark", null);
        n.setNext(new Node("Ahmed",null));
       // Node<String> tmp=n;
        for(Node<String> tmp=n;tmp!=null;tmp=tmp.getNext())
        {
            System.out.println(tmp.getElement());
             
        }
    }*/
}