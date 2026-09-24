// Exercício 4 e 7 - Pacote pizzaria.controle
package pizzaria.controle;

// Exercício 4 - Uso de import de classes de outro pacote
import java.util.ArrayList;
import pizzaria.Pizza;
import pizzaria.Tamanho;

// Exercício 7 - A classe ControlePizza
public class ControlePizza {
    // Exercício 7 - Atributo ArrayList de pizzas
    private ArrayList<Pizza> pizzas = new ArrayList<>();

    // Exercício 7 - Método cadastrarPizza
    public void cadastrarPizza(int codigo, String sabor, Tamanho tamanho, double preco) {
        Pizza novaPizza = new Pizza(codigo, sabor, tamanho, preco);
        pizzas.add(novaPizza);
    }

    // Exercício 7 - Método pesquisarPizza
    public Pizza pesquisarPizza(int codigo) {
        for (Pizza p : pizzas) {
            if (p.getCodigo() == codigo) {
                return p;
            }
        }
        return null; // Caso nenhuma pizza seja encontrada
    }
}