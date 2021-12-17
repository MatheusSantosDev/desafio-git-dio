/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package augoritmos_ii;
/**
 *
 * @author matheus.csantos41
 */
public class Intercecao_Variavel {
 



    public static String interseccao(int a[], int b[]){
        String resp=""; 
        int r=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i]==b[j]) {
                    r=a[i];
               
                }
               
            }
            if(r!=a[i]){
                resp+=a[i];
            }
        }
        
   
      return resp;
   }
    public static void main(String[] args) {
       //int A[] = { 3, 9, 11},B[]= {2, 6, 1};
       int A[] = {  7, 2, 5, 8, 4},B[]= {4, 2, 9, 5};
        System.out.println("resultado da interseccao= "+interseccao(A,B));
    }
    
}

