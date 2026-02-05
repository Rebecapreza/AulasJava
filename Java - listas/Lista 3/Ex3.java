import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int otimo = 0, bom = 0, ruim = 0, total = 0;
        double somaNotas = 0;
        String continuar;

        do {
            System.out.print("Opinião (1-Ótimo, 2-Bom, 3-Ruim): ");
            int nota = sc.nextInt();
            if (nota == 1) otimo++;
            else if (nota == 2) bom++;
            else if (nota == 3) ruim++;

            somaNotas += nota;
            total++;

            System.out.print("Deseja continuar? (S/N): ");
            continuar = sc.next();
        } while (continuar.equalsIgnoreCase("S"));

        System.out.println("Total de respondentes: " + total);
        System.out.printf("Ótimo: %d (%.2f%%)\n", otimo, (otimo * 100.0 / total));
        System.out.printf("Bom: %d (%.2f%%)\n", bom, (bom * 100.0 / total));
        System.out.printf("Ruim: %d (%.2f%%)\n", ruim, (ruim * 100.0 / total));
        System.out.printf("Média de notas: %.2f\n", (somaNotas / total));
    }
}
