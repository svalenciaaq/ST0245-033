/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller9;

import java.util.HashMap;
import java.util.Hashtable;

/**
 *
 * @author 
 */
public class Taller9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        HashMap<String,String> tabla = new HashMap<String,String>();
        tabla.put("Google","Estados Unidos");
        tabla.put("La Locura","Colombia");
        tabla.put("Nokia","Finlandia");
        tabla.put("Sony","Japón");
        
       
        
    }
    
    public static void agregar(HashMap <String, String>empresas, String key, String value){
        empresas.put( key, value);
    }
    
    public static void buscar(HashMap <String, String>empresas, String key){
        empresas.get(key);
    }
    
    public static boolean contienekey(HashMap empresas, String value){
        return empresas.containsValue(value);
    }
    
    
    
}