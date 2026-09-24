package br.uesb.locadora.modelo;

public class Cliente {

    // Exercicio 2
    private String nome;
    private String cpf;
    private static int totalDeClientes = 0;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        totalDeClientes++;
    }

    public static int getTotalDeClientes() {
        return totalDeClientes;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
