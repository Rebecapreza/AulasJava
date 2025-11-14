import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){
        //Exercício 3
        Scanner scanner = new Scanner(System.in);

        double compra;

        System.out.println("Digite o valor da sua mercadoria: ");
        compra = scanner.nextDouble();

        double representante = compra * 0.20;
        double mercadoria = compra * 0.30;

        double venda = compra + representante + mercadoria;

        System.out.println("O total de venda é: " + venda);
    }
}
