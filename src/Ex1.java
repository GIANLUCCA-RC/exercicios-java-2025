package exercicios1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Entre com um número inteiro: ");
        int num = ler.nextInt();
        int sucessor = num + 1;
        System.out.println("Sucessor de " + num + " é " + sucessor);
        int antecessor = num - 1;
        System.out.println("Antecessor de " + num + " é " + antecessor);
    }
}
