package Exercicios;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        if (idade < 16) {
            System.out.println(nome + " - Não pode votar!");
        } else {
            System.out.println(nome + " - Apto a votar!");
        }
    }
}