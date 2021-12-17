package Trabalho_1;

/**
 *
 * @author matheus.csantos41
 */
public class Augo_II {

    public static void main(String args[]) {
        int A[] = {7, 2, 5, 8, 4}, B[] = {4, 2, 9, 5};

        System.out.println("resultado da interseccao=" + interseccao(A, B));
    }

    public static String interseccao(int A[], int B[]) {
        String resp = "";

        for (int j = 0; j < A.length; j++) {

            for (int i = 0; i < B.length; i++) {
                if (A[j] == B[i]) {
                    resp += A[j];
                }
            }
        }

        return resp;
    }
}
