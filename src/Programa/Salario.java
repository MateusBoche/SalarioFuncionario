package Programa;

import Entidades.Funcionario;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Salario app = new Salario();
        app.start();
    }

    private void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("NOme: ");
        Funcionario funcionario = new Funcionario();
        funcionario.nome = scanner.nextLine();
        System.out.println("Salario bruto: ");
        funcionario.salarioBruto = scanner.nextDouble();
        System.out.println("Taxa: ");
        funcionario.taxa = scanner.nextDouble();

        System.out.println("salario liquido: "+ funcionario.salarioLiquido());

        System.out.println("Digite a porcentagem q desseja aumentar o salario: ");
        double aumento = scanner.nextDouble();
        funcionario.aumentarSalario(aumento);
        System.out.println("update data: "+ funcionario.nome + " $" + funcionario.salarioLiquido());

    }
}
