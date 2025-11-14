import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class ex1 {
    public static void main (String[] args){
        System.out.println("Bem-vindo(a) a sua inscrição para entrar na Bosch!");
        System.out.println("Preencha abaixo algumas informações:");

        String nome, sobrenome, CNH, grauIntrucao, cargoPretendido;
        Date dtNascimento = null;
        int pretencaoSalarial;

        Scanner scanner = new Scanner(System.in);

        //Nome
        System.out.println("Digite seu nome: ");
        nome = scanner.nextLine();

        //Sobrenome
        System.out.println("Digite seu sobrenome: ");
        sobrenome = scanner.nextLine();

        //Data de nascimento
        System.out.println("Digite sua data de nascimento (dd/MM/yyyy): ");
        String dataStr = scanner.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            dtNascimento = sdf.parse(dataStr);
        } catch (ParseException e) {
            System.out.println("Formato de data inválido.");
        }

        //Salário pretendido
        System.out.println("Qual a sua pretensão salarial? ");
        pretencaoSalarial = scanner.nextInt();
        scanner.nextLine();

        //Grau de instrução
        System.out.println("Qual seu grau de instrução? (Ensino médio, ensino técnico ou ensino superior) ");
        grauIntrucao = scanner.nextLine();

        //Cargo pretendido
        System.out.println("Qual seu cargo pretendido dentro da Bosch? ");
        cargoPretendido = scanner.nextLine();

        //CNH
        System.out.println("Você possui carteira nacional de habilitação (CNH)? (sim/não) ");
        CNH = scanner.nextLine();

        System.out.println("Sua inscrição foi realizada com sucesso, boa sorte!" +
                "\nNome: " + nome + "\nSobrenome: " + sobrenome + "\nData de nascimento: " + sdf.format(dtNascimento) + "\nSalário pretendido: "
                + pretencaoSalarial + "\nGrau de instrução: " + grauIntrucao + "\nCargo pretendido: " + cargoPretendido + "\nPossui CNH? " + CNH
        );

        scanner.close();
    }
}
