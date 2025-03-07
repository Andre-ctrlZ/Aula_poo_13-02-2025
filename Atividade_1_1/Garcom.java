
public class Garcom extends Funcionario{
public Double gorjeta = 10.50;

public Garcom(String Nome, String DataNascimento, Sexo Sexo, Setor Setor, Double SalarioBase, Double gorjeta){
    super(Nome, DataNascimento, Sexo, Setor, SalarioBase);
    this.gorjeta = gorjeta;
}

public Double getgorjeta() {
    return gorjeta;
}

@Override
public Double getSalarioFinal(){
    return super.SalarioBase += gorjeta;
}
}
