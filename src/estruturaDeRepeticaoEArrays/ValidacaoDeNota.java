package estruturaDeRepeticaoEArrays;

import java.util.Scanner;

public class ValidacaoDeNota {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int nota = -1;

        do {
            System.out.println("Infome uma nota entre 0 e 10");
            int notaInformada = teclado.nextInt();
            if (notaInformada >= 0 && notaInformada <= 10) {
                nota = notaInformada;
                break;
            } else {
                System.out.println("A nota " + notaInformada + " é inválida!");
            }
        } while(true);
        
        System.out.println("A informada foi: " + nota);

        teclado.close();
    }
}
