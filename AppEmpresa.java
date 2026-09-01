public class AppEmpresa {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Américo Vespucio", "123.456.789-00", 160, 25.50, "15/03/2021");
        Funcionario func2 = new Funcionario("Pero Vaz", "987.654.321-11", 180, 30.00, "01/08/2022");
        Funcionario func3 = new Funcionario("Fernão de Magalhães", "456.789.123-22", 140, 22.00, "10/01/2020");

        func1.exibirDados();
        func2.exibirDados();
        func3.exibirDados();
    }
}