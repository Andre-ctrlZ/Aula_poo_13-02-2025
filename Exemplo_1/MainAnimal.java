package Exemplo_1;

public class MainAnimal {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        Gato gato1 = new Gato();

        System.out.println(gato1.emitirSom());
        System.out.println(cachorro1.emitirSom());
    }
}
