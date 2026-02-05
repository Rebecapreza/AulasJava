import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade50 = 0, altura160 = 0, peso80 = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Pessoa " + i + ":");
            System.out.print("Idade: "); int idade = sc.nextInt();
            System.out.print("Altura (m): "); double altura = sc.nextDouble();
            System.out.print("Peso (kg): "); double peso = sc.nextDouble();

            if (idade > 50) idade50++;
            if (altura > 1.60) altura160++;
            if (peso < 80) peso80++;
        }
        System.out.println("Acima de 50 anos: " + idade50);
        System.out.println("Altura acima de 1.60m: " + altura160);
        System.out.println("Peso abaixo de 80kg: " + peso80);
    }

}
