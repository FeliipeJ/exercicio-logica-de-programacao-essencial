package OperadoresDeEstruturaCondicional;

import java.util.Scanner;

public class VerificaNumeroPositivo {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = teclado.nextInt();

        if (numero >= 0){
            System.out.println("O número " + numero + " é positivo!");
        } else {
            System.out.println("É negativo!!!");
        }

        teclado.close();
    }
}
