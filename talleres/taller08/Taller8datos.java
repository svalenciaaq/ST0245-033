/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller8datos;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author usuario
 */
public class Taller8datos {

    //Punto 1
    public static Stack<Integer> inversa (Stack<Integer> stack){
       Stack<Integer> p1=new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        
           while(stack.empty()!=false){
               p1.push(stack.pop());
           }
               return p1;
        
    }
    
    
    //Punto 2
    public static void cola (){
       Queue<String> queue=new LinkedList();
        
       queue.add("Juan");
       queue.add("Maria");
       queue.add("Pedro");
       
       while(queue.size()!=0){ 
       System.out.println("Atediendo a "+queue.remove());
       
       }
    }
    
    
    
    
    
    //notacion polaca
    //Codigo tomado de https://censorcosmico.blogspot.com.co/2012/09/evaluar-expresion-postfija-usando-pilas.html
    public static void polaca  (){
        
    String expr = "3 5 * 2 +";
    String[] post = expr.split(" ");    
    
   
    Stack < String > E = new Stack < String > (); 
    Stack < String > P = new Stack < String > (); 
   
    for (int i = post.length - 1; i >= 0; i--) {
      E.push(post[i]);
    }

   
    String operadores = "+-*/%"; 
    while (!E.isEmpty()) {
      if (operadores.contains("" + E.peek())) {
        P.push(evaluar(E.pop(), P.pop(), P.pop()) + "");
      }else {
        P.push(E.pop());
      } 
    }

 
    System.out.println("Expresion: " + expr);
    System.out.println("Resultado: " + P.peek());

  }

  private static int evaluar(String op, String n2, String n1) {
    int num1 = Integer.parseInt(n1);
    int num2 = Integer.parseInt(n2);
    if (op.equals("+")) return (num1 + num2);
    if (op.equals("-")) return (num1 - num2);
    if (op.equals("*")) return (num1 * num2);
    if (op.equals("/")) return (num1 / num2);
    if (op.equals("%")) return (num1 % num2);
    return 0;
  }
    
    public static void main(String[] args) {
     
    }

    
}
