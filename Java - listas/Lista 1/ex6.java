import java.util.Scanner;

public class ex6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua primeira nota: ");
        double nota1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite sua segunda nota: ");
        double nota2 = scanner.nextInt();
        scanner.nextLine();

        double mp = (nota1 * 0.4) + (nota2 * 0.6);

        System.out.printf("A média ponderada das notas são: %f", mp);
    }
}
