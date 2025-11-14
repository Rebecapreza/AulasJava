import java.util.Scanner;

public class Ex1 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        double [] numeros = new double[10];

        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;

        for (int i = 0; i < 10; i++){
            System.out.printf("Digite o %d° número: ", (i+1));
        }

        double num = scanner.nextDouble();

    }
}
