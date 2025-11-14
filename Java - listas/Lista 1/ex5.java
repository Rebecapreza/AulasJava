import java.util.Scanner;

public class ex5 {
    public static void main(String[] args){
        //Exercício 5
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a hora atual: ");
        int horas = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a quantidade de minutos: ");
        int minutos = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite os segundos: ");
        int segundos = scanner.nextInt();
        scanner.nextLine();

        int total = (horas * 3600) + (minutos * 60) + segundos;

        System.out.printf("A quantidade de horas em segundo é: %d", total);

    }
}
