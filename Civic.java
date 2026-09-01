public class Civic extends Carro
{
    boolean modoSport;

    public Civic()
    {
        super("Honda", "Civic Type R", 2027);
    }

    public void ativarModoSport()
    {
        modoSport = true;

        System.out.println("Modo Sport ativado!");
    }

    @Override
    public void acelerar(int quantidade)
    {
        if (modoSport == true)
        {
            quantidade = quantidade + 10;

            System.out.println("Civic no modo Sport!");
        }

        System.out.println("Civic acelerando " + quantidade + " km/h");

        velocidadeAtual += quantidade;

        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
    }
}

