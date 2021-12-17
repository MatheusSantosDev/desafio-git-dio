/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quickSort;

/*
 o QuickSort recebe como parâmetro p, r e o vetor e executa recursivamente 
 enquanto p < r.
 Primeiramente o algoritmo  QuickSort faz a partição do vetor em seguida o QuickSort  
 faz uma chamada recursiva para parte a esquerda do pivô e a para parte direita do pivô.
 */
public class testaQuickSort {

    public static int passos = 0;

    public static void main(String args[]) {
        //int v[] = {5,4,3,2,1};
        int v[] = {4, 3, 4, 4, 3};
        //int v[] = {3, 5, 2, 1, 4};
        System.out.println("\nvetor inicialmente");
        printaVetor(v);

        //rearranja o vetor
        QuickSort(v, 0, v.length - 1);

        System.out.println("\nvetor rearranjado");
        printaVetor(v);

        System.out.println("\nn=" + v.length + " passos=" + passos);

        System.out.println("\nfim de programa.");

    }

    public static void QuickSort(int v[], int p, int r) {
        // se inicio do vetor (p) for menor que o fim do vetor (r)
        if (p < r) {
            // faz a particao
            int j = particao(v, p, r);
            System.out.println("p: " + p);
            System.out.println("r: " + r);
            System.out.println("j: " + j);
            // chama para esquerda do pivo
            System.out.println("quick sort esquerda");
            printaVetor(v);
            QuickSort(v, p, j - 1);
            System.out.println("quick sort direita");
            printaVetor(v);
            QuickSort(v, j + 1, r);
        }
    }

    public static int particao(int v[], int p, int r) {
        int c = v[p]; // pivo=c e eh o primeiro elemento do vetor
        int i = p + 1, j = r;
        while (i <= j) {
            passos++;
            // varre o vetor do início para o fim e parar o índice i no primeiro 
            // elemento MAIOR encontrado em relação ao pivô.
            // descarta os elementos que sao menores ou igual em relacao ao pivo
            if (v[i] <= c) {
                i++; // descarta a posicao
            } // Em seguida varrer a lista do fim para o início, usando o índice j, 
            // até encontrar o primeiro elemento MENOR ou IGUAL que o pivô
            // descarta os elementos maiores em relacao ao pivo
            else if (v[j] > c) {
                j--;// descarta a posicao
            } // se temos um elemento MAIOR no inicio e um elemento MENOR ou IGUAL no 
            // no final, trocamos os elementos.
            else {
                int temp;
                temp = v[i];
                v[i] = v[j];
                v[j] = temp;
                // descartas as posicoes
                i++;
                j--;
            }
        }
        // Ao final troca-se o elemento na posição j com o pivô e o índice do pivô (j) 
        // é devolvido.
        v[p] = v[j]; // v[p] primeiro elemento recebe o elemento na posicao j
        v[j] = c; // v[j] recebe o pivo
        return j; // retorna o indice onde esta o pivo

    }

    public static void printaVetor(int v[]) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("");
    }

}
