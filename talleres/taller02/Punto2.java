/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2;

/**
 *
 * @author 
 */
public class Punto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
 
    }
    
    public boolean groupSum(int start, int [] nums, int target){
        
        //Condición de freno
        if(start == 0){
            return target == 0;
        }
        //Condición recursiva
        else
            return groupSum(start + 1, nums, target)|| groupSum(start + 1, nums,
                    target-nums[start]);
    }
    
}
