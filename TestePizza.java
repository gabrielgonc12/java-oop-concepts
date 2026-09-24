// Exercício 4 - Pacote pizzaria.app
package pizzaria.app;

// Exercício 4 - Uso de import
import pizzaria.Pizza;
import pizzaria.Tamanho;

// Exercício 2 - Crie uma classe de teste
public class TestePizza {
    public static void main(String[] args) {
        // Exercício 2 - Instancie pelo menos duas pizzas e tamanhos diferentes
        Pizza p1 = new Pizza(1, "Calabresa", Tamanho.MEDIA, 45.50);
        Pizza p2 = new Pizza(2, "Marguerita", Tamanho.FAMILIA, 70.00);

        // Exercício 2 - Imprima os dados das pizzas
        // Exercício 3 - Imprima também o tempo de forno (já integrado no imprimir da
        // Pizza)
        System.out.println(p1.imprimir());
        System.out.println(p2.imprimir());
    }
}