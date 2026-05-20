import java.util.ArrayList;
import java.util.Scanner;

public class ListaCompras {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String>lista= new ArrayList<>();
        
        int opcao;
        do { 
            System.out.println(" 1- Adicionar item");
            System.out.println(" 2- Listar itens");
            System.out.println(" 3- Remover item");
            System.out.println(" 4 - Sair ");
            opcao= sc.nextLine();
            sc.nextLine();
        switch (opcao){
        case 1: 
        System.out.println("Digite o item:");
        String item = sc.nextLine();

        lista.add(item);

        System.out.println("Item adicionado!");
        break;

        case 2: 
        
        if (lista.isEmpty()){
            System.out.println(" a lista está vazia");
        }else {
            System.out.println("\nLista de compras:" );
            for (int i=0; i<lista.size(); i++){
                System.out.println(i + "-" +lista.get(i));
            }
        }
        break;

        case 3:
            System.out.print("Digite o Índice do item para remover");
            int indice = sc.nextInt();

            if (indice>= 0 && indice <lista.size()){
                lista.remove(indice);
                System.out.println("Item Removido!");
            } else {
                System.out.print("índice Inválido");
            }

            break;
            case 4:
                System.out.println("Programa encerrado.");
                break;
            default: 
                System.out.println("Opcão Inválida!");
            }
        }while(opcao!=4);
    sc.close();
 }
}
