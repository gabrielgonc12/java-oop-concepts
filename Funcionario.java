public class Funcionario {
    private String nome;
    private String cpf;
    private int horasTrabalhadas;
    private double valorHora;
    private String dataAdmissao;

    public Funcionario(String nome, String cpf, int horasTrabalhadas, double valorHora, String dataAdmissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
        this.dataAdmissao = dataAdmissao;
    }

    public double calcularSalario() {
        return this.horasTrabalhadas * this.valorHora;
    }

    public String getNome() {
        return this.nome;
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Data de Admissão: " + this.dataAdmissao);
        System.out.println("Horas Trabalhadas: " + this.horasTrabalhadas);
        System.out.println("Valor por Hora: R$ " + this.valorHora);
        System.out.println("Salário Calculado: R$ " + calcularSalario());
        System.out.println();
    }
}