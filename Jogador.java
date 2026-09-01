public class Jogador {
    private String nome;
    private char simbolo;
    private int vitorias;

    /* exercicio 2
     * Erro de compilação: (Encapsulamento) os atributos são privados (private) para
     * impedir
     * acesso e modificação direta fora da classe, ocasionando o erro de compilacao
     */

    
    // exercicio 1
    public boolean jogar(Celula celula) {
        return celula.marcar(this.simbolo);
    }
    
    // exercicio 3
    public String getNome() {
        return this.nome;
    }

    public char getSimbolo() {
        return this.simbolo;
    }

    // exercicio 4
    public int getVitorias() {
        return this.vitorias;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }

    public void vencerPartida() {
        vitorias++;
    }

    // exercicio 5
    public Jogador(String nome, char simbolo) {
        this.nome = nome;
        this.simbolo = simbolo;
    }
}