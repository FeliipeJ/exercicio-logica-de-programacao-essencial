package OperadoresDeEstruturaCondicional;

import java.util.Scanner;

public class VerificandoTurnoEstudo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String matutino = "m";
        String vespertino = "v";
        String noturno = "n";

        System.out.println("Informe seu turno de estudos: ");
        System.out.println("M-matutino ou V-vespertino ou N-noturno");
        String turno = teclado.nextLine();

        if (turno.equals(matutino)) {
            System.out.println("Bom dia!");
        } else if (turno.equals(vespertino)) {
            System.out.println("Boa tarde!");
        } else if (turno.equals(noturno)) {
            System.out.println("Boa noite!");
        } else {
            System.out.println("Valor Inválido!");
        }

        teclado.close();
    }
}
