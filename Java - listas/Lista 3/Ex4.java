import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int limite = sc.nextInt();
        System.out.print("Digite o incremento: ");
        int inc = sc.nextInt();

        for (int i = 0; i <= limite; i += inc) {
            System.out.print(i + (i + inc <= limite ? ", " : ""));
        }
    }
}
