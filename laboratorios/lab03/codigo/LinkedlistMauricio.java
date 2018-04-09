/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3dedatos;

/**
 *
 * @author Nadie, codigo hecho para el publico.
 */
public class LinkedlistMauricio {

    public Nodo first;
    public Nodo fin;
    private int size;

    public class Nodo {

        public int dato;
        public Nodo next;

        public Nodo(int dato) {
            next = null;
            this.dato = dato;
        }

        public Nodo(int dato, Nodo n) {
            this.dato = dato;
            next = n;
        }
    }

    public int size() {
        return size;
    }

    

    public void remove(int data) {
        if (size() == 0) {
            return;
        } else if (data == first.dato) {
            first = first.next;
            size--;
        } else {
            Nodo antes;
            Nodo temp;
            antes = first;
            temp = first.next;
            while (temp != null && temp.dato != data) {
                antes = antes.next;
                temp = temp.next;
            }

            if (temp != null) {
                antes.next = temp.next;
                if (temp == fin) {
                    fin = antes;
                }
            }
            size--;
        }
    }

    public boolean contain(int dato) {
        Nodo temp = first;
        while (temp != null && temp.dato != dato) {
            temp = temp.next;
        }
        return temp != null;
    }
    
    
     private Nodo getNode(int index) throws IndexOutOfBoundsException {
        if (index >= 0 && index < size) {
            Nodo temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
     
      public int get(int index) {
        if (size == 0) {
            return 0;
        }

        Nodo temp = null;
        try {
            temp = getNode(index);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.exit(0);
        }

        return temp.dato;
    }
      
      public void insert(int data, int index) {
        if (index < 0 || index > size) {
            return;
        } else {
            if (size() == 0) {
                first = new Nodo(data);
            } else if (index == 0) {
                Nodo papu = first;
                Nodo mamu = new Nodo(data);
                first = mamu;
                mamu.next = papu;
            } else {
                Nodo papu = first;
                Nodo nex = first;
                for (int i = 0; i < index; ++i) {
                    papu = nex;
                    nex = nex.next;
                }
                Nodo n = new Nodo(data);
                papu.next = n;
                n.next = nex;
            }
            size++;
        }
    }
}
