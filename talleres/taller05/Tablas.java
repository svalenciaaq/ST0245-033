/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

/**
 *
 * @author cl18412
 */
public class Tablas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
            long ahora = System.currentTimeMillis();
            tablasMultiplicar(1000000);
            long deNuevo = System.currentTimeMillis();
            long haPasado = deNuevo - ahora;
        System.out.println(deNuevo-ahora);
        
    }
    
    public static void tablasMultiplicar(long n){
        int h ;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                h = i*j;
                //System.out.println(i*j); 
            }
        }
    }
    
   
    
}
