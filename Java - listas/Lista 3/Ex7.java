import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomeMaisPesado = "", nomeMaisAlto = "";
        double maiorPeso = 0, maiorAltura = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.print("Nome da " + i + "ª pessoa: "); String nome = sc.next();
            System.out.print("Altura: "); double altura = sc.nextDouble();
            System.out.print("Peso: "); double peso = sc.nextDouble();

            if (peso > maiorPeso) { maiorPeso = peso; nomeMaisPesado = nome; }
            if (altura > maiorAltura) { maiorAltura = altura; nomeMaisAlto = nome; }
        }

        System.out.println("Mais pesada: " + nomeMaisPesado + " (" + maiorPeso + "kg)");
        System.out.println("Mais alta: " + nomeMaisAlto + " (" + maiorAltura + "m)");
    }
}
