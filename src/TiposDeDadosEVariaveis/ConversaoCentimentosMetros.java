package TiposDeDadosEVariaveis;

import java.util.Scanner;

public class ConversaoCentimentosMetros {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o valor em centímetros: ");
        double valorCentimetros = teclado.nextDouble();

        double valorMetro = valorCentimetros / 100;

        System.out.println("O Valor " + valorCentimetros + " em metros é " + valorMetro);

        teclado.close();
    }
}
