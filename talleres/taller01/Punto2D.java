/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;

/**
 *
 * @author cl18412
 */
public class Punto2D {
   
    private float x;
     private float y;
            
    
    public Punto2D(float x,float y){
        this.x=x;
        this.y=y;
    }
    
     public float radio(){
    return (float) Math.sqrt((x*x)+(y*y));
    
    }
     
     float angulo(){
        return (float) Math.atan(y / x);
       // return (float) Math.atan2(x,y);
    }

}
  
