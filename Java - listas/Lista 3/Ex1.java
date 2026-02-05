import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int par = 0, impar = 0, neg = 0, pos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            num[i] = sc.nextInt();
            if (num[i] % 2 == 0) par++; else impar++;
            if (num[i] < 0) neg++; else if (num[i] > 0) pos++;
        }

        while (true) {
            System.out.println("\nO que deseja saber?\na) Pares\nb) Ímpares\nc) Negativos\nd) Positivos\ne) Sair");
            char opcao = sc.next().toLowerCase().charAt(0);
            switch (opcao) {
                case 'a' -> System.out.println("Pares: " + par);
                case 'b' -> System.out.println("Ímpares: " + impar);
                case 'c' -> System.out.println("Negativos: " + neg);
                case 'd' -> System.out.println("Positivos: " + pos);
                case 'e' -> System.exit(0);
            }
        }

    }
}
