package estruturaDeRepeticaoEArrays;

import java.util.Scanner;

public class SomaMultiplicacaoENumerosdoVetor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[3];

        int contador = 0;
        while (contador < 3) {
            System.out.print("Informe o " + (contador+1) + "º número: ");
            numeros[contador] = teclado.nextInt();
            contador++;
        }

        System.out.print("Todos os números informados: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        int soma = 0;
        int multiplicacao = 1;

        for (int numero : numeros) {
            soma += numero;
            multiplicacao *= numero;
        }

        System.out.println("\nO valor da soma de todos os valores é: " + soma);
        System.out.println("O valor da multiplicação de todos os valores é: " + multiplicacao);
        
        teclado.close();
    }
}
