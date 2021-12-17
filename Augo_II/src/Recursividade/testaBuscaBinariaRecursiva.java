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
public class testaBuscaBinariaRecursiva{
   // variavel global
   public static int passos=0;
   
   public static void  main( String args[] ){
  
    //int [] v= {3,7,8,11,14,18,21,25};
    int v[] = new int[1024];
    for(int i=0;i<v.length;i++)
      v[i] = i;
    
    System.out.println("resposta Busca Binaria Iterativa:"+buscaBinaria(v, v.length));
    System.out.println("Busca Binaria Para N="+v.length+" passos="+passos);
    passos = 0;
    System.out.println("resposta Busca Binaria Recursiva:"+buscaBinariaRecursiva(v, v.length, 0, v.length-1));
    System.out.println("Busca Binaria Para N="+v.length+" passos="+passos);
  
   
  }
  /*
  Método iterativo recebe um número x e um vetor em ordem crescente v[0..n-1]. 
  Ele devolve um índice m tal que v[m] == x ou devolve -1 se tal m não existe.
  */
  public static int buscaBinaria( int v[], int x )
  {
    int i, m, f;
    i = 0; f = v.length-1;
    while (i <= f){ 
      passos = passos + 1;
      m = (i + f)/2; 
      if (v[m] == x) 
        return m;
      
      if (x < v[m]) // esquerda
        f = m - 1;
      else // x > v[m] - direita
        i = m + 1;
    }
    return -1;
  }
  /*
  Método recursivo recebe um número x e um vetor em ordem crescente v[0..n-1]. 
  Ele devolve um índice m tal que v[m] == x ou devolve -1 se tal m não existe.
  */
  public static int buscaBinariaRecursiva( int v[], int x, int i, int f)
  {
     
     // condicao de parada para o caso de não achar
     if( i > f )
        return -1;
     passos = passos + 1;
     // calcula o meio do vetor  
     int m = (i+f)/2;
     // condicação de parada ou base da recursao, eh quando eu achei o elemento no vetor
     if( x == v[m])
        return m;
     else{
         // reduz a entrada 
         if (x < v[m]) // esquerda
            f = m - 1;
         else // x > v[m] - direita
            i = m + 1;
         
         // faz a chamada da funcao novamente
         int resp = buscaBinariaRecursiva(v,x,i,f);
         return  resp;
     }
  
      
    
  }

  public static void imprimeVetor( int [] v )
  {
    
    for( int i=0; i < v.length; i++ )
      System.out.println("v["+i+"]:"+v[i]);

  }
}