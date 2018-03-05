/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2datos;
//Importar clase Arrays de Util
import java.util.Arrays; 
import java.util.Random;

/**
 *
 * @author 
 */
public class Laboratorio2Datos {

    public static void main(String[] args) {
        
         //NOTA: para cambiar de tamaño del arreglo cambiar el número en el arreglo cantidad y en el ciclo de abajo. 
        //<--- Inicio arreglo aleatorio ------>
        int [] cantidad = new int [1000000] ;
        int maximo = 100; //Díto máximo al cual llegarón los elementos. Llegaría hasta el 99
        
        
        //Hacer un arreglo de elementos aleatorios
        Random generador = new Random();
            for (int i = 0; i < 1000000; i++) { //Un millón de elementos en el arreglo
                cantidad[i] = generador.nextInt(maximo);
                //System.out.println(cantidad[i]); Imprimir el elemento.
        }
        //<--- Fin arreglo aleatorio ------>
            
        
        long inicio = System.nanoTime(); // Inicio para contar en nanosegundos.
        System.out.println(ArraySumR(cantidad,6)); //AQUI CAMBIAR CADA MÉTODO PARA HACER EL CALCULO DE CUANTO TARDA DICHO MÉTODO
        long fin = System.nanoTime(); // fin para contar en nanosegundos.
        
        
        double tiempoNanosegundos = (double)(fin-inicio);
        double tiempoSegundos = (double)(fin-inicio)* 1.0e-9;
        
        System.out.println("Tiempo de ejecución: "+ tiempoNanosegundos+" nanosegundos" );
        System.out.println("Tiempo de ejecución: "+ tiempoSegundos+" Segundos" );
        
         
        
      int[] A = {1,5,3,2,6};
      int[] B = {1,5,3,2};
      int[] C = {1,5,2,6};
      int[][] Arrays = {A,B,C};  
      for (int[] X : Arrays)
      {        
      Laboratorio2Datos.mergeSort(X);
      Laboratorio2Datos.InsertionSort(X);
      System.out.println(Laboratorio2Datos.ArraySum(X) + " " + Laboratorio2Datos.ArrayMax(X) + "\n" );      
      }
    }
    
    
    //INICIO MÉTODOS SIN RECURSIÓN
    //Método para sumar los elementos de un Arreglo
    public static int ArraySum(int [] A){
        
        int sum = 0;//Contador que almacenará los valores y al final la suma.
        for (int i = 0; i < A.length; i++) { //Ciclo para recorrer todo el arreglo
            sum = sum + A[i]; //Asignación dle valor de Sum
        
        }
        return sum; //Retornar la suma de los elementos del arreglo
        
    }
    //Método para saber el elemento con el myaor valor
    public static int ArrayMax(int []A){
        //se inicializa el primer elemento como el mayor.
        int max = A[0]; 
        for (int i = 0; i < A.length; i++) {
            if(A[i]> max)
                max = A[i]; //Asignación de mayor valor a max
        }
        return max;//Retornar el valor mayor del arreglo
    }
    
    //Método insertion sort.
    //Tomado de: https://github.com/mauriciotoro/ST0245-Eafit/blob/master/laboratorios/lab02/codigo/Java/Laboratory1/Laboratory1.java#L41

    // Sorts an array using Insertion Sort
  public static void InsertionSort(int[] A)
  {
       int temp,j;
       for (int i = 0; i < A.length; i++)
       {
         j = i;
         while (j > 0 && A[j-1] > A[j])
           {
               temp = A[j];
               A[j] = A[j-1];
               A[j-1] = temp;
               j = j-1;
            }           
       }
       System.out.println(Arrays.toString(A));
  }

      // Sorts an array using Merge Sort
      // Taken from www.cs.cmu.edu/
	public static void mergeSort(int [ ] a)
	{
		int[] tmp = new int[a.length];
		mergeSort(a, tmp,  0,  a.length - 1);
	}


	private static void mergeSort(int [ ] a, int [ ] tmp, int left, int right)
	{
		if( left < right )
		{
			int center = (left + right) / 2;
			mergeSort(a, tmp, left, center);
			mergeSort(a, tmp, center + 1, right);
			merge(a, tmp, left, center + 1, right);
		}
	}


    private static void merge(int[ ] a, int[ ] tmp, int left, int right, int rightEnd )
    {
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;

        while(left <= leftEnd && right <= rightEnd)
            if(a[left] <= a[right] )
                tmp[k++] = a[left++];
            else
                tmp[k++] = a[right++];

        while(left <= leftEnd)    // Copy rest of first half
            tmp[k++] = a[left++];

        while(right <= rightEnd)  // Copy rest of right half
            tmp[k++] = a[right++];

        // Copy tmp back
        for(int i = 0; i < num; i++, rightEnd--)
            a[rightEnd] = tmp[rightEnd];
    }
    //FIN MÉTODOS SIN RECURSIÓN
    
    
    
    

    
    // INICIO MÉTODOS RECURSIVOS
    //Método fibonacci recursivo
    public static int fibonacci(int n){ //n = al número en la secuencia fibonacci
        if(n<=1){
            return n;
        }
        return fibonacci(n-2)+(n-1);
        
    }
    
    //Método ArraySum recursivo
    public static int ArraySumR(int []A, int n){
        if (n == 0){
            return A[0];
        }
        return A[0]+ArraySumR(A,n-1);
        
    }
    
    //ArrayMax recursivo
    public static int ArrayMaxR(int []A, int n, int x){
        
        if (n == 0){
            return x;
        }else{
            if(A[n]> x){
                x = A[n];
            }
        }
        return ArrayMaxR(A, n-1, x);
    }
     // FIN MÉTODOS RECURSIVOS
  
}
