package Revisao;

public class Gato implements Animal{

@Override
public String emitirSom(){
    return "Miau!";
}

@Override
public String Comer(){
    return "O gato se alimentou da alma dos sofredores.";
}

@Override
public void acao(){
    System.out.println("O gato sacrifica virgens");
}
}
