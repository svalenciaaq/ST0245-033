
/**
 * Write a description of class asa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;
public class Suma
{
 public static void suma(int s){
   
int max=50;
int []arr=new int [s];
Random generator=new Random();
for (int i=0;i<s;i++){
arr[i]=generator.nextInt(max);}

long suma=0; 
for (int i=0; i< arr.length ; i++) 
suma+=arr[i]; 
System.out.println("SUMA= " +Math.abs(suma)); 

}

 public static void main(String[] args){
 
          long ahora = System.currentTimeMillis();
          suma(100000000);
          long deNuevo = System.currentTimeMillis();
         System.out.println(deNuevo - ahora);
        
        }
    }

