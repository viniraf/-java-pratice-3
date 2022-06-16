import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        int num_tab, num_excesso_a, num_excesso_b, num_excesso_c;
        int armadilha_1, armadilha_2, armadilha_3;
        int dado[] = new int[8], soma_dados;
        int jogador_a = 0, jogador_b = 0, jogador_c = 0;
        int jogar_dado_a, jogar_dado_b, jogar_dado_c;
        int op_rod = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numero de quadrados na trilha");
        num_tab = entrada.nextInt();
        System.out.println("\nDigite a posiçoes das 3 armadilhas");
        System.out.println("\nPosiçao da armadilha 1 (de 1 até o numero de quadrados digitado anteriormente)");
        armadilha_1 = entrada.nextInt();
        System.out.println("\nPosiçao da armadilha 2 (de 1 até o numero de quadrados digitado anteriormente)");
        armadilha_2 = entrada.nextInt();
        System.out.println("\nPosiçao da armadilha 3 (de 1 até o numero de quadrados digitado anteriormente)");
        armadilha_3 = entrada.nextInt();

        do {
        // Jogador A
        System.out.println("_____________________________________");
        System.out.println("\n");
        System.out.println("| Jogador A |");
        System.out.println("\nDigite 1 para jogar o dado");
        jogar_dado_a = entrada.nextInt();
        System.out.println("");
        if (jogar_dado_a == 1) {
            Random gerador = new Random(); // gera os numeros aleatorios dos 2 dados
            for (int i = 1; i < 3; i++) {
                dado[i] = gerador.nextInt((6 - 1) + 1) + 1;
                System.out.println("Dado " + i + " - " + dado[i]);
            }
            soma_dados = dado[1] + dado[2];
            System.out.println("\nJogador A deve andar " + soma_dados + " quadrados");
            System.out.println("");

            jogador_a = jogador_a + soma_dados;

            // Verifica se o jogador caiu numa armadilha
            if (jogador_a == armadilha_1 || jogador_a == armadilha_2 || jogador_a == armadilha_3 ){
                System.out.println("\nJogador A caiu numa armadilha e deve voltar 2 quadrados");
                System.out.println("Jogador A estava no quadrado " + jogador_a + " quando caiu na armadilha");
                jogador_a = jogador_a - 2;
                System.out.println("Jogador A esta no quadrado " + jogador_a + " depois de cair na armadilha" );
                System.out.println("");
                soma_dados = 0;
                
            } else {
                System.out.println("Jogador A esta no quadrado " + jogador_a);
                System.out.println("");
                soma_dados = 0;
            } 
           
            // Verifica se o jogador tirou numero maior que a ultima posição do tabuleiro
            if (jogador_a > num_tab) {
                num_excesso_a = jogador_a - num_tab;
                jogador_a = (jogador_a - num_excesso_a) - num_excesso_a;
                System.out.println("\nJogador A excedeu o número limite do tabuleiro");
                System.out.println("Jogador A voltará o excedente do limite (" + num_excesso_a + " quadrados a partir do ultimo quadrado)");
                System.out.println("Jogador A esta no quadrado " + jogador_a);
                System.out.println("");
                soma_dados = 0;
                
                // Verifica se o jogador caiu numa armadilha depois de voltar os quadrados em excesso
                if (jogador_a == armadilha_1 || jogador_a == armadilha_2 || jogador_a == armadilha_3 ){
                    System.out.println("\nJogador A caiu numa armadilha e deve voltar 2 quadrados");
                    System.out.println("Jogador A estava no quadrado " + jogador_a + " quando caiu na armadilha");
                    jogador_a = jogador_a - 2;
                    System.out.println("Jogador A esta no quadrado " + jogador_a + " depois de cair na armadilha" );
                    System.out.println("");
                    soma_dados = 0;
                }
            } 
        }
        
        System.out.println("_____________________________________");
        System.out.println("\n");

        // Jogador B
        System.out.println("| Jogador B |");
        System.out.println("\nDigite 1 para jogar o dado");
        jogar_dado_b = entrada.nextInt();
        System.out.println("");
        if (jogar_dado_b == 1) {
            Random gerador = new Random(); // gera os numeros aleatorios dos 2 dados
            for (int i = 1; i < 3; i++) {
                dado[i] = gerador.nextInt((6 - 1) + 1) + 1;
                System.out.println("Dado " + i + " - " + dado[i]);
            }
            soma_dados = dado[1] + dado[2];
            System.out.println("\nJogador B deve andar " + soma_dados + " quadrados");
            System.out.println("");

            jogador_b = jogador_b + soma_dados;

            // Verifica se o jogador caiu numa armadilha
            if (jogador_b == armadilha_1 || jogador_b == armadilha_2 || jogador_b == armadilha_3 ){
                System.out.println("\nJogador B caiu numa armadilha e deve voltar 2 quadrados");
                System.out.println("Jogador B estava no quadrado " + jogador_b + " quando caiu na armadilha");
                jogador_b = jogador_b - 2;
                System.out.println("Jogador B esta no quadrado " + jogador_b + " depois de cair na armadilha" );
                System.out.println("");
                soma_dados = 0;
            } else {
                System.out.println("Jogador B esta no quadrado " + jogador_b);
                System.out.println("");
                soma_dados = 0;
            }

            // Verifica se o jogador tirou numero maior que a ultima posição do tabuleiro
            if (jogador_b > num_tab) {
                num_excesso_b = jogador_b - num_tab;
                jogador_b = (jogador_b - num_excesso_b) - num_excesso_b;
                System.out.println("\nJogador B excedeu o número limite do tabuleiro");
                System.out.println("Jogador A voltará o excedente do limite (" + num_excesso_b + " quadrados a partir do ultimo quadrado)");
                System.out.println("Jogador B esta no quadrado " + jogador_b);
                System.out.println("");

                // Verifica se o jogador caiu numa armadilha depois de voltar os quadrados em excesso
                if (jogador_b == armadilha_1 || jogador_b == armadilha_2 || jogador_b == armadilha_3 ){
                    System.out.println("\nJogador B caiu numa armadilha e deve voltar 2 quadrados");
                    System.out.println("Jogador B estava no quadrado " + jogador_b + " quando caiu na armadilha");
                    jogador_b = jogador_b - 2;
                    System.out.println("Jogador B esta no quadrado " + jogador_b + " depois de cair na armadilha" );
                    System.out.println("");
                    soma_dados = 0;
                } 
            }
        }

        // Jogador C
        System.out.println("| Jogador C |");
        System.out.println("\nDigite 1 para jogar o dado");
        jogar_dado_c = entrada.nextInt();
        System.out.println("");
        if (jogar_dado_c == 1) {
            Random gerador = new Random(); // gera os numeros aleatorios dos 2 dados
            for (int i = 1; i < 3; i++) {
                dado[i] = gerador.nextInt((6 - 1) + 1) + 1;
                System.out.println("Dado " + i + " - " + dado[i]);
            }
            soma_dados = dado[1] + dado[2];
            System.out.println("\nJogador C deve andar " + soma_dados + " quadrados");
            System.out.println("");

            jogador_c = jogador_c + soma_dados;

            // Verifica se o jogador caiu numa armadilha
            if (jogador_c == armadilha_1 || jogador_c == armadilha_2 || jogador_c == armadilha_3 ){
                System.out.println("\nJogador C caiu numa armadilha e deve voltar 2 quadrados");
                System.out.println("Jogador C estava no quadrado " + jogador_c + " quando caiu na armadilha");
                jogador_c = jogador_c - 2;
                System.out.println("Jogador C esta no quadrado " + jogador_c + " depois de cair na armadilha" );
                soma_dados = 0;
            } else {
                System.out.println("Jogador C esta no quadrado " + jogador_c);
                System.out.println("");
                soma_dados = 0;
            }

            // Verifica se o jogador tirou numero maior que a ultima posição do tabuleiro
            if (jogador_c > num_tab) {
                num_excesso_c = jogador_c - num_tab;
                jogador_c = (jogador_c - num_excesso_c) - num_excesso_c;
                System.out.println("\nJogador C excedeu o número limite do tabuleiro");
                System.out.println("Jogador A voltará o excedente do limite (" + num_excesso_c + " quadrados a partir do ultimo quadrado)");
                System.out.println("Jogador C esta no quadrado " + jogador_c);
                System.out.println("");

                // Verifica se o jogador caiu numa armadilha depois de voltar os quadrados em excesso
                if (jogador_c == armadilha_1 || jogador_c == armadilha_2 || jogador_c == armadilha_3 ){
                    System.out.println("\nJogador C caiu numa armadilha e deve voltar 2 quadrados");
                    System.out.println("Jogador C estava no quadrado " + jogador_c + " quando caiu na armadilha");
                    jogador_c = jogador_c - 2;
                    System.out.println("Jogador C esta no quadrado " + jogador_c + " depois de cair na armadilha" );
                    soma_dados = 0;
                }
            } 
        }

        if (jogador_a == num_tab || jogador_b == num_tab || jogador_c == num_tab){
            System.out.println("\nUm dos jogadores chegou no quadrado final e venceu o jogo");
            System.out.println("Aperte 2 para ver quem foi o vencedor");
            op_rod = entrada.nextInt();
        } else {
            System.out.println("\nFim da rodada");
            System.out.println("Aperte 1 para iniciar outra rodada");
            op_rod = entrada.nextInt();
        }

        } while (op_rod == 1);

        System.out.println("\n- Vencedor -");
        
        if (jogador_a > jogador_b || jogador_a > jogador_c){
            System.out.println("Jogador A venceu");
        } else if(jogador_b > jogador_a || jogador_b > jogador_c){
            System.out.println("Jogador B venceu");
        } else {
            System.out.println("Jogador C venceu");
        }
    }
}