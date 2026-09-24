package br.uesb.locadora.modelo;

public class Bicicleta {

    // Exercicio 1
    private String modelo;
    private String cor;
    private boolean disponivel;

    // Exercicio 6
    private TipoBicicleta tipo;

    // Exercicio 1 (construtor) + Exercicio 6 (parametro tipo adicionado)
    public Bicicleta(String modelo, String cor, TipoBicicleta tipo) {
        this.modelo = modelo;
        this.cor = cor;
        this.tipo = tipo;
        this.disponivel = true;
    }

    // Exercicio 1
    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    /*
     * alugar() retorna boolean, e nao void, porque assim quem chama o metodo
     * fica sabendo se o aluguel realmente aconteceu (true) ou se a bicicleta
     * ja estava alugada e o pedido nao pode ser atendido (false).
     */
    public boolean alugar() {
        if (disponivel) {
            disponivel = false;
            return true;
        }
        return false;
    }

    public void devolver() {
        disponivel = true;
    }

    // Exercicio 6
    public TipoBicicleta getTipo() {
        return tipo;
    }
}
