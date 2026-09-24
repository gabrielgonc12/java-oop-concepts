// Exercício 4 e 8 - Pacote pizzaria.app
package pizzaria.app;

// Exercício 4 - necessidade de utilizar import
import java.util.Scanner;
import pizzaria.Item;
import pizzaria.Pedido;
import pizzaria.Pizza;
import pizzaria.Tamanho;
import pizzaria.controle.ControlePizza;

// Exercício 8 - AppPizzaria.java
public class AppPizzaria {

    // Exercício 8 - Método menu()
    public static String menu() {
        return "\nDigite:\n" +
                "1 - Cadastrar pizza\n" +
                "2 - Cadastrar pedido\n" +
                "3 - Listar pedido\n" +
                "0 - para sair";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercício 8 - Crie um objeto da classe ControlePizza
        ControlePizza controlePizza = new ControlePizza();
        Pedido pedidoAtual = null;
        int opcao = -1;

        // Exercício 8 - Utilize um laço de repetição
        while (opcao != 0) {
            System.out.println(menu());
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                // Exercício 8: Opção 1 — Cadastrar pizza
                System.out.print("Código da pizza: ");
                int codigo = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Sabor: ");
                String sabor = scanner.nextLine();

                System.out.println("Tamanho:\n1 - Pequena\n2 - Média\n3 - Grande\n4 - Família");
                int opcaoTamanho = scanner.nextInt();
                Tamanho tamanho;

                // Exercício 8 - Converta a opção escolhida para o valor do enum
                switch (opcaoTamanho) {
                    case 1:
                        tamanho = Tamanho.PEQUENA;
                        break;
                    case 2:
                        tamanho = Tamanho.MEDIA;
                        break;
                    case 3:
                        tamanho = Tamanho.GRANDE;
                        break;
                    case 4:
                        tamanho = Tamanho.FAMILIA;
                        break;
                    default:
                        System.out.println("Tamanho inválido! Assumindo Média por padrão.");
                        tamanho = Tamanho.MEDIA;
                }

                System.out.print("Preço: ");
                double preco = scanner.nextDouble();

                // Exercício 8 - Utilize o método cadastrarPizza()
                controlePizza.cadastrarPizza(codigo, sabor, tamanho, preco);
                System.out.println("Pizza cadastrada com sucesso!");

            } else if (opcao == 2) {
                // Exercício 8: Opção 2 — Cadastrar pedido
                System.out.print("Código do pedido: ");
                int codigoPedido = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Data do pedido: ");
                String data = scanner.nextLine();

                // 1. crie um novo Pedido;
                pedidoAtual = new Pedido(codigoPedido, data);
                boolean adicionarMais = true;

                // Enquanto a resposta for sim
                while (adicionarMais) {
                    // 3. pergunte se deseja adicionar pizza
                    System.out.print("Deseja adicionar uma pizza ao pedido? (sim/nao): ");
                    String resposta = scanner.nextLine();

                    if (resposta.equalsIgnoreCase("sim") || resposta.equalsIgnoreCase("s")) {
                        // 1. solicite o código da pizza
                        System.out.print("Código da pizza: ");
                        int codPizza = scanner.nextInt();
                        scanner.nextLine();

                        // 2. pesquise a pizza
                        Pizza pizzaEncontrada = controlePizza.pesquisarPizza(codPizza);

                        // 3. caso encontrada, solicite quantidade
                        if (pizzaEncontrada != null) {
                            System.out.print("Quantidade: ");
                            int qtd = scanner.nextInt();
                            scanner.nextLine();

                            // 4. crie o item e 5. adicione ao pedido
                            Item novoItem = new Item(pizzaEncontrada, qtd);
                            pedidoAtual.adicionarItem(novoItem);
                            System.out.println("Pizza adicionada ao pedido!");
                        } else {
                            // Caso não seja encontrada, informe e permita tentar novamente
                            System.out.println("Erro: Pizza não encontrada. Tente novamente.");
                        }
                    } else {
                        adicionarMais = false;
                    }
                }

                // Mostre o valor total do pedido
                if (pedidoAtual.calcularTotal() > 0) {
                    System.out.printf("Valor total do pedido: R$ %.2f\n", pedidoAtual.calcularTotal());
                } else {
                    System.out.println("Pedido cancelado/vazio.");
                    pedidoAtual = null;
                }

            } else if (opcao == 3) {
                // Exercício 8: Opção 3 — Listar pedido
                if (pedidoAtual != null) {
                    System.out.println(pedidoAtual.imprimir());
                } else {
                    System.out.println("Nenhum pedido foi cadastrado ainda.");
                }

            } else if (opcao != 0) {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }

        System.out.println("Sistema encerrado.");
        scanner.close();
    }
}