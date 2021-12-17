package Exercicio_Piscina_e_baldes;

/**
 *
 * @author Matheus
 */
public class Principal {

    public static String CaraOuCoroa(int jog) {
        String resposta;
        if (jog % 2 != 0) {
            resposta = "Marcelo";
        } else {
            resposta = "Carlos";
        }
        return resposta;
    }

    public static void main(String[] args) {
        int[] sequencia = {3, 5, 2, 1, 4, 6};
        int i = 0, jog = 0, troca;
        String resposta;
        while (i < sequencia.length - 1) {
            if (sequencia[i] < sequencia[i + 1]) {
                i++;
            } else {
                jog++;
                troca = sequencia[i];
                sequencia[i] = sequencia[i + 1];
                sequencia[i + 1] = troca;
                i = 0;
            }
        }
        resposta = CaraOuCoroa(jog);
        System.out.println("Vencedor: " + resposta + " #### Total de jogadas: " + jog);
    }
}
