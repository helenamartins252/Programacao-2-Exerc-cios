
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {

    Scanner leitor = new Scanner (System.in);

        System.out.print(" qual foi o valor de apenas um produto:");
        double produto = leitor.nextDouble();

        System.out.print("qual foi a quantidade que você comprou desse produto: ");
        int quantidade = leitor.nextInt();

        double valor = produto*quantidade;
        if (valor>100);{
            valor = valor - valor*0.08;
        System.out.print("você teve um desconto de 8%");
        
        }

    }
}
