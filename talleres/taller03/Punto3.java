/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3;

/**
 *
 * @author c
 */
public class Punto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Punto3(" ", "abc");

      
    }
    
     public static void Punto3(String papa, String hijo){
        if(hijo.length()==0){
            System.out.println(papa);
        }else{
            Punto3(papa+hijo.charAt(0), hijo.substring(1));
            Punto3(papa,hijo.substring(1));
        }
     
    }
    
     
  }
   

    

