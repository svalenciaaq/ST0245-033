/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

/**
 *
 * @author usuario
 */
public class Contador {
      String id;
 static  int contador;
 static int incrementos;
    
  public  Contador(String id){
        this.id=id;
        contador=0;
        incrementos=0;
    }
  static  Contador contar= new Contador("Infinito");
    
    void Incremetar(){
        contador+=1;
        Incrementos();
        
    }
    
  static int Incrementos(){
       
        incrementos+=1;
        return incrementos;
    }

    public static int getContador() {
        return contador;
    }
    public static int getIncrementos() {
        return incrementos;
    }

    @Override
    public String toString() {
        return "Contador{" + "id=" + id + " "+contador+'}';
    }
    
    
   
    
    
    
    public static void main(String []args){
        for (int i = 0; i < 10; i++) {
            contar.Incremetar();
        }
        
        
        System.out.println(contar.toString());
    
        
    }

    
    
    

   
}
