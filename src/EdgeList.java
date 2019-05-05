/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author k.c
 */
import java.util.Scanner;


public class EdgeList {
    SinglyLinkedList<Vertex> vertexu;
    SinglyLinkedList<Edge> edges;

    public EdgeList(SinglyLinkedList<Vertex> vertexu, SinglyLinkedList<Edge> edges) {
        this.vertexu = vertexu;
        this.edges = edges;
    }
    
    @Override
    public String toString() {
        return "EdgeList[" + edges + ']';
    }
    /*
     public void insertionSort(int size) {
        Vertex target;
        int j;
        int i;
        for (j = 1; j < size ; j++) {
            target = array[j];
            i = j - 1;
            while (i >= 0 && array[i] > target) {
                array[i + 1] = array[i];
                i = i - 1;
            }
            array[i + 1] = target;
        }
     }
    */
    public static void main(String[] args) {
        
        Vertex v1 = new Vertex("Cairo");
        Vertex v2 = new Vertex("Alex");
        Vertex v3 = new Vertex("Marsa Matrouh");
        Vertex v4 = new Vertex("Aswan");
        Vertex v5 = new  Vertex("Dahab");
        SinglyLinkedList<Vertex> vertecies=new SinglyLinkedList<>();
          
        Edge e1 = new Edge("Sahrawi", v1, v2,200);
        Edge e2 = new Edge("Zerai", v1, v2,300);        
        Edge e3 = new Edge("Sahel", v2, v3,250);
        Edge e4 = new Edge("Sahrawi,Sahel", v1, v3, 450);
        Edge e5 = new Edge("Masr Kolaha", v2, v4, 900);
        Edge e6 = new Edge("Tari2 Sharm", v1, v5, 700);
        Edge e7 = new Edge("Newba3", v1, v5, 800);
        Edge e = new Edge();
        
        SinglyLinkedList<Edge> edgeList = new SinglyLinkedList<>();
        
        edgeList.addLast(e1);
        edgeList.addLast(e2);
        edgeList.addLast(e3);        
        e.minPath(e6, e7);
    }
}