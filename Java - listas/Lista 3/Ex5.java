import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos = 0, neg = 0, total = 0;
        String resp;

        do {
            System.out.print("Informe o saldo: ");
            double saldo = sc.nextDouble();
            if (saldo >= 0) pos++; else neg++;
            total++;

            System.out.print("Deseja continuar? (S/N): ");
            resp = sc.next();
        } while (resp.equalsIgnoreCase("S"));

        System.out.println("Saldos positivos: " + pos + " | Negativos: " + neg);
        if (pos >= (total * 0.5)) System.out.println("Nenhum risco!");
        else System.out.println("Risco ao banco!");
    }
}
