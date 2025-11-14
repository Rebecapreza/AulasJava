import java.util.Scanner;

public class Ex2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o preço unitário do produto? ");
        double precoUni = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Qual a quantidade desse produto? ");
        double qtdProduto = scanner.nextDouble();
        scanner.nextLine();

        double totalCompra = qtdProduto * precoUni;

        if (qtdProduto <= 12){
            System.out.printf("O valor total da compra é: R$ %f", totalCompra);
        } else {
            double desconto = totalCompra * 0.10;
            double totalDesconto = totalCompra - desconto;
            System.out.printf("O valor total é: R$ %f", totalDesconto);
        }
    }
}
