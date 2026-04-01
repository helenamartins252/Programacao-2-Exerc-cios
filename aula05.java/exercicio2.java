import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
    
    Scanner ler = new Scanner(System.in);

    System.out.print(" qual é a sua idade:");
    int idade = ler.nextInt();

    if (idade >= 16){
     System.out.print("Pode Votar");
    } else{
      System.out.print("Não Pode Votar");
    }



    }
}
