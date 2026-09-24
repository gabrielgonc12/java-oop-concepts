// Exercício 4 - Organizando em pacotes
package pizzaria;

// Exercício 2 - A classe Pizza
public class Pizza {
    // Exercício 2 - Atributos privados
    private int codigo;
    private String sabor;
    private Tamanho tamanho;
    private double preco;

    // Exercício 2 - Construtor recebendo parâmetros
    public Pizza(int codigo, String sabor, Tamanho tamanho, double preco) {
        this.codigo = codigo;
        this.sabor = sabor;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    // Exercício 2 - Getters correspondentes
    public int getCodigo() {
        return codigo;
    }

    public String getSabor() {
        return sabor;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public double getPreco() {
        return preco;
    }

    // Exercício 2 - Adicione o método imprimir
    public String imprimir() {
        // Exercício 3 - Modificação: Imprimir também o tempo de forno da pizza
        return "Código: " + codigo +
                " | Sabor: " + sabor +
                " | Tamanho: " + tamanho + " (" + tamanho.getTempoForno() + " min)" +
                " | Preço: R$ " + String.format("%.2f", preco);
    }
}