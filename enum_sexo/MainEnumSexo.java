package enum_sexo;

public class MainEnumSexo {
    public static void main(String[] args) {
        pESSOA pessoa = new pESSOA("Marta", Sexo.FEMININO);

        System.out.println(pessoa.toString());
    }
}
