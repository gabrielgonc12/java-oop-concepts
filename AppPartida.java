import javax.swing.JOptionPane;

public class AppPartida {
    public static void main(String args[]) {
        // Exercicio 7 — Desafio final: AppPartida.java
        // crie uma Partida
        Partida partida = new Partida();

        // peça, por JOptionPane, nome e símbolo dos dois jogadores, crie os dois objetos Jogador e adicione à partida
        for (int i = 1; i <= 2; i++) {
            String nome = JOptionPane.showInputDialog("Nome do Jogador " + i + ":");
            String entradaSimbolo = JOptionPane.showInputDialog("Símbolo do Jogador " + i + " (ex: X ou O):");
            char simbolo = entradaSimbolo.charAt(0);
            
            Jogador j = new Jogador(nome, simbolo);
            partida.addJogador(j);
        }

        // chame partida.definirQuemComeca() antes de começar o loop de turnos
        partida.definirQuemComeca();

        // enquanto !partida.partidaTerminada()
        while (!partida.partidaTerminada()) {
            String nomeVez = partida.getJogadorDaVez().getNome();
            String entrada = JOptionPane.showInputDialog("Vez de " + nomeVez + "!\nDigite a posição (0 a 8):");
            int posicao = Integer.parseInt(entrada);

            // chame partida.jogar(posicao) — se vier false, avise que a célula está ocupada
            boolean ok = partida.jogar(posicao);
            if (!ok) {
                JOptionPane.showMessageDialog(null, "Célula já ocupada! Tente novamente.");
            }
        }

        // ao final, mostre o tabuleiro 3x3 numa caixa de mensagem final
        JOptionPane.showMessageDialog(null, "Fim de jogo!\n" + partida.apresentarTabuleiro());
    }
}