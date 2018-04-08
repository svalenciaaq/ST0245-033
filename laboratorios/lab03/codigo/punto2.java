/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3punto1;
import java.util.*;

/**
 *
 * @author 
 */
public class punto2 {
    
   
    public static void main(String[] args){
        
        //Lista enlazada tipo <caracter>Porque deber recorrer caracter x caracter
        LinkedList<Character> lista = new LinkedList <Character> ();
        String a_modificar= "asd[fgh[jkl";
        
        reorganizar(lista, a_modificar); // Ejecutar el proces de reorganizar
        
        salida(lista); //Método para imprimir el cambio.
    }
    
    public static void reorganizar(LinkedList<Character> lista, String a_modificar){

         int contador = 0; 
        
        //Ciclo para recorrer caracter por caracter
        for (int i = 0; i < a_modificar.length(); i++) {
            if(a_modificar.charAt(i)== '['){ // Si el caracter en la posicion i es '['
                i ++;
            }
            
                if(a_modificar.charAt(i)== ']'){ // Si el caracter ']' está:
                    contador = lista.size(); // Se vuelve size(); que es la últiam posición
                        i++;
                }
                
            // Los dos ciclos pasados cuenta '[' y ']'
             // Pero si no se enceuntran estos caracteres:
            if(a_modificar.charAt(i) != '[' && a_modificar.charAt(i) != ']'){
              lista.add(contador, a_modificar.charAt(i));
            }
        }
    }
    
    public static void salida(LinkedList<Character> lista){
        String a_modificar = ""; // String vacía que se llenará y formará nueva Palabra
        for (int i = 0; i < lista.size(); i++) {
            a_modificar += lista.get(i); // ir agregando cada caracter
        }
            System.out.println(a_modificar); //Imprime la nueva cadena
        
        
    }
    
    
    /*
    Uso de charArt(). URL: http://www.w3api.com/wiki/Java:String.charAt()
    */
    
}
