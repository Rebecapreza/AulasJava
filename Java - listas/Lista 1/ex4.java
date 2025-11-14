import java.util.Scanner;

public class ex4 {
    public static void main(String[] args){
        //Exercício 4
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num3 = scanner.nextInt();

        int antecessor = num3 - 1;
        int sucessor = num3 + 1;

        System.out.println("O antecessor do número é: " + antecessor);
        System.out.println("O número é: " + num3);
        System.out.println("O sucessor do número é: " + sucessor);
    }
}
