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
public class testaFatorialRecursivo {
    public static void main(String[] args) {
      System.out.println("resp "+fatorial(5));

    }
    public static int fatorial( int n ){
        int aux1=0, aux2=0, aux3=0;
        // se chegou na condição de parada (base da recursão) então
        if( n == 0 )
          // retorne o valor que sabemos calcular de forma direta.
        return 1;
        else{
          // Reduza os valores dos parâmetros.
          aux1 = n - 1;
          // Faça a chamada da função novamente (chamada recursiva).
          aux2 = fatorial(aux1);
          // Use o retorno da função para calcular o 
          // resultado da solução completa
          aux3 = n*aux2;
          return aux3;
        }


    }

}