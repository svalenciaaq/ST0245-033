/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punti2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 
 */
public class Punti2 {

    /**
     * @param args the command line arguments
     */
    
    
    List<Integer> lista = new ArrayList<>(); // Lista de Enteros
    //Variable sglobales
    int tamanio;
    int Num_nodos;
    int [][] matriz;
    int [] matriz2;
    
    public  void main(String[] args) {
        
        while(tamanio != 0){
            tamanio();
        }
        num_Nodos();//
        Punti2(); //
        
    }
    public int tamanio(){
        Scanner entrada = new Scanner(System.in);
        
        tamanio = entrada.nextInt(); //Siguiente entero.
        entrada.next();
        
        matriz = new int [tamanio][tamanio]; //(Tamanio)¨2
        matriz2 = new int [tamanio]; //matriz para saber si es Bicolorable
                return tamanio;
    }
    
    public void num_Nodos(){
        
        Scanner entrada = new Scanner(System.in);
        Num_nodos = entrada.nextInt(); //Siguinete
        entrada.next();
        int i = 0;
        while(i <= Num_nodos){
            
            //Nodos iniciales
            int Nodo_1, Nodo_2;
            Scanner entrada2 = new Scanner (System.in);
            
            Nodo_1 = entrada2.nextInt(); //Siguiente nodo
            entrada.next(); //Siguiente
            
            Nodo_2 = entrada2.nextInt(); //Siguiente nodo
            entrada.nextInt();
           
            i++;
        }
        
    }
    
    //Es o no es Bicolorable?
    boolean Punti2(){
        
        boolean Punti2 = true;
        int i = 0;
        while(i <= tamanio-1){
            matriz2[i] =0; //Será igual a cero en aquella posición.
            i++;
        }
        for (int j = 0; j <= tamanio-1; j++) {
            for (int k = 0; k <=tamanio-1; k++) {
                //Condiciones
                if(matriz[j][k] == 1){ // SI es igual a 1 en aquella posicion
                    //En el caso de que no sea.
                    if(matriz2[k] !=0 &&(matriz[j] == matriz[k]))//Deben ser ambas 0 o la matriz en K diferente de 0
                      Punti2 = false;
                        }else{
                    Punti2 = true; //De resto será verdadera.
                }
            }
        }
        
        if(Punti2 == false){ // Si al final es falso.
            System.out.println("NOT BICOLORABLE");
        }else{
            System.out.println("BICOLORABLE");
        }
        return Punti2;
    }
    
}
