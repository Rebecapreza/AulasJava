import java.util.Scanner;

public class ex2 {
    public static void main(String[] args){
        //Exercício 2
        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Digite um número: ");
        num1 = scanner.nextInt();
        System.out.println("Digite um segundo número: ");
        num2 = scanner.nextInt();

        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multiplicação: " + (num1 * num2));
        System.out.println("Número elevado: " + Math.pow(num1, num2));

        if (num2 == 0){
            System.out.println("Divisão não pode ser realizada!!!");
        } else{
            System.out.println("Divisão: " + (num1 / num2));
            System.out.println("Resto da divisão: " + (num1 % num2));
        }
    }
}
