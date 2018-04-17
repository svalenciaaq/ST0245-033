/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller10datos;

/**
 *
 * @author Santiago x2
 */
public class Arbol {

    class Node {

        public Node left;
        public Node right;
        public int data;

        public Node(int d) {
            data = d;
        }

    }

    Node root;

    public String dibujar() {
        return "digraph G {\n" + dibujar(root) + "\n}";
    }

    private String dibujar(Node n) {
        if (n.left != null) {
            return n.data + " -> " + n.left;
        }else   
            return n.data +"<-"+n.right;
   }

    private boolean buscar(Node nodo, int n) {
        if (nodo == null) {
            return false;
        }
        if (nodo.data == n) {
            return true;
        }
        if (n >= nodo.data) {
            return buscar(nodo.right, n);
        }
        return buscar(nodo.left, n);
    }

    public boolean buscar(int n) {
        return buscar(root, n);
    }

    private void insertar(Node nodo, int n) {
        if (nodo.data == n) {
            return;
        }
        if (n >= nodo.data) {
            if (nodo.right == null) {
                insertar(nodo.right, n);
            }
        }
        if (n <= nodo.data) {
            if (nodo.left == null) {
                insertar(nodo.left, n);
            }
        }
    }

    public void insertar(int n) {
        if (root == null) {
            root = new Node(n);
        } else {
            insertar(root, n);
        }
    }

}
