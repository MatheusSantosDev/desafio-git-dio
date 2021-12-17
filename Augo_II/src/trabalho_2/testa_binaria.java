/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_2;

/**
 *
 * @author Matheus
 */
public class testa_binaria {
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
            System.out.println("direção: "+direcao);
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
    
    public static void main(String[] args) {
        String dicionario[]= {"ana","barbara","catia","david","eliane","fabio","gabriel","helio",};
        String palavra = "k";
        int tamanhoComp = 7;
        System.out.println("resultado da busca : " + buscaBinaria(dicionario,palavra,tamanhoComp));
    }
}
