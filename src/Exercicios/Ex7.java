package Exercicios;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quanto ganha por hora: ");
        double valorHora = sc.nextDouble();

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horas = sc.nextInt();

        double salario = valorHora * horas;

        System.out.printf("O salário do mês é: R$ %.2f%n", salario);
    }
}