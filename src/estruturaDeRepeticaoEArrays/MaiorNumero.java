package estruturaDeRepeticaoEArrays;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int maior = 0;

        int contador = 1;

        while (contador <= 3) {
            System.out.print("Informe o " + contador + "º numero: ");
            int numero = teclado.nextInt();
            if (numero > maior) {
                maior = numero;
            }
            contador++;
        }
        System.out.println("O maior número é: " + maior);
        
        teclado.close();
    }
}
