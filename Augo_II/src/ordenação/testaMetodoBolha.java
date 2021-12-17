/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenação;

/**
 *
 * @author Matheus
 */
public class testaMetodoBolha {
    public static void  main( String args[] ){
  
    int [] v={5,4,3,2,1};
    int trocas = MetadoBolha( v );
    // numero de passos do algoritmo na pior configuração de entrda
    //(n^2-n)/2
    // para n = 10 teriamos (100-10)/2 = 45
    // para n = 5 teriamos (25-5)/2 = 10
    System.out.println("trocas="+trocas);
       
    imprimeVetor( v );
  }
  public static int MetadoBolha( int v[]){
     int trocou = 0;
     for(int i=0;i<v.length-1;i++)
        for( int j=0; j<v.length-1;j++)
           if( v[j]>v[j+1]){
              System.out.print("troca "+v[j]+" com "+v[j+1]+":");
              int tmp = v[j];
              v[j] = v[j+1];
              v[j+1]= tmp;
              trocou++;
              
              imprimeVetor( v );
           }
     return trocou;
  }
  public static void imprimeVetor( int [] v )
  {
    for( int i=0; i < v.length; i++ )
      System.out.print(+v[i]+ " ");
    System.out.println();
  }
}
