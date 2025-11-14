import java.util.Scanner;

public class Ex3 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos gols o time A fez?");
        int TimeA = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Quantos gols o time B fez?");
        int TimeB = scanner.nextInt();
        scanner.nextLine();

        if (TimeA > TimeB){
            int diferencaGols = TimeA - TimeB;
            System.out.printf("Time A venceu com " + TimeA + " gols!!! \n" + "Com " + diferencaGols + " gols a mais:)" );
        } else if (TimeA == TimeB) {
            System.out.println("Houve empate");
        } else {
            int diferencaGols = TimeB - TimeA;
            System.out.printf("Time B venceu com " + TimeB + " gols!!! \n" + "Com " + diferencaGols + " gols a mais:)" );
        }
    }
}
