/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbogenealogico;

/**
 *
 * @author usuario
 */
public class ArboGenealogico {

    int longi;
    int h;

    class Node {

        String name;
        Node father;
        Node mother;
        int orden;

        public Node(String name) {
            this.name = name;
            this.father = null;
            this.mother = null;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getOrden() {
            return orden;
        }

        public void setOrden(int orden) {
            this.orden = orden;
        }

    }
    Node root;

    public ArboGenealogico(String root) {
        this.root = new Node(root);
        this.root.orden = 1;
        longi = 1;
        h = 1;
    }



    private Node SearHijo(Node node, String de) {
        if (node == null) {
            return null;
        }
        if (node.name.equals(de)) {
            return node;
        }
        Node izq = SearHijo(node.mother, de);
        return izq == null ? SearHijo(node.father, de) : izq;
    }

    public String abuelaMaterna(String nombre) {
        return abuelaMaternaAux(root, nombre);
    }

    private String abuelaMaternaAux(Node root, String nombre) {
        if (root == null) {
            return null;
        }
        if (root.name.equals(nombre)) {
            return root.mother.mother.name;
        }
        String der = abuelaMaternaAux(root.father, nombre);
        String izq = abuelaMaternaAux(root.mother, nombre);
        return der != null ? der : izq;
    }
    
     public void insertarFamiliar(boolean mother, String name, String son) {
        if (mother)
        {
            Node temporal = SearHijo(root, son);
            temporal.mother = new Node(name);
            temporal.mother.orden = temporal.orden + 1;
            if (temporal.mother.orden > h) {
                h = temporal.mother.orden;
            }
           longi++;
        } else {
            Node tmp = SearHijo(root, son);
            tmp.father = new Node(name);
            tmp.father.orden = tmp.orden + 1;
            if (tmp.father.orden > h) {
                h = tmp.father.orden;
            }
            longi++;
        }
    }
     
     public boolean buscar(String n) {
        return buscarAux(root, n);
    }
     
      private boolean buscarAux(Node ubi, String nombre) {
        if (ubi == null) {
            return false;
        }
        if (ubi.name.equals(nombre)) {
            return true;
        }
        return buscarAux(ubi.mother, nombre) || buscarAux(ubi.father, nombre);
    }
     
      public void imprimir() {
        imprimirAux(root);
    }

    private void imprimirAux(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.name + " " + "Padres; ");
        if (root.mother != null) {
            System.out.print(root.father.name + " , ");
        }
        if (root.mother != null) {
            System.out.print(root.mother.name);
        }
        System.out.println();
        imprimirAux(root.father);
        imprimirAux(root.father);
    }

}
