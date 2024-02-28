package Entidades;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double taxa;

    public double salarioLiquido(){
        double salario = salarioBruto - taxa;
        return salario;
    }

    public void aumentarSalario(double porcentagem){
        this.salarioBruto += salarioBruto * (porcentagem/100);
    }
}
