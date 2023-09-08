package OperadoresDeEstruturaCondicional;

import java.util.Scanner;

public class VerificandoSexo {
    public static void main(String[] args) {
        Scanner teclado = new  Scanner(System.in);

        System.out.println("Informe seu sexo: ");
        System.out.println("M-masculino ou F-feminino");

        char sexo = teclado.nextLine().toUpperCase().charAt(0);

        String mensagem = "";
        switch (sexo) {
            case 'M' -> mensagem = "M - masculino";
            case 'F' -> mensagem = "F - feminino";
            default -> mensagem = "Valor inválido!";
        }

        System.out.println(mensagem);
        teclado.close();
    }
}
