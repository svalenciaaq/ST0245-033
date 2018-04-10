/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller9;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

/**
 *
 * @author usuario
 */
public class Taller9 {

      
    public static void agregar(Hashtable <String, String>empresas, String key, String value){
        empresas.put( key, value);
    }
    
    public static void buscar(Hashtable <String, String>empresas, String key){
     Enumeration e = empresas.keys();
Object clave;
Object valor;
while( e.hasMoreElements() ){
  clave = e.nextElement();
  if(clave==key){
  valor = empresas.get( clave );
 
  System.out.println( "Clave : " + clave + " - Valor : " + valor );
  }
}
    }
    
    public static boolean contienekey(HashMap empresas, String value){
        return empresas.containsValue(value);
    }
    public static void main(String[] args) {
       Hashtable<String,String> tabla = new Hashtable<String,String>();
       agregar(tabla,"Google","Estado unidos");
       agregar(tabla,"La locura","Colombia");
       agregar(tabla,"Nokia","Finlandia");
       agregar(tabla,"Sony","Japon");
       buscar(tabla,"Google");
       
     
       
    
    }
    
}
