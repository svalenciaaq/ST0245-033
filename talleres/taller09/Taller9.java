/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller9;

import java.util.HashMap;

/**
 *
 * @author 
 */
public class Taller9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    }
    
    public static void agregar(HashMap empresas, String key, String value){
        empresas.put( key, value);
    }
    
    public static void buscar(HashMap empresas, String key){
        empresas.get(key);
    }
    
    public static boolean contienekey(HashMap empresas, String value){
        return true;
    }
    
}
