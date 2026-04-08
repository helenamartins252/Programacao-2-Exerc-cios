import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.print(" me diga uma frase:");
    String frase = ler.nextLine();

    System.out.print(" me diga uma palavra:");
    String palavra = ler.nextLine();

    if (frase.indexOf(palavra)>0)
        System.out.print(" a apalavra esta na frase");
     else 
        System.out.print(-1);

    }
}
