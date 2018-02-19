/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

/**
 *
 * @author 
 */
public class laboratorio1Punto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n = 4;
        System.out.println("El factorial de "+n+" es igual a "+factorial(n));
        System.out.println("El número total de orejas para los conejos es: "+bunnyEars(4));
        System.out.println(triangle(5));
        int base = 3; 
        System.out.println("Base:"+base+", elevado a la "+n+ " es igual a "+powern(base,n));
        
        
    }
    
    //Factorial
    /*
    Sencillo, se sabe que un número por su fatorial anterior da su fatorial.
    Ejemplo: 10 * 9! = a 10!
    */
    public static int factorial(int n){
        if ( n == 1){
            return 1;
        }
            else{
             return n * factorial(n-1);
            }
    }
    
    
    //Fibonacci
    public static int fibonacci(int n){
        
        
        if(n < = 1){
            return n;
        }
        else{
            return fibonacci(n-2)+ fibonacci(n-1);
        }
    }
    
    //BunnyEars
    public static int bunnyEars(int bunnies){
        if(bunnies == 0){
            return 0;
        }
            else{
            return bunnyEars(bunnies - 1)+ 2;
            }
    }
    //Triangle
    public static int triangle(int fila){
        if(fila == 0){
            return 0;
        }
            else{
                return fila + triangle(fila -1);
        }
    }
    
    //PowerN
    public static int powern(int base, int n){
        if( n == 1){
            return base;
        }
            else{
                return base * powern(base, n -1);
        }
    }
    
    
    //EJERCICIOS DE RECURSION 2
    
    //SplitOdd10
    public boolean splitOdd(int [] nums){
        return helper (0, nums , 0 , 0);
    }
    
    public boolean helper (int inicio, int [] nums, int sum1, int sum2){
        if(inicio >= nums.length){
            return sum1%10 ==0 && sum2%2 == 1    ||
                    sum2 %10 ==0 && sum1 %2 == 1;

        }
        else{
            return helper(inicio + 1, nums, sum1 + nums[inicio], sum2)||
                    helper(inicio +1, nums, sum1, sum2 +nums[inicio]);
        }
    }
    
    
    //SplitArray
    public boolean splitArray(int [] nums){
        return aux(0,nums,0,0);
        
    }
    
    public static boolean aux(int inicio, int [] nums, int sum1, int sum2){
            if(inicio >= nums.length){
                return sum1 == sum2;
            
        }
            else{
                return aux(inicio +1, nums, nums[inicio]+sum1, sum2)||
                        aux(inicio +1, nums, sum1,nums[inicio]+sum1);
            }
    
    }
    //Groupsum6
    
    public boolean groupsum6(int inicio, int [] nums, int target){
        if(inicio >= nums.length){
            return target == 0;
        }
            if (nums[target] == 6){
                return groupsum6(inicio +1,nums, target - nums [target]);
            }
            return groupsum6(inicio + 1, nums, target) ||
                    groupsum6(inicio + 1, nums, target - nums[inicio]);
    }
    
    //groupNoAdj
    public boolean groupNoAdj(int inicio, int [] nums, int target){
        if(inicio >= nums.length){
            return target == 0;
        }
        else{
            return groupNoAdj(inicio +1, nums, target)||
                    groupNoAdj(inicio+2, nums, target - nums [inicio]);
                    
        }
    }
}
