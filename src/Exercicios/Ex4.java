package Exercicios;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o sexo (M/F): ");
        String sexo = sc.next().toUpperCase();

        if (sexo.equals("M")) {
            System.out.println("Sexo: Masculino");
        } else if (sexo.equals("F")) {
            System.out.println("Sexo: Feminino");
        } else {
            System.out.println("Opção inválida!");
        }
    }
}