public class Celula {
    // exercicio 2
    private char simbolo = '-';
    private int posicao;

    // exercicio 6: Atributo estático compartilhado por todas as instâncias
    private static int contCelula;

    /*
     Erro de compilação: (Encapsulamento) os atributos são privados (private) para
     impedir
     acesso e modificação direta fora da classe, ocasionando o erro de compilacao
    */

    // exercicio 5
    public Celula() {
        this.simbolo = '-';
        contCelula++; // exercicio 6: incrementa a contagem de células
    }

    // exercicio 5
    public Celula(int posicao) {
        this.posicao = posicao;
        this.simbolo = '-';
        contCelula++; // exercicio 6: incrementa a contagem de células
    }

    // exercicio 6: Método estático para acessar o contador global
    public static int getContCelula() {
        return contCelula;
    }

    // exercicio 4
    public char getSimbolo() {
        return this.simbolo;
    }

    public int getPosicao() {
        return this.posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public boolean marcar(char simbolo) {
        // exercicio 4 Chamada atualizada para usar getSimbolo()
        if (this.getSimbolo() == '-') {
            this.simbolo = simbolo;
            return true;
        } else {
            return false;
        }
    }
}