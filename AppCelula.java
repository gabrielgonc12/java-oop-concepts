import javax.swing.JOptionPane;

public class AppCelula {
    public static void main(String args[]) {
        // Exercicio 1
        Celula[] celulas = new Celula[9];

        for (int i = 0; i < celulas.length; i++) {
            celulas[i] = new Celula(i);
        }
        /* Antes da execução do loop for, cada posição do array continha o valor null,
           pois arrays de objetos em Java são inicializados por padrão com referências
           nulas até que um objeto seja instanciado e atribuído. */

        // Exercicio 2
        // Percorrendo com for tradicional (com índice)
        for (int i = 0; i < celulas.length; i++) {
            System.out.println(celulas[i].getSimbolo());
        }

        // Percorrendo com for-each
        for (Celula c : celulas) {
            System.out.println(c.getSimbolo());
        }
        
        /* Resposta Exercício 2: O for-each não pode ser usado no Exercício 1 para criar as células 
           porque a variável de iteração 'c' recebe apenas uma cópia da referência. Alterar 'c' 
           não altera o elemento dentro do array 'celulas', além de não disponibilizar o índice 'i'. */

        // Exercicio 3
        String resultado = "";
        for (int i = 0; i < celulas.length; i++) {
            if (i % 3 == 0) {
                resultado += "\n";
            }
            resultado += celulas[i].getSimbolo() + " ";
        }

        JOptionPane.showMessageDialog(null, resultado);

        // Exercicio 4
        Jogador jogador = new Jogador("Jogador 1", 'X');
        boolean marcou = false;

        while (!marcou) {
            String entrada = JOptionPane.showInputDialog("Digite uma posição de 0 a 8:");
            int posicao = Integer.parseInt(entrada);

            marcou = jogador.jogar(celulas[posicao]);

            if (!marcou) {
                JOptionPane.showMessageDialog(null, "Célula já ocupada! Tente novamente.");
            }
        }
    }
}