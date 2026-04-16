import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
     String senhaCorreta = "1234";
     String senhadigitada;

     do{
      System.out.print("Digite a senha:");
      senhadigitada = leitor.nextLine();

      if (!senhadigitada.equals(senhaCorreta)){
        System.out.print("Senha Incorreta, tente novamente.");
      }
     } while (!senhadigitada.equals(senhaCorreta));

    System.out.print("Acesso Permitido");  



    }
}
