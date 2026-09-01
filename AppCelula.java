import javax.swing.JOptionPane;

public class AppCelula {
    public static void main(String args[]) {
        /*
        // exercicio 6: criando as três células e imprimindo o total via classe
        Celula c1 = new Celula(1);
        Celula c2 = new Celula(2);
        Celula c3 = new Celula(3);

        System.out.println("Total de células criadas: " + Celula.getContCelula());

        // exercicio 5: instanciando os jogadores
        Jogador jogador1 = new Jogador("Otaviano", 'X');
        Jogador jogador2 = new Jogador("Marco Antonio", 'O');
        */

        /* 
         exercicio 3 (corrigindo com os getters e setters)
         [Comentado para não duplicar as variáveis e não dar erro pelo uso do construtor sem parâmetros]
         
         Jogador jogador1 = new Jogador();
         jogador1.setNome("Otaviano");
         jogador1.setSimbolo('X');

         Jogador jogador2 = new Jogador();
         jogador2.setNome("Marco Antonio");
         jogador2.setSimbolo('O');
        */

        /*
        // exercicio 7: Jogadas
        fazerJogada(jogador1, c1, c2, c3);
        fazerJogada(jogador2, c1, c2, c3);
        fazerJogada(jogador1, c1, c2, c3);

        // Estado final
        System.out.println("\n--- Estado Final do Tabuleiro ---");
        System.out.println("Célula 1: " + c1.getSimbolo());
        System.out.println("Célula 2: " + c2.getSimbolo());
        System.out.println("Célula 3: " + c3.getSimbolo());
        */

        // exercicio 8: Desafio final
        String nome1 = JOptionPane.showInputDialog("Nome do Jogador 1:");
        char sim1 = JOptionPane.showInputDialog("Símbolo do Jogador 1:").charAt(0);
        String nome2 = JOptionPane.showInputDialog("Nome do Jogador 2:");
        char sim2 = JOptionPane.showInputDialog("Símbolo do Jogador 2:").charAt(0);

        Jogador j1 = new Jogador(nome1, sim1);
        Jogador j2 = new Jogador(nome2, sim2);

        Celula cel1 = new Celula(1);
        Celula cel2 = new Celula(2);
        Celula cel3 = new Celula(3);

        Jogador[] jogadores = {j1, j2};
        int turno = 0;
        int marcadas = 0;

        while (marcadas < 3) {
            Jogador atual = jogadores[turno];
            String in = JOptionPane.showInputDialog(
                "Vez de " + atual.getNome() + " (" + atual.getSimbolo() + ")\nEscolha a célula (1, 2 ou 3):"
            );
            int num = Integer.parseInt(in);
            
            Celula escolhida = (num == 1) ? cel1 : (num == 2) ? cel2 : cel3;

            if (!atual.jogar(escolhida)) {
                JOptionPane.showMessageDialog(null, "Célula já ocupada! Tente novamente.");
            } else {
                marcadas++;
                turno = (turno + 1) % 2;
            }
        }

        String resFinal = "--- ESTADO FINAL ---\n" +
                          "Célula 1: " + cel1.getSimbolo() + "\n" +
                          "Célula 2: " + cel2.getSimbolo() + "\n" +
                          "Célula 3: " + cel3.getSimbolo() + "\n\n" +
                          "Total de células criadas: " + Celula.getContCelula();

        JOptionPane.showMessageDialog(null, resFinal);

        /*
         exercicio 5
         RESPOSTA: Daria erro de compilação, pois ao definir explicitamente um 
         construtor com parâmetros, o Java deixa de fornecer o construtor padrão (sem parâmetros). 
         O compilador exigiria que os parâmetros (String, char) fossem passados entre os parênteses.
        */ 

        /*
         Exercicio 3
         RESPOSTA:
         
         1. setSimbolo(): NÃO faz sentido.
         A alteração do símbolo deve ser feita exclusivamente pelo método marcar(),
         que valida se a célula está disponível (simbolo == '-'). Criar um
         setSimbolo()
         quebraria o encapsulamento e a regra de negócio do jogo, permitindo
         sobrescrever
         uma jogada existente sem qualquer validação.
         
         2. setPosicao(): NÃO faz sentido (se a posição for fixa no tabuleiro).
         A posição de uma célula em um tabuleiro (ex: índice de 0 a 8) é um
         identificador
         imutável que define onde ela está localizada. Uma vez criada, a célula não
         muda
         de lugar. Por isso, a posição deveria ser definida apenas via Construtor e
         ter
         somente o método getPosicao().
        */
    }

    // exercicio 7 (Método auxiliar)
    /*private static void fazerJogada(Jogador jogador, Celula c1, Celula c2, Celula c3) {
        boolean jogadaValida = false;

        while (!jogadaValida) {
            String input = JOptionPane.showInputDialog(
                "Jogador " + jogador.getNome() + " (" + jogador.getSimbolo() + "), em qual célula quer marcar (1, 2 ou 3)?"
            );

            int numeroCelula = Integer.parseInt(input);
            Celula celulaEscolhida = null;

            if (numeroCelula == 1) {
                celulaEscolhida = c1;
            } else if (numeroCelula == 2) {
                celulaEscolhida = c2;
            } else if (numeroCelula == 3) {
                celulaEscolhida = c3;
            }

            // Tenta realizar a jogada
            boolean retorno = jogador.jogar(celulaEscolhida);

            if (!retorno) {
                // Se o retorno for false (ocupada), avisa e repete para o mesmo jogador
                JOptionPane.showMessageDialog(null, "Célula já ocupada! Escolha outra.");
            } else {
                jogadaValida = true;
            }
        }
    }*/
}