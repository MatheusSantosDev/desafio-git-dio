/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busca_Linear_e_Binaria;

/**
 *
 * @author Matheus
 */
/*Dado um vetor com números pares e ímpares, escreva uma função para colocar 
todos os números pares à frente no vetor e os ímpares ao final. 
Você não pode usar outro vetor como área auxiliar. 
Resolva esse exercício sem um vetor um auxiliar e a 
função deve rearranjar o vetor com no máximo n passos.
*/
public class ParImpar{
   public static int passos=0;
   public static void main(String args[]){
      //int v[] = {1,7,6,8,9,5,2,4};
      //int v[] = {1,7,9,5,6,8,2,4};
      // pior caso do algoritmos eh quando ele só possui numeros pares ou numeros impares, para qualquer tamanho
      // nesse caso o algoritmo executara n passos para resolver o problema
      int v[] = {2,4,6,8,10,12,14,16};
         
      System.out.println("\nvetor inicialmente");
      printaVetor(v);
      
      //rearranja o vetor
      parImpar(v);
      
      System.out.println("\nvetor rearranjado");
      printaVetor(v);
      
      System.out.println("\nn="+v.length+" passos="+passos);
      
      System.out.println("\nfim de programa.");
      
   }
   public static void parImpar(int v[]){
      int i=0,f=v.length-1;
      while(i<=f){
         passos++;
         // se no inicia tiver um par, ele está na posicao certa
         // deve ser descartado
         if( v[i]%2==0)
            i++; // descarta a posicao
         // se no final tiver um impar, ele esta na posicao certa
         // e deve ser descartado
         else if( v[f]%2==1)
            f--;// descarta a posicao
        
         // tem um impar no inicio e um par no final
         // troca os elementos
         else{
            int temp;
            temp = v[i];
            v[i] = v[f];
            v[f] = temp;
            // descartas as posicoes
            i++;f--;
         }
      }
   }
   public static void printaVetor(int v[]){
      for(int i=0;i<v.length;i++)
         System.out.print(v[i]+" ");
   }


}