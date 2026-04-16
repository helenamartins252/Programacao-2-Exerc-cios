import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
    Scanner ler= new Scanner(System.in);

    System.out.print("Digite um número:");
    int numero = ler.nextInt();

    for (int i=1; i<=10; i++){
        int resultado = numero*i;
        System.out.println(numero + "X" + i + "=" +resultado);
    }

    }
}
