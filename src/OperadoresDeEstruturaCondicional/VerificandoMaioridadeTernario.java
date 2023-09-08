package OperadoresDeEstruturaCondicional;

import java.util.Scanner;

public class VerificandoMaioridadeTernario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = teclado.nextInt();

        String mensagem = (idade >= 18) ? "Com a idade " + idade + " voê tem maioridade!" : "Você não é maioridade!";

        System.out.println(mensagem);

        teclado.close();
    }
}
