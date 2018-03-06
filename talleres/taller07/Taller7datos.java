/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller7datos;

import java.lang.IndexOutOfBoundsException; // Usar esto cuando se salga el índice
// Una lista simplemente enlazada

public class Taller7datos {
    // Un nodo para una lista simplemente enlazada

    class Node {

        public Node siguiente;
        public int data;
        public Node next;

        public Node(int data) {
            next = null;
            this.data = data;
        }
    }
    
    

    private Node first;
    private int size;

    public Taller7datos() {
        size = 0;
        first = null;
    }
    
  

    /**
     * Returns the node at the specified position in this list.
     *
     * @param index - index of the node to return
     * @return the node at the specified position in this list
     * @throws IndexOutOfBoundsException
     */
    private Node getNode(int index) throws IndexOutOfBoundsException {
        if (index >= 0 && index < size) {
            Node temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     * Returns the element at the specified position in this list.
     *
     * @param index - index of the element to return
     * @return the element at the specified position in this list
     */
    public int get(int index) {
        Node temp = null;
        try {
            temp = getNode(index);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.exit(0);
        }

        return temp.data;
    }

// Retorna el tamaño actual de la lista 
    public int size() // O(1) 
    {
        return size;
    }

// Inserta un dato en la posición index
    public void insert(int data, int index, Node head) {
        Node creoUnNodoNuevo = new Node(data);
        Node previo = head;
        int sum = 1;
        while (sum < index - 1) {
            previo = previo.next;
            sum++;
        }
        Node current = previo.next;
        creoUnNodoNuevo.next = current;
        previo.next = creoUnNodoNuevo;

    }

// Borra el dato en la posición index
    public void remove(int index, Node head) {
        Node previo = head;
        int sum = 1;
        while (sum < index - 1) {
            previo = previo.next;
            sum++;
        }
        Node current = previo.next;
        previo.next = current;
        current.next = null;
    }

// Verifica si está un dato en la lista
    public boolean contains(int data, Node s) {
        for (int i = 0; i < size; i++) {
            if (s.equals(data)) {
                return true;
            }
        }

        return false;

    }
    
      public int returnvalorMax() {
        return valorMax(this.first);
    }

    public int valorMax(Node n) {
        if (n.siguiente == null) {
            return n.data;
        }
        return Math.max(n.data, valorMax(n.siguiente));
    }
    
    public boolean Compareto(Node a, Node b){
        for (int i = 0; i < size; i++) {
            if(a.equals(b))
                return true;
            else break;
        }
        
        return false;
    
        
    }

    

}
