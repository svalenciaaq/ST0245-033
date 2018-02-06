/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerpunto;

/**
 *
 * @author 
 */
public class Primerpunto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        torreHanoi(3,'d','p','h');
    }
    
    
    
    private static void torreHanoi(int cantidad, char a, char b, char c){
        
        //Cómo si hubiera solo un disco. O cuando ya se esté en el último paso. 
        if(cantidad == 1){
            System.out.println("Mueve el Disco de la Primer torre (A) hasta "
                    + "la tercer torre (C)");
        }else{
            torreHanoi(cantidad-1,a,c,b);
            System.out.println("Mueve el disco de la primer torre (A) hasta "
                    + "la tercera torre (C)");
            torreHanoi(cantidad-1,b,a,c);
        }
 
        }
    }
    

