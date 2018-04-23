/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;


import java.util.LinkedList;
import javax.swing.JPanel;

/**
 *
 * @author Mirar block de notas con citas
 */
public class Arbolcompa {
    class Node {

        public Node left;
        public Node right;
        public int data;

        public Node(int d, Node left, Node right) {
            data = d;
            this.left=left;
            this.right=right;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
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

    private void insertar(Node ne, Node Equi) {
        if (this.root == null) {
            root = ne;
        } else {
            if (ne.getData() <= Equi.getData()) {
                if (Equi.getLeft() == null) {
                    Equi.setLeft(ne);
                } else {
                    insertar(ne, Equi.getLeft());
                }
            } else {
                if (Equi.getRight() == null) {
                    Equi.setRight(ne);
                } else {
                    insertar(ne, Equi.getRight());
                }
            }
        }
    }

    public boolean insertar(int n) {
       Node ne = new Node(n, null, null);
        insertar(ne, root);
        return true;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
    
    public LinkedList preOrden() {
    LinkedList nums = new LinkedList();
        preorden(root, nums);
        return nums;
    }
    
    public void preorden(Node alma, LinkedList trayecto) {
        if (alma != null) {
            trayecto.add(alma.getData());
            preorden(alma.getLeft(), trayecto);
            preorden(alma.getRight(), trayecto);
        }
    }
    
    public LinkedList postOrden() {
        LinkedList nums = new LinkedList();
        postorden(root, nums);
        return nums;
    }
    public void postorden(Node alma, LinkedList trayecto) {
        if (alma != null) {
            postorden(alma.getLeft(), trayecto);
            postorden(alma.getRight(), trayecto);
            trayecto.add(alma.getData());
        }
    }
    
     public JPanel getdibujo() {
        return new ArbolMain(this);
    }
}
