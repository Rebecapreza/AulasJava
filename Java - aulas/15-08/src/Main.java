//import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*for (int i = 0; i <= 10; i ++){
            if (i%2 == 0){
                continue;
            }
            System.out.println(i);
        }*/

        //Scanner entrada = new Scanner(System.in);
        //String valor = "";

        /*Toda vez que o usuário digitar alguma coisa pra sair, o código continua,
        quando o usuário digitar a palavra "sair", o código encerra */

        /*Strings só se compara com metodo equals, nao utilizar ==
        == só se utiliza para tipo primitivo de dados: int, boolean e etc*/

        /*while(!valor.equalsIgnoreCase("sair")){
            System.out.print("Digite algo: ");
            valor = entrada.nextLine();
        }
        entrada.close();*/

        /*int contador = 0, acumulador = 0;
        while (contador<5){
            System.out.println(contador);
            contador ++;
            System.out.print("Digite um número: ");
            acumulador += entrada.nextInt();
            entrada.nextLine();
            System.out.printf("Contador está em %d e " + "o acumulador está em %d\n", contador, acumulador);
        }*/
        /*for (int i = 0; i <= 3; i++){
            System.out.println("Banana");
            for (int j = 0; j < 2; j++){
                System.out.println("Maça");
            }
        }*/

        /*for (int i = 1; i <= 10 ; i++) {
            for (int r = 1; r <= 10 ; r++) {
                int multiplicacao= i * r;
                System.out.printf("%d" + "x" + "%d" + "=" + "%d\n \t", i, r, multiplicacao);
            }
        }*/

        int contador = 0;

        while (contador < 10){
            contador++;
            int num = 0;
            while (num < 10){
                int resultado = 0;
                num ++;
                resultado = num * contador;
                System.out.printf("%d X %d = %d\n", contador, num, resultado);
            }
            System.out.println();
        }
    }
}