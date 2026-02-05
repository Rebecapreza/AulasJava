import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para ver a tabuada: ");
        int n = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, (n * i));
        }
    }
}
