<<<<<<< HEAD
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Pergunta 01
        String pergunta1 = "Qual é a capital da Austrália?";
        String[] alternativas1 = {
                "a) Sydney",
                "b) Canberra", // Resposta correta
                "c) Melbourne"
        };
        String respostaCorreta1 = "b";

        // Pergunta 02
        String pergunta2 = "Qual palavra-chave é usada em Java para declarar uma constante (variável que não muda)?";
        String[] alternativas2 = {
                "a) static",
                "b) final", // Resposta correta
                "c) const"
        };
        String respostaCorreta2 = "b";


        String escolhaPergunta;
        boolean primeiraTentativa = true;

        System.out.println("---------------------------------------------");
        System.out.println("Bem-vindo(a) ao Quiz Shostners and Shostners!");

        do {
            if (!primeiraTentativa) {
                System.out.println("\n*** Escolha inválida. Por favor, digite '1' ou '2'. ***");
            }

            System.out.println("Qual pergunta você deseja responder? Digite '1' ou '2'.");
            System.out.print("Sua escolha: ");

            escolhaPergunta = scanner.nextLine().trim();
            escolhaPergunta = escolhaPergunta.toLowerCase();

            primeiraTentativa = false; // Define como false após a primeira tentativa

        } while (!escolhaPergunta.equals("1") && !escolhaPergunta.equals("2"));


        String pergunta;
        String[] alternativas;
        String respostaCorreta;

        if (escolhaPergunta.equals("1")) {
            pergunta = pergunta1;
            alternativas = alternativas1;
            respostaCorreta = respostaCorreta1;
        } else {
            pergunta = pergunta2;
            alternativas = alternativas2;
            respostaCorreta = respostaCorreta2;
        }

        System.out.println("PERGUNTA " + escolhaPergunta + ": " + pergunta);
        for (String alternativa : alternativas) {
            System.out.println(alternativa);
        }

        System.out.print("Digite a letra da sua resposta (a, b ou c): ");
        String respostaUsuario = scanner.nextLine().trim();

        String respostaMinimizada = respostaUsuario.toLowerCase();


        if (respostaMinimizada.equals(respostaCorreta)) {
            System.out.println("\n*** Você acertou, pode retirar seu bônus na Shostners and Shostners ***");
        } else {
            System.out.println("\n*** Você não acertou, mas tente novamente numa próxima ***");
        }

        // Fecha o scanner
        scanner.close();
    }
}
=======
public class Ex7 {
}
>>>>>>> f3fc1149d97dc7b41b7ada7cd4e1ed50c0ba523c
