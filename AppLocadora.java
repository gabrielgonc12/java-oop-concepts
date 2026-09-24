package br.uesb.locadora.app;

import br.uesb.locadora.modelo.Bicicleta;
import br.uesb.locadora.modelo.Cliente;
import br.uesb.locadora.modelo.Aluguel;
import br.uesb.locadora.modelo.TipoBicicleta;

import javax.swing.JOptionPane;
import java.util.ArrayList;

/* 
 * Exercicio 5: AppLocadora fica no pacote br.uesb.locadora.app e importa as
 * classes do pacote br.uesb.locadora.modelo (Bicicleta, Cliente, Aluguel, TipoBicicleta).
 */
public class AppLocadora {

    // Exercicio 4
    public static Bicicleta buscarDisponivel(Bicicleta[] frota) {
        for (int i = 0; i < frota.length; i++) {
            if (frota[i] != null && frota[i].isDisponivel()) {
                return frota[i];
            }
        }
        return null;
    }

    // Exercicio 4
    public static void listarFrota(Bicicleta[] frota) {
        for (Bicicleta b : frota) {
            System.out.println(b.getModelo() + " - " + b.getCor()
                    + " - " + b.getTipo() + " - disponivel: " + b.isDisponivel());
        }
    }

    // Exercicio 7 (versoes com ArrayList, substituindo o array fixo)
    public static Bicicleta buscarDisponivel(ArrayList<Bicicleta> frota) {
        for (Bicicleta b : frota) {
            if (b.isDisponivel()) {
                return b;
            }
        }
        return null;
    }

    public static void listarFrota(ArrayList<Bicicleta> frota) {
        for (Bicicleta b : frota) {
            System.out.println(b.getModelo() + " - " + b.getCor()
                    + " - " + b.getTipo() + " - disponivel: " + b.isDisponivel());
        }
    }

    public static void adicionarBicicleta(ArrayList<Bicicleta> frota, Bicicleta nova) {
        frota.add(nova);
    }

    public static void main(String[] args) {

        // Exercicio 4: array de tamanho 5, cada posicao com uma Bicicleta diferente
        Bicicleta[] frotaArray = new Bicicleta[5];
        frotaArray[0] = new Bicicleta("Caloi Elite", "Vermelha", TipoBicicleta.URBANA);
        frotaArray[1] = new Bicicleta("Trek Marlin", "Preta", TipoBicicleta.MOUNTAIN);
        frotaArray[2] = new Bicicleta("Oggi Cattura", "Azul", TipoBicicleta.MOUNTAIN);
        frotaArray[3] = new Bicicleta("Sense Urbam", "Branca", TipoBicicleta.URBANA);
        frotaArray[4] = new Bicicleta("Ecobike E1", "Verde", TipoBicicleta.ELETRICA);

        System.out.println("Frota inicial (array):");
        listarFrota(frotaArray);

        // Exercicio 7: refatorando a frota fixa para ArrayList<Bicicleta>
        ArrayList<Bicicleta> frota = new ArrayList<>();
        for (Bicicleta b : frotaArray) {
            adicionarBicicleta(frota, b);
        }

        // Exercicio 8

        // (1) pede nome e CPF do cliente e cria o objeto Cliente
        String nome = JOptionPane.showInputDialog("Nome do cliente:");
        String cpf = JOptionPane.showInputDialog("CPF do cliente:");
        Cliente cliente = new Cliente(nome, cpf);

        // (2) usa buscarDisponivel() para achar uma bicicleta livre na frota
        Bicicleta escolhida = buscarDisponivel(frota);

        /*
         * (3) se houver bicicleta disponivel, pede o numero de dias e cria um Aluguel;
         * se nao houver, mostra mensagem informando que nao ha bicicletas disponiveis
         */
        if (escolhida != null) {
            String diasStr = JOptionPane.showInputDialog("Numero de dias previstos:");
            int dias = Integer.parseInt(diasStr);

            Aluguel aluguel = new Aluguel(cliente, escolhida, dias);

            // (4) mostra o valor total do aluguel e o numero total de clientes cadastrados
            JOptionPane.showMessageDialog(null,
                    "Valor total do aluguel: R$ " + aluguel.calcularValor() + "\n"
                            + "Total de clientes cadastrados: " + Cliente.getTotalDeClientes());
        } else {
            JOptionPane.showMessageDialog(null, "Nao ha bicicletas disponiveis no momento.");
        }
    }
}
