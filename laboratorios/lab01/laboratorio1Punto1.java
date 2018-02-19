/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;
import java.util.*;

/**
 *
 * @author usuario
 */
public class laboratorio1Punto1 {
    
    
    public static void main(String[]args){
        
        //< -- Inicia arreglo aleatorio de millon de posiciones 
        int [] cantidad = new int [100000000];

        int maximo = 10; // Digito máxima al cual llegarán los elementos. llegaría hasta 9
        
        Random generador = new Random();
            for (int i = 0; i < 100000000; i++){ // El millón es el numero de elementos en el arreglo.
                cantidad [i] = generador.nextInt(maximo);
                System.out.println(cantidad[i]);
            }
        //< -- termina arreglo aleatorio de millon de posiciones     
            
            System.out.println(""); //espacio decorativo.
            
            //Método de la suma de los elementos del arreglo
            System.out.println(sumaElementos(cantidad,10)); 
            /* El 10 es el número de elementos que tomará el método para hacer la suma.
            En este caso lee el arreglo aleatorio de 1 millón de posiciones pero solo suma las 10 primeras posiciones.
            */
            
            //Método Fibonacci 
            System.out.println(fibonacci(10));
            
    }
    

    
    //Método para retornar la suma de los elementos del arreglo de 100´000,000 de posiciones
    public static int sumaElementos(int[] arreglo, int n){
            
        if (n == 0){
            return arreglo[0]; // No tan posible que vaya por este lado.
        }
        return arreglo[n] + sumaElementos(arreglo,n-1);
     
    }
    
   
    
    //Méotod de fibonacci
    public static int fibonacci(int n){
        if(n <= 1){
            return n;
        }
        return fibonacci(n-2) + (n-1);
    }
    
    
    
    
    
    
    
    
}
