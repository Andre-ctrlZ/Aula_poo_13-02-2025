package Revisao;

public class MainAnimall {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        Gato gato1 = new Gato();
        Galo galo1 = new Galo();
        Pato pato1 = new Pato();

        System.out.println(gato1.emitirSom());
        System.out.println(gato1.Comer());
        gato1.acao();
        System.out.println(cachorro1.emitirSom());
        System.out.println(cachorro1.Comer());
        cachorro1.acao();
        System.out.println(galo1.emitirSom());
        System.out.println(galo1.Comer());
        galo1.acao();
        System.out.println(pato1.emitirSom());
        System.out.println(pato1.Comer());
        pato1.acao();
    }
}
