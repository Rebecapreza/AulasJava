import java.util.Scanner;

public class Ex1 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >=0 && idade <= 14){
            System.out.println("Você é uma criança:)");
        } else if (idade >= 15 && idade <= 17){
            System.out.println("Você é um adolescente:)");
        } else if (idade >= 18 && idade <= 30) {
            System.out.println("Você é um adulto jovem:)");
        } else {
            System.out.println("Você é um adulto:)");
        }
    }
}
