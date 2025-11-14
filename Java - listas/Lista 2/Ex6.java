<<<<<<< HEAD
import java.util.Random;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 1;
        int max = 100;

        // Gerando o número aleatório
        Random random = new Random();
        int numeroAleatorio = random.nextInt(max - min + 1) + min;


        // Mensagem inicial
        System.out.println("Tente a sua sorte! Você tem 3 chances para acertar o número entre " + min + " e " + max + ". Digite um número:");

        // Número de tentativas
        int tentativas = 3;

        // Loop para as 3 tentativas
        for (int i = 1; i <= tentativas; i++) {
            // Solicita o número do usuário
            System.out.print("Tentativa " + i + ": ");
            int numeroUsuario = scanner.nextInt();

            // Verifica se o usuário acertou
            if (numeroUsuario == numeroAleatorio) {
                System.out.println("Você acertou! O número era " + numeroAleatorio + ".");
                return; // Encerra o programa se acertar
            } else {
                // Caso o número esteja errado
                if (i < tentativas) {
                    System.out.println("Você errou! Tente novamente.");
                } else {
                    System.out.println("Você errou! O número correto era " + numeroAleatorio + ".");
                }
            }
        }

        // Exibindo o número gerado para fins de debug (opcional)
        System.out.println("Número aleatório gerado: " + numeroAleatorio);

        scanner.close();
=======
public class Ex6 {
    public static void main (String[] args){

>>>>>>> f3fc1149d97dc7b41b7ada7cd4e1ed50c0ba523c
    }
}
