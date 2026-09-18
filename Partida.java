import java.util.Random;

public class Partida {
    // Exercicio 5
    private Celula[] celulas;
    private Jogador[] jogadores;
    private int contJogador;

    // Exercicio 6
    private int turno;       // 0 ou 1: de quem é a vez
    private int contJogadas; // quantas marcações já deram certo
    private Random random;   // escolhe um número dentro de um intervalo

    public Partida() {
        // Exercicio 5
        this.celulas = new Celula[9];
        for (int i = 0; i < celulas.length; i++) {
            this.celulas[i] = new Celula(i);
        }
        this.jogadores = new Jogador[2];
        this.contJogador = 0;

        // Exercicio 6
        this.turno = 0;
        this.contJogadas = 0;
        this.random = new Random();
    }

    // Exercicio 5
    public void addJogador(Jogador jogador) {
        if (contJogador < jogadores.length) {
            jogadores[contJogador] = jogador;
            contJogador++;
        }
    }

    // Exercicio 6
    public boolean jogar(int posicao) {
        boolean marcou = jogadores[turno].jogar(celulas[posicao]);
        if (marcou) {
            contJogadas++;
            turno = (turno + 1) % 2;
        }
        return marcou;
    }

    public boolean partidaTerminada() {
        return contJogadas == 9;
    }

    // Continuação Exercicio 6
    public Jogador getJogadorDaVez() {
        return jogadores[turno];
    }

    public void definirQuemComeca() {
        turno = random.nextInt(2);
    }

    // Exercicio 7
    public String apresentarTabuleiro() {
        String resultado = "";
        for (int i = 0; i < celulas.length; i++) {
            if (i % 3 == 0) {
                resultado += "\n";
            }
            resultado += celulas[i].getSimbolo() + " ";
        }
        return resultado;
    }
}