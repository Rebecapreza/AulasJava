import java.util.Scanner;

public class Ex5 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade atual do estoque: ");
        int qtdEstoque = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Qual a quantidade máxima do estoque? ");
        int qtdMax = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Qual a quantidade mínima do estoque? ");
        int qtdMin = scanner.nextInt();
        scanner.nextLine();

        int qtdMedia = (qtdMax - qtdMin) / 2;

        if (qtdEstoque >= qtdMedia) {
            System.out.println("Não efetuar compra!!");
        } else {
            System.out.println("Efetuar compra");
        }
    }
}
