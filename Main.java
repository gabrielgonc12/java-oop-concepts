import java.util.Random;
public class Main
{
    public static void main(String[] args)
    {
        Random random = new Random();

        Corolla corolla = new Corolla();
        Civic civic = new Civic();

        civic.ativarModoSport();

        System.out.println("\n========== RACHÃO ==========\n");

        for (int i = 0; i < 5; i++)
        {
            System.out.println("----- RODADA " + (i + 1) + " -----");

            // RANDOM DO COROLLA
            int acelerarCorolla = random.nextInt(21) + 5;
            int freiarCorolla = random.nextInt(11);

            // RANDOM DO CIVIC
            int acelerarCivic = random.nextInt(21) + 5;
            int freiarCivic = random.nextInt(11);

            // COROLLA
            corolla.acelerar(acelerarCorolla);
            corolla.freiar(freiarCorolla);

            System.out.println();

            // CIVIC
            civic.acelerar(acelerarCivic);
            civic.freiar(freiarCivic);

            System.out.println();
        }

        System.out.println("========== RESULTADO ==========");

        System.out.println(
            corolla.modelo + ": " + corolla.velocidadeAtual + " km/h"
        );

        System.out.println(
            civic.modelo + ": " + civic.velocidadeAtual + " km/h"
        );

        if (corolla.velocidadeAtual > civic.velocidadeAtual)
        {
            System.out.println("\n🏆 COROLLA ESTÁ NA FRENTE!");
        }
        else if (civic.velocidadeAtual > corolla.velocidadeAtual)
        {
            System.out.println("\n🏆 CIVIC ESTÁ NA FRENTE!");
        }
        else
        {
            System.out.println("\n🤝 EMPATE!");
        }
    }
}

