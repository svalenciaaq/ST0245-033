/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poew;

/**
 *
 * @author Santiago x2
 */
public class Punto3 {
    
    
    public static void Punto3(String papa, String hijo){
        if(hijo.length()==0){
            System.out.println(papa);
        }else{
            for (int i = 0; i <hijo.length(); i++) {
                  Punto3(papa + hijo.charAt(i), hijo.substring(0,i)+hijo.substring(i+1));
            }
        }
     
    }
    
    public static void main(String[]args){
        Punto3(" ", "abc");
    }
}
