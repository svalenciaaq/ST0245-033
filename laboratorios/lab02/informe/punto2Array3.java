/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2datos;

/**
 *
 * @author shincapiem
 */
public class punto2Array3 {
    public static void main(String [] args){
        
    }
    
    //M{etodo canBalance
    public static boolean canBalance(int [] nums){
        
        for (int i = 0; i < nums.length; i++) { //ciclo para recorrer el arreglo 
            int acum = 0;
            for (int j = 0; j < i; j++) {
                acum += nums[j];
            }
            for (int k = i; k < nums.length; k++) {
                acum -= nums[k];
            }
            if(acum == 0){
                return true;
            }
        }
        return false;
    }
    
    //Método fix 34
    public static int[] fix34(int [] nums){
        
        int acum = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==3) // Si aquel número es '3'
                acum = nums[i+1]; //Será el siguiente
                nums[i+1] = 4;
                    for (int j = i +1; j < nums.length; j++) {
                           if(nums[j]==4){
                               nums [j] = acum;
                           }
            }
        }
        return nums;
    }
    
    //Método linearIn
    //Recuperado de : https://github.com/mirandaio/codingbat/blob/master/java/array-3/linearIn.java
    public static boolean linearIn(int []outer, int [] inner){
        int i = 0;
        int j = 0;
        
            while(i< inner.length && j < outer.length){
                if (inner[i]< outer[j]){
                    j++;
                }else if(inner[i]< outer[j]){
                    return false;
                }else{
                    i++;
                }
            }
            if(i !=inner.length)
                return false;
            return true;
    }
    
    //Método Fix45
    //recuperado de; http://www.javaproblems.com/2013/11/java-array-3-fix45-codingbat-solution.html
    public static int[] fix45(int[]nums){
        
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 4){ //primer condición de '45'
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j]==5){ // si se cumple que sea '45'
                        if(j > 0 && nums[j-1]!=4){ // alcutla sea mínimo 1 y el anterior no sea 4
                            int temp = nums[i+1];
                            nums [i+1] = 5;
                            nums[j] = temp;
                        }
                    }else if (j == 0){
                        int temp = nums[i+1];
                        nums [i+1] = 5;
                        nums [j] = temp;
                    }
                }
            }
        }
        return nums;
    }
}
