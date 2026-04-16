import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        
        System.out.print("me diga uma palavra: ");
        String palavra = ler.nextLine();

        for (int i= palavra.length() -1; i>=0; i--){
            System.out.print(palavra.charAt(i));
        }

    }
}
