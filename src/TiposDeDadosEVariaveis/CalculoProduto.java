package TiposDeDadosEVariaveis;

import java.util.Scanner;

public class CalculoProduto {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o nome do Produto: ");
        String nomeDoProduto = teclado.nextLine();

        System.out.println("Informe o valor unitário do Produto: ");
        double valorUnitarioProduto = teclado.nextDouble();

        System.out.println("Informe a quantidade do Produto: ");
        int quantidadeProduto = teclado.nextInt();

        double valorTotalProduto = valorUnitarioProduto * quantidadeProduto;

        System.out.println("O produto " + nomeDoProduto + " com o valor unitário R$ " + valorUnitarioProduto + "  com a quantidade " + quantidadeProduto + " custará o total R$ " + valorTotalProduto);

        teclado.close();
    }
}
