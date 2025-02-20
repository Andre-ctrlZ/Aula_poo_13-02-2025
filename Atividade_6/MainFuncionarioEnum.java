public class MainFuncionarioEnum {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("123456798", "Fulano", "22", 2.0, Sexo.MASCULINO, Setor.RH, Estado.BAHIA);
        Funcionario funcionario2 = new Funcionario("987654321", "Fulana", "23", 3.0, Sexo.FEMININO, Setor.FINANCEIRO, Estado.RIO_DE_JANEIRO);
        Funcionario funcionario3 = new Funcionario("456879231", "Fulane", "24", 4.0, Sexo.FEMININO, Setor.MARKETING, Estado.SÃO_PAULO);
        Funcionario funcionario4 = new Funcionario("963852741", "Fulanu", "25", 5.0, Sexo.MASCULINO, Setor.VENDAS, Estado.BAHIA);

        System.out.println(funcionario1.toString());
        System.out.println(funcionario2.toString());
        System.out.println(funcionario3.toString());
        System.out.println(funcionario4.toString());
    }
}
