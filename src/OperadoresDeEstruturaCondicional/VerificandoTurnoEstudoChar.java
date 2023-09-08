package OperadoresDeEstruturaCondicional;

import java.util.Scanner;

public class VerificandoTurnoEstudoChar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe seu turno de estudo: ");
        System.out.println("M-matutino ou V-vespertino ou N-noturno");
        char turno = teclado.nextLine().charAt(0);

        String mensagem = "";
        if (turno == 'M' || turno == 'm') {
            mensagem = "Bom dia!";
        } else if (turno == 'V' || turno == 'v') {
            mensagem = "Boa tarde!";
        } else if (turno == 'N' || turno == 'n') {
            mensagem = "Boa noite!";
        } else {
            mensagem = "Valor inválido!";
        }

        System.out.println(mensagem);

        teclado.close();
    }
}
