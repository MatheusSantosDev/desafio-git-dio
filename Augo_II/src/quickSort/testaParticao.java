package quickSort;

/*
 Escreva uma função que recebe um vetor como parâmetro, a sua função seleciona o 
 primeiro elemento de um vetor e rearranja o vetor de forma que todos elementos 
 menores ou iguais ao primeiro elemento fiquem a sua esquerda e os maiores a sua 
 direita.
 */
public class testaParticao {

    public static int passos = 0;

    public static void main(String args[]) {

        int v[] = {5, 6, 2, 7, 9, 1, 8, 3, 7};

        System.out.println("\nvetor inicialmente");
        printaVetor(v);

        //rearranja o vetor
        particao(v);

        System.out.println("\nvetor rearranjado");
        printaVetor(v);

        System.out.println("\nn=" + v.length + " passos=" + passos);

        System.out.println("\nfim de programa.");

    }

    public static int particao(int v[]) {
        int c = v[0]; // pivo=c e eh o primeiro elemento do vetor
        int i = 1, j = v.length - 1;
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
        v[0] = v[j];
        v[j] = c;
        return j;

    }

    public static void printaVetor(int v[]) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
    }

}
