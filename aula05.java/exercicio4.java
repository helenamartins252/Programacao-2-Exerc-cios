import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        
    Scanner leitor = new  Scanner(System.in);
      
     System.out.print("Qual é o valor do combusível: ");
     double combustivel = leitor.nextDouble();

     System.out.print("Quanto você tem para abastecer:");
     int valor = leitor.nextInt();

     double total = valor/combustivel;
     System.out.print(" consiguira comprar: " +total );

    }
}
