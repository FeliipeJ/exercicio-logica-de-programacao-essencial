package estruturaDeRepeticaoEArrays;

import java.util.Scanner;

public class VetorDeParesEImpares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[5];

        for(int i = 0; i < 5; i++) {
            System.out.print("Informe o " + (i+1) + "º número: ");
            numeros[i] = teclado.nextInt();
        }

        System.out.print("Todos números informados: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.print("\nTodos números pares informados: ");
        for (int numero : numeros) {
            if(numero % 2 == 0) {
                System.out.print(numero + " ");
            }
        }

        System.out.print("\nTodos números ímpares informados: ");
        for (int numero : numeros) {
            if(numero % 2 != 0) {
                System.out.print(numero + " ");
            }
        }

        teclado.close();
    }
}
