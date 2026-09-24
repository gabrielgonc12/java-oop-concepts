// Exercício 4 - Organizando em pacotes
package pizzaria;

// Exercício 1 - O enum Tamanho
public enum Tamanho {
    // Exercício 3 - Enum com atributo e construtor (tempos de forno)
    PEQUENA(10),
    MEDIA(15),
    GRANDE(20),
    FAMILIA(25);

    // Exercício 3 - Atributo para armazenar o tempo aproximado de forno
    private final int tempoForno;

    // Exercício 3 - Construtor do enum
    Tamanho(int tempoForno) {
        this.tempoForno = tempoForno;
    }

    // Método auxiliar para acessar o tempo de forno
    public int getTempoForno() {
        return tempoForno;
    }
}