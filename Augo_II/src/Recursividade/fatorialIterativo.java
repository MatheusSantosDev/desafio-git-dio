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
public class fatorialIterativo{
  public static void  main( String args[] ){
  
    
    int resposta = fatorial( 3 );
   
    System.out.println("Fatorial calculado:"+resposta);
  
  }
  public static int fatorial( int n )
  {
    int fat = 1; 
    for( int termo = 1; termo <= n; termo++ ){
      fat = fat * termo;
    }
    return fat;

  }
  
}