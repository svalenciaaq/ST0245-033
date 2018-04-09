/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3dedatos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author usuario
 */
public class Lab3dedatos{

    /**
     * Returns the product of the numbers in the list.
     *
     * @param list - List of integers.
     * @return An integer.
     */
    public static int multiply(List<Integer> list) {
        int p = 1;
        for (int i = 0; i < list.size(); i++) {
            p = p * list.get(i);
        }
        return p;
    }
    
    public static List<Integer> smartInsert(List<Integer> list, int data){
        int p=0;
        for (int i = 0; i <list.size(); i++) {
            if(list.get(i)!=data){
                p=p+1;
            }
            if(p==list.size()){
                list.add(data);
            }
        }
        return list;
    }
    
    
    public static void Neveras(){
        
        
        Stack neveras= new Stack ();
       
        for (int i = 0; i < 50; i++) {
            neveras.push(i);
        }
               
 
        
        
        Scanner p=new Scanner(System.in);
        System.out.println("Ingrese el numeroo de solicitudes");
        int numSolic=p.nextInt();
        while(!neveras.isEmpty())    
            for (int i = 0; i < numSolic; i++) {
                System.out.println("Organizacion");
                String nombre=p.next();
                System.out.println("Cuantas neveras quieren");
                int neve=p.nextInt();
                System.out.println("Que marca las quiere");
                String marca=p.next();
                 System.out.println(nombre);
                for (int j = 0; j <neve; j++) {
                    if(neve<=neveras.size()){
                    System.out.print(neveras.pop()+" " +marca+"-");    
                    }else{
                        System.out.print("No hay neveras suficientes");
                        break;
                    }
                        
                    }
                
                    
                    
                
            }
        
    }
    

    /**
     * Tests the methods.
     *
     * @param args
     */
    public static void main(String[] args) {
        LinkedList<Integer> linked = new LinkedList<>();
        linked.addAll(Arrays.asList(new Integer[]{1, 2, 3, 4}));

        ArrayList<Integer> array = new ArrayList<>();
        array.addAll(Arrays.asList(new Integer[]{2, 4, 6, 8}));
        
       
             

        // Multiply
        //System.out.println(multiply(linked));
        //System.out.println(multiply(array));
        //Smart insert
        //System.out.println(smartInsert(linked,5));
        //System.out.println(smartInsert(array,5));
                Neveras();

    }

  
}
