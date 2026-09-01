public class AppJogador {
    public static void main(String args[]) {

        // exercicio 3 (corrigindo com os getters e setters)
        Jogador jogador1 = new Jogador("null", '?'); // coloquei os parametros ("null", '?') pra nao gerar erro, mas nao faz parte desse ex
        jogador1.setNome("Otaviano");
        jogador1.setSimbolo('X');

        Jogador jogador2 = new Jogador("null", '?'); // coloquei os parametros ("null", '?') pra nao gerar erro, mas nao faz parte desse ex
        jogador2.setNome("Marco Antonio");
        jogador2.setSimbolo('O');

        Celula celula1 = new Celula();
        Celula celula2 = new Celula();
        Celula celula3 = new Celula();

        // exercicio 1
        jogador1.jogar(celula1);
        jogador2.jogar(celula2);

        // exercicio 1 (mostrando que funciona)
        System.out.println("c1: " + celula1.getSimbolo());
        System.out.println("c2: " + celula2.getSimbolo());
        System.out.println("c3: " + celula3.getSimbolo());

        // exercicio 4
        jogador1.vencerPartida();
        jogador2.vencerPartida();

        jogador1.getVitorias();
        jogador2.getVitorias();
    }
}