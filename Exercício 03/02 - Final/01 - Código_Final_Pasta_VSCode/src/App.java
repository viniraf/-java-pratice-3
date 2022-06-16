import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        // Escreva um programa em Java que permita que digitado um valor referente 
        // a uma quantidade monetária e dê como resultado o número total mínimo de 
        // moedas que equivalem ao mesmo valor. Assuma que todos os valores 
        // digitados sejam necessariamente maiores ou iguais a zero, de forma 
        // que, não há necessidade de fazer esta consistência.

        // Espera-se que o algoritmo/programa gere apenas um valor como resposta.

        double valor_digitado, valor_novo, diferenca;
        int soma_moedas_inteiras = 0, soma_moedas_50 = 0, soma_moedas_25 = 0, soma_moedas_10 = 0, soma_moedas_05 = 0, soma_moedas_01 =0, soma_todas_moedas;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor");
        valor_digitado = entrada.nextDouble();
        
        if (valor_digitado == (int)valor_digitado){ // Se o número for inteiro, só conta moedas de 1 real
            for (int i = 0 ; i <= (valor_digitado -1); i++){
                soma_moedas_inteiras++;
            }

        } else if (valor_digitado == (Double)valor_digitado) { // Se o número for com vírgula

            valor_novo = Math.floor(valor_digitado); // Arredonda pra baixo e deixa inteiro
            
            // Conta o valor antes da virgula com moedas de 1 real
            for (int i = 0 ; i <= (valor_digitado - 1); i++){
                soma_moedas_inteiras++;
            }
           
           // Calcula a diferença 
            diferenca = valor_digitado - valor_novo;

                // Adiciona moeda de 50
                while(diferenca >= 0.50){
                    soma_moedas_50++;
                    valor_novo = valor_novo + 0.50;
                    diferenca = diferenca - 0.50;
                }

                // Adiciona moeda de 25
                while (diferenca >= 0.25 && diferenca < 0.50) {
                    soma_moedas_25++;
                    valor_novo = valor_novo + 0.25;
                    diferenca = diferenca - 0.25;
                }

                // Adiciona moeda de 10 centavos
                while (diferenca >= 0.10 && diferenca < 0.25) {
                    soma_moedas_10++;
                    valor_novo = valor_novo + 0.10;
                    diferenca = diferenca - 0.10;
                }

                // Adiciona moeda de 05 centavos
                while (diferenca >= 0.05 && diferenca < 0.10) {
                    soma_moedas_05++;
                    valor_novo = valor_novo + 0.05;
                    diferenca = diferenca - 0.05;
                }

                // Adiciona moeda de 01 centavo
                while (diferenca >= 0.001 && diferenca < 0.05) {
                    soma_moedas_01++;
                    valor_novo = valor_novo + 0.01;
                    diferenca = diferenca - 0.01;
                }
             
            // Contabiliza o total de moedas utilizadas 
            soma_todas_moedas = soma_moedas_inteiras + soma_moedas_50 + soma_moedas_25 + soma_moedas_10 + soma_moedas_05 + soma_moedas_01;
            System.out.println("\nO mínimo de moedas para este valor é de " + soma_todas_moedas + " moedas\n");
        }
    }
}
