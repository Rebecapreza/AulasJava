import java.util.Scanner;

public class ex7 {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o seu nome: ");
            String nome = scanner.nextLine();

            System.out.println("Digite o mês atual: ");
            int mes = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Digite a quantidade de carros vendidos por você: ");
            int qtdCarros = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Digite o valor total de vendas realizadas: ");
            double totalVendas = scanner.nextInt();
            scanner.nextLine();

            double totalSalario = 1500 + (350 * qtdCarros) + (0.00001 * totalVendas);

            System.out.printf("Resumo do mês " + mes + ": \n");
            System.out.printf("Nome do vendedor: %s \n", nome);
            System.out.printf("Total do salário já calculado: R$%.2f \n",totalSalario);
        }
}
