import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);
    
        System.out.print("me diga um nome:");
         String nome1= ler.nextLine();

        System.out.print("me diga outro nome:");
         String nome2= ler.nextLine();
        
        if (nome1.equals(nome2))
            System.out.print("os nomes são iguais!");
         else
            System.out.print("os nomes não são iguais!");




    }
    
}
