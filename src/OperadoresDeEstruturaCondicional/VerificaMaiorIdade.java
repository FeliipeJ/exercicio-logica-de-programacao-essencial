package OperadoresDeEstruturaCondicional;

import java.util.Scanner;

public class VerificaMaiorIdade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();

        if (idade >= 18) {
            System.out.println("Com a idade " + idade + " voê tem maioridade!");
        } else {
            System.out.println("Você não é maioridade!");
        }

        teclado.close();
    }
}
