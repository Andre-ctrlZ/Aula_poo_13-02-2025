

public class MainProcMemo {
    public static void main(String[] args) {
        Memoria memoria = new Memoria("Positivo", "Placa ruim 2002", "2GB");
        Processador processador = new Processador("Dell", "Notebook dentro de cabinete", "2GB");

        System.out.println(memoria.toString());
        System.out.println();
        System.out.println(processador.toString());
    }
}
