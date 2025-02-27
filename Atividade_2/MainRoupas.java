public class MainRoupas {
    public static void main(String[] args) {
        Camisa camisa = new Camisa("BASIC", "Branca", "G", 1.0);
        Sapato sapato = new Sapato("All-star", "Preto", "39", 2.0);
        Calca calca = new Calca("BASIC", "azul", "38", 1.0);

        System.out.println(camisa.toString());
        System.out.println();
        System.out.println(calca.toString());
        System.out.println();
        System.out.println(sapato.toString());
    }
}
