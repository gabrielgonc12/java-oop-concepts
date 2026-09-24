// Exercício 4 - Organizando em pacotes
package pizzaria;

import java.util.ArrayList;

// Exercício 6 - A classe Pedido
public class Pedido {
    // Exercício 6 - Atributos da classe Pedido
    private ArrayList<Item> itens;
    private String data;
    private int codigo;

    // Exercício 6 - Construtor para inicializar código, data e inicializar a lista
    public Pedido(int codigo, String data) {
        this.codigo = codigo;
        this.data = data;
        this.itens = new ArrayList<>(); // Inicializando a lista
    }

    // Exercício 6 - Adicione o método adicionarItem(Item item)
    public void adicionarItem(Item item) {
        itens.add(item);
    }

    // Exercício 6 - Adicione calcularTotal()
    public double calcularTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.calcularTotal();
        }
        return total;
    }

    // Exercício 6 - Crie o método imprimir
    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== DADOS DO PEDIDO ===\n");
        sb.append("Código: ").append(codigo).append(" | Data: ").append(data).append("\n");
        sb.append("Itens:\n");
        for (Item item : itens) {
            sb.append(" - ").append(item.imprimir()).append("\n");
        }
        sb.append("Valor Total do Pedido: R$ ").append(String.format("%.2f", calcularTotal())).append("\n");
        return sb.toString();
    }
}