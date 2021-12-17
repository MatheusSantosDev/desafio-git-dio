/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividade;

/**
 *
 * @author Matheus
 */
public class testaFibonacci{
    public static void main(String[] args) {
      System.out.println("calculo recursivo: "+fibo(4)); // testar fibo(50)=resp 12.586.269.025 para fibo(50)
      System.out.println("calculo iterativo: "+fiboIterativo(4)); // testar fiboIterativo(50)=resp 12.586.269.025  
      System.out.println("profundidade     : "+fiboProfundidade(4)); // testar fiboIterativo(50)=resp 12.586.269.025                                                      
    }
    public static long fiboIterativo( int n )
    { 
      long f1 = 0;
      long f2 = 1;
      long f3 = n;
      for( int i=2;i<=n;i++){
         f3 = f1 + f2;
         f1 = f2;
         f2 = f3;
      }
      return f3;
       
    }
    public static long fibo (long n){
      // calculo direto n=0 retorna 0 n=1 retorna 1
      if(n<2)
         return n;
      // para outros casos retorna fibo de (n-1)+(n-2) 
      return fibo(n-1)+fibo(n-2);
    }
    public static long fiboProfundidade(long n){
      // calculo direto n=0 retorna 0 chamadas recursivas n=1 retorna 0 chamadas recursivas
      if(n<2)
         return 0;
      // para outros casos retorna fiboProfundidade de (n-1)+(n-2) + as duas chamadas recursivas 
      return fiboProfundidade(n-1)+fiboProfundidade(n-2)+2;
    }
}