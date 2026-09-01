public class Corolla extends Carro
{
    public Corolla()
    {
        super("Toyota", "Corolla GLI", 2025);
    }

    @Override
    public void acelerar(int quantidade)
    {
        System.out.println("Corolla acelerando " + quantidade + " km/h");

        velocidadeAtual += quantidade;

        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
    }
}

