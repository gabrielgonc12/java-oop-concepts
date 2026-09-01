public class Carro
{
    String marca;
    String modelo;
    int ano;
    int velocidadeAtual = 0;

    public Carro(String marca, String modelo, int ano)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void acelerar(int quantidade)
    {
        System.out.println(this.modelo + " acelerou " + quantidade + " km/h");

        velocidadeAtual += quantidade;

        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
    }

    public void freiar(int quantidade)
    {
        System.out.println(this.modelo + " freou " + quantidade + " km/h");

        velocidadeAtual -= quantidade;

        if (velocidadeAtual < 0)
        {
            velocidadeAtual = 0;
        }

        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
    }
}

