/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2datos;

/**
 *
 * @author 
 */
public class Array2 {
    
    public static void main(String [] args){
        
    }
    
    //Método countEvens
    public static int countEvens(int [] nums){
        int sum = 0; //Valor inicial de la suma
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) //Si el número en posició i es par:
                sum = sum + 1; 
            }
        return sum;
    }
    
    //M{etodo sum13
    public static int sum13(int [] nums){
        int contador = 0;
        for (int i = 0; i < nums.length; i++) { //Recorre todo el arreglo
            if(nums [i] != 13){ //Si no es 13 entra.
                contador += nums[i];
            }else if(i <= nums.length-1)i++;
            
        }
        return contador;
    }
    
    //M{etodo sum28
    public static boolean sum28(int [] nums){
        int cont = 0; //Inicializ la suma de '2' en 0.
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] ==2) // Ingresar numeros de '2'
                cont += 2;
        }
        return cont == 8; // retornar si el cont es 8
    }
    
    //Método sum22
    public static boolean has22(int [] nums){
        for (int i = 0; i <= nums.length-2; i++) 
            if(nums[i] == 2 && nums[i+1] == 2)return true; // Si están de seguido los '2'
                  return false;
    }
    
    //Método has77
    public static boolean has77(int [] nums){
        for (int i = 0; i < nums.length-1; i++) 
            if(nums[i]== 7 && nums[i+1]==7) // Si los numeros seguidos son 7
                return true;
        for (int i= 0; i < nums.length-2; i++) 
             if(nums[i]==7 && nums [i+2]==7)//Si tiene un epacio
                 return true;
             return false;
            
    }
}
