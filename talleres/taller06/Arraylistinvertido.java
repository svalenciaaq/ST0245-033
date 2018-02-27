/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller6datos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Santiago valencia
 */
public class Arraylistinvertido {

   
    
    
    public static void Arrayinvertido(){
           ArrayList<Integer> invertido = new ArrayList();
        for (int i = 0; i < 100000000; i++) {
            invertido.add(0);
        }
        
        
        
        Scanner p1=new Scanner(System.in);
        int n;
         int p=invertido.size()-1;
         do {
          
           n = p1.nextInt();
            if (n != -1)
                invertido.set(p,n);
            p--;
        }while (n != -1);
         
         
         
         for (int i = 0; i < 100000000; i++) {
            if(invertido.get(i)!=0){
             System.out.println(invertido.get(i));
            }
        }
        
        }
    
    
    
    
    
    public static void main(String[]args){
        Arrayinvertido();
    }
}
