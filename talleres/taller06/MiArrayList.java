/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller6datos;

/**
 *
 * @author cl18412
 */
public class MiArrayList<T> {

    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private T elements[]; 
    
    // Inicializa los atributos size en cero y elements como un arreglo de tamaño  DEFAULT_CAPACITY. No, no recibe parámetros. public MiArrayList() {}          // Retorna el tamaño de la lista public int size() {}          // Agrega un elemento e a la última posición de la lista public void add(int e) {}          // Retorna el elemento que se encuentra en la posición i de la lista public int get(int i) {}          // Agrega un elemento e en la posición index de la lista
    public MiArrayList() {
        this.elements = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }     

  
    // Retorna el tamaño de la lista ;
    public int size() {
        return size;
    }   
    
    // Agrega un elemento e a la última posición de la lista
    public void add(T e) {
        add(size,e); 
    }    
    
    
    // Retorna el elemento que se encuentra en la posición i de la lista 
    public T get(int i) {
        if (i < 0 || i >= size){
            throw new IndexOutOfBoundsException("out of bounds "+i);
        } else
          return elements[i];
        
    }
    
    
    // Agrega un elemento e en la posición index de la lista
    public void add(int index, T e) {
        add(size,e);
    } 
    
}
