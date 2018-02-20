
/**
 * Write a description of class sort here.
 * 
 * @author Codigo tomado de : http://www.java2novice.com/java-sorting-algorithms/insertion-sort/
 *
 */
import java.util.Random;
public class sort{

     public static int[] orden(int s){
          
  
    int max=5000;
    int []arr=new int [s];
    Random generator=new Random();
    for (int i=0;i<s;i++){
        arr[i]=generator.nextInt(max);
    }
        int temp;
        for (int i = 1; i < arr.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(arr[j] < arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                
            
            
        }
    }

return arr;
}
 public static void main(String[] args){
    
          long ahora = System.currentTimeMillis();
          orden(1000000);
          long deNuevo = System.currentTimeMillis();
       System.out.println(deNuevo-ahora);
       
    }
}
