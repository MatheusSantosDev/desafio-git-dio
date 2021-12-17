
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package augoritmos_ii;

/**
 *
 * @author Matheus
 */
public class TesteEnade {

    public static void enigma(int v[]) {
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] > v[i]) {

                    int aux = v[i];

                    v[i] = v[j];

                    v[j] = aux;

                }
            }
        }

    }

    public static void main(String args[]) {
        String str = "";
        String teste = "code";
        String dois = "x";
        dois = teste.substring(0, 2);
        dois = String.valueOf(teste.charAt(0));
        dois.startsWith("hi");
       
        int a = 0;
        int b = 1;
        int resultado = Math.abs(a-10);
        
  
        
        int v[] = {6, 3, 4, 1, 2, 5};

        enigma(v);

        System.out.print("[");

        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");

            System.out.print("]");
        }
    }
}
