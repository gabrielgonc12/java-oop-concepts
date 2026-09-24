package br.uesb.locadora.modelo;

public class Aluguel {

    // Exercicio 3
    private Cliente cliente;
    private Bicicleta bicicleta;
    private int diasPrevistos;

    private static final double DIARIA = 15.0;

    /*
     * É o Aluguel, e nao o Cliente ou o AppLocadora, quem chama bicicleta.alugar().
     * O Aluguel representa exatamente o vinculo entre um Cliente e uma Bicicleta
     * num dado momento; e ele o responsavel por garantir que a bicicleta so passe
     * a "indisponivel" quando esse vinculo e de fato criado (no seu construtor).
     * Se fosse o Cliente a chamar alugar(), ele precisaria conhecer detalhes de
     * Bicicleta que nao dizem respeito a ele; se fosse o AppLocadora, a regra de
     * negocio "criar aluguel implica marcar bicicleta indisponivel" ficaria fora
     * das classes de modelo, quebrando o encapsulamento da logica de negocio.
     */

    public Aluguel(Cliente cliente, Bicicleta bicicleta, int diasPrevistos) {
        this.cliente = cliente;
        this.bicicleta = bicicleta;
        this.diasPrevistos = diasPrevistos;
        bicicleta.alugar();
    }

    public double calcularValor() {
        return diasPrevistos * DIARIA;
    }

    public void finalizar() {
        bicicleta.devolver();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Bicicleta getBicicleta() {
        return bicicleta;
    }

    public int getDiasPrevistos() {
        return diasPrevistos;
    }
}
