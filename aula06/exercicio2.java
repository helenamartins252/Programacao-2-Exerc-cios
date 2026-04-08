import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);
    
        System.out.print("me diga um nome:");
         String palavra1= ler.nextLine();

        System.out.print("me diga outro nome:");
         String palavra2= ler.nextLine();

        if (palavra1.equalsIgnoreCase(palavra2)){
            System.out.print("elas são iguais!");
        } else {
            System.out.print("elas não são iguais!");
         }

    }

}
