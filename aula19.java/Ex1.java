import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        while(true){

         try {
            System.out.print("Digite o primeiro número: ");
            int num1 = sc.nextInt();
            System.out.print("Digite o segundo número: ");
            int num2 = sc.nextInt();
            
            int resultado = num1/num2;
            System.out.println("Resultado: " + resultado);
            break;

        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível dividir por zero.");

        } catch(Exception e){
            System.out.println("erro: Digite apenas números inteiros.");
            sc.nextLine();
        }

        System.out.println("tente novamente.");
        }
    sc.close();
  }
}
