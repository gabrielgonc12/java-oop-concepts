// Exercício 4 - Organizando em pacotes
package pizzaria;

// Exercício 5 - A classe Item
public class Item {
    // Exercício 5 - Atributos privados
    private Pizza pizza;
    private int quantidade;

    // Exercício 5 - Construtor que recebe pizza e quantidade
    public Item(Pizza pizza, int quantidade) {
        this.pizza = pizza;
        this.quantidade = quantidade;
    }

    // Exercício 5 - Métodos get e set
    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Exercício 5 - Crie o método calcularTotal
    public double calcularTotal() {
        return pizza.getPreco() * quantidade;
    }

    // Exercício 5 - Crie o método imprimir
    public String imprimir() {
        return pizza.imprimir() +
                " | Quantidade: " + quantidade +
                " | Subtotal: R$ " + String.format("%.2f", calcularTotal());
    }
}