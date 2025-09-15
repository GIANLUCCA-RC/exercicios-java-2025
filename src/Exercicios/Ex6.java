package Exercicios;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18 && idade <= 67) {
            System.out.println("Pode doar sangue.");
        } else {
            System.out.println("Não pode doar sangue.");
        }
    }
}