/*
 * 3) Escreva uma função que recebe dois vetores inteiros A[] e B[], em seguida, a sua
 função efetua a UNIÃO entre os vetores, ou seja, os elementos do vetor A mais aos
 elementos do vetor B, desde que os elementos de B não estejam presentes no vetor
 A, ao final sua função retorna uma String com a resposta. Os vetores dados não
 possuem valores duplicados e não estão ordenados.

 Exemplo:
 A[] = { 7, 2, 5, 8, 4} e B[]= {4, 2, 9, 5} então A  B= {7, 2, 5, 8, 4, 9}
 A[] = { 3, 9, 11} e B[]= {2, 6, 1} então A  B = {3, 9, 11, 2, 6, 1}
 */
package augoritmos_ii;

/**
 *
 * @author Matheus
 */
public class Uniao {

    public static String Unir(int a[], int b[]) {
        String resp = "";

        for (int i = 0; i < a.length; i++) {
            resp += a[i];
        }
        for (int i = 0; i < b.length; i++) {
            boolean teste = false;
            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) {
                    teste = true;
                }
            }
            if (teste == false) {
                resp += b[i];
            }
        }

        return resp;
    }
    
    public static void main(String[] args) {
        int A[] = { 3, 9, 11}, B[] = {2, 6, 1,11};
        //int A[] = { 7, 2, 5, 8, 4}, B[] = {4, 2, 9, 5};
        System.out.println("Os Elementos da União dos vetores são: "+Unir(A,B));
    }
}
