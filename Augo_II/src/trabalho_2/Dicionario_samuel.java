/*
 Entrega do Trabalho 2- Algoritmos e Programação II
 eu,

 Matheus Cipriano Santos

 declaro que
 todas as respostas são fruto do meu próprio trabalho,
 não copiei respostas de colegas externos à equipe,
 não disponibilizei minhas respostas para colegas externos ao grupo e
 não realizei quaisquer outras atividades desonestas para me beneficiar ou
 prejudicar outros.
 */
package trabalho_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Matheus
 */
public class Dicionario_samuel {

    //função para imprimir um vetor de string
    public static void imprimeV(String a[]) {
        for (int i = 0; i < a.length; i++) {
            /* por conta da inicialização zz nas posições do dicionario é preciso 
            um condicional a mais para não imprimir as posições com palavras repetidas
            que não serão usadas.
            */
            if(!"zz".equals(a[i])){
                System.out.println(a[i] + " ");
            }            
        }        
    }

    //Faz a busca binaria no Dicionário
    public static String buscaBinaria(String dicionario[], String palavra, int tamanhoComp) {
        //tamanhoComp é uma variavel cuja função é limitar o tamanho do vetor.
        // variáveis para setar as posições de procura do vetor.
        int i, m, f;
        i = 0;
        f = tamanhoComp;
        while (i <= f) {
            m = (i + f) / 2;
            //compara qual string vem antes da outra;            
            int direcao = palavra.compareTo(dicionario[m]);
            //decide se a palavra foi encontrada ou se ela é antes ou depois da
            //palavra testada
            if (direcao == 0) {
                return "encontrada";
            }
            if (direcao < 0) // esquerda
            {
                f = m - 1;
            } else // direcao > 0 - direita
            {
                i = m + 1;
            }
        }
        return "nenhuma";
    }

    //insere as palavras no dicionario utilizando o metodo ordenacaoInsercao.
    //retorna o vetor reordenado.
    static void OrdenacaoInsercao(String dicionario[], int tamanhoComp) {
        //tamanhoComp é uma variavel cuja função é limitar o tamanho do vetor.
        String comparadora;
        for (int i = 1; i < tamanhoComp; i++) {
            comparadora = dicionario[i];
            int j = 0;
            for (j = i; j > 0; j--) {
                if (comparadora.compareTo(dicionario[j - 1]) < 0) {
                    dicionario[j] = dicionario[j - 1];
                } else {
                    break;
                }
            }
            dicionario[j] = comparadora;
        }
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // declara objeto FileReader
        FileReader texto;
        // abre o arquivo.
        texto = new FileReader("texto3.txt");
        // cria uma stream
        BufferedReader buffer;
        // instancia um objeto para fazer leitura bufferizada
        buffer = new BufferedReader(texto);
        // Inicializa uma string para posteriormente guardar as palavras do texto;
        String linha = "";
        // uma string para receber a leitura do buffer e poder comparar com a string linha;
        String receptor = null;
        //um limitador de 1000 linhas conforme o enunciado pede.
        int maxLinhas = 0;
        // Um laço para ir lendo as linhas de um arquivo de texto separados por um
        //espaço em branco, para a leitura ao encontrar uma linha com um ponto.       
        while (!".".equals(receptor) && maxLinhas < 1000) {
            // o receptor recebe a linha lida;
            receptor = buffer.readLine();
            //converte todas as palavras para caixa baixa, todas minusculas.
            receptor = receptor.toLowerCase();
            // se caso a o receptor lido não for somente um ponto vamos acumulando 
            //  ele na string linha
            if (!".".equals(receptor)) {
                linha += receptor;
                maxLinhas++;
            }
        }
        // converte a String lida em um vetor de String
        // com os caracteres que estavam separados por espaco em branco
        String vetorString[] = linha.split(" ");
        //instancia um vetor para guardar as palavras do dicionário.
        //do tamanho do vetor de strings.
        String dicionario[] = new String[vetorString.length];
        //inicializa todas as posições do vetor dicionario para não causar erro
        //na comparação da busca binária.
        for (int i = 0; i < dicionario.length; i++) {
            dicionario[i] = "zz";
        }
        //contadora para o preenchimento do dicionario;
        int cont = 0;
        //um laço para chamar a função da busca binaria e procurar no dicionario 
        //cada palavra no vetor de strings.        
        for (int i = 0; i < vetorString.length; i++) {
            //uma variavel (status) para guardar o retorno da busca binaria.
            // a variavel i tambem serve como limitador do tamanho do dicionario
            //então também precisa ser passada para função.
            String status = buscaBinaria(dicionario, vetorString[i], i);
            //se caso a palavra não for encontrada ela será inserida na 
            //posição [i] do dicionario e é chamada a função ordenar para garantir
            // a posição correta a cada palavra nova.
            if (status.equals("nenhuma")) {
                dicionario[cont] = vetorString[i];
                OrdenacaoInsercao(dicionario, i);
                cont++;
            }
        }
        imprimeV(dicionario);
        //a variavel cont também serve para um contador de palavras.
        System.out.println("total de palavras diferentes no dicionario:" + cont);
        // fecha o a leitura bufferizada e o arquivo
        buffer.close();
    }
}
