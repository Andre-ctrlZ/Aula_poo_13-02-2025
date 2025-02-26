public class MainTodos {   
    public static void main(String[] args) {
        Memoria memoria = new Memoria("Socorro", "Socorro", "Socorro", "Socorro");
        Processador processador = new Processador("Dell", "Intel CoreI3", "2GB");
        Placa_mae placa = new Placa_mae("Soyo", "775", "ATX");
        Disp_armazenamento disp = new Disp_armazenamento("Kings", "SSD", "128GB", "Nuvem");

        System.out.println(memoria.toString());
        System.out.println();
        System.out.println(processador.toString());
        System.out.println();
        System.out.println(placa.toString());
        System.out.println();
        System.out.println(disp.toString());
    }

}
