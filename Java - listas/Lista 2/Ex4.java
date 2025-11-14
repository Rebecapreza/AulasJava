import java.util.Scanner;

public class Ex4 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        double valorBase = 3000;

        System.out.println("Qual seu destino? \n" +
                "1 - Maceió \n" +
                "2 - Porto de galinhas \n" +
                "Digite o número de sua escolha: ");
        int destino = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Deseja ter almoço/ janta incluso? (Valor adicional) \n" +
                "1 - Sim \n" +
                "2 - Não \n" +
                "Digite o número de sua escolha: ");
        int refeicao = scanner.nextInt();
        scanner.nextLine();

        if (destino == 1){
            if (refeicao == 1){
                double valorTotal = valorBase + (valorBase * 1);
                System.out.printf("O valor total fica: R$ %f", valorTotal);
            } else if (refeicao == 2) {
                double valorTotal = valorBase + (valorBase * 0.85);
                System.out.printf("O valor total fica: R$ %f", valorTotal);
            } else {
                System.out.println("Valor inválido, tente novamente!");
            }
        } else if (destino == 2) {
            if (refeicao == 1){
                double valorTotal = valorBase + (valorBase * 0.60);
                System.out.printf("O valor total fica: R$ %f", valorTotal);
            } else if (refeicao == 2) {
                double valorTotal = valorBase + (valorBase * 0.45);
                System.out.printf("O valor total fica: R$ %f", valorTotal);
            } else{
                System.out.println("Valor inválido, tente novamente!");
            }
        } else if (destino >= 3){
            System.out.println("Valor inválido, tente novamente!");
        }


    }
}
