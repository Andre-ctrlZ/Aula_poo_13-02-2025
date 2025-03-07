public class Main {
    public static void main(String[] args) {
        // Criando o diretor
        Diretor diretor = new Diretor("João Silva", "15/05/1980", Sexo.MASCULINO, Setor.DIRETORIA, 5000.00);

        // Criando o motoboy
        Motoboy motoboy1 = new Motoboy("Carlos Souza", "23/11/1990", Sexo.MASCULINO, Setor.OPERACOES, 2000.00, "123456789");

        // Admitindo o motoboy através do diretor
        diretor.Admitir(motoboy1);
        // Exibindo o status do motoboy após ser admitido
        System.out.println(motoboy1.toString());

        // Demitindo o motoboy através do diretor
        diretor.Demitir(motoboy1);
        // Exibindo o status do motoboy após ser demitido
        System.out.println(motoboy1.toString());

        System.out.println(diretor.toString());
    }
}
