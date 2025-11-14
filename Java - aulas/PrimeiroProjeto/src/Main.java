
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//  tipos de variáveis inteiras
        /*byte variavelByte = 127;          // Padrão de nomenclatura Camel Case - 1° palavra inicia com letra minúscula e as demais coom maiúscula
        System.out.printf("Tamanho do byte: %d \n", variavelByte ); // souf (printf) - variáveis são trocadas por uma máscara de substituição

    tipos de máscara:
         %d - inteiros: byte, short, int e long
         %f - reais: float, double
         %c - caractere: char
         %b - lógico: boolean
         %s: string

        short variavelShort = 32767;
        System.out.printf("Tamanho do short: %d \n", variavelShort);

        int variavelInt = 2_147_483_647;
        System.out.printf("Tamanho do INT: %d \n", variavelInt);

        long variavelLong = 9_223_372_036_854_775_807L;
        System.out.printf("Tamanho do long: %d \n", variavelLong);

//  Reais
        float variavelFloat = 3.4e+38F;
        System.out.printf("Tamanho do float: %f \n ", variavelFloat);
        double variavelDouble = 1.7e+308;
        System.out.printf("Tamanho do double: %f \n", variavelDouble);*/

/* Caracteres
        char variavelChar = 'R';
        System.out.printf("Meu caracter é: %c \n", variavelChar);

//  Lógico
        boolean variavelBoolean = true;
        System.out.printf("Meu booleano é: %b \n", variavelBoolean);


//        Texto
        int idade = 17;
        int ano = 2007;
        System.out.printf("Olá, me chamo Rebeca, tenho %d anos e nasci no ano de %d. ", idade, ano);

//  String
        String variavelString = "Bem-vindo a Bosch";
        System.out.println(variavelString.length()); // conta a quantidade der caracteres de ums string
        System.out.println(variavelString.toUpperCase()); // deixa tudo maiúsculo
        System.out.println(variavelString.toLowerCase()); // deixa rudo minúsculo
        System.out.println(variavelString.charAt(6)); // mostra a posição das strings
        System.out.println(variavelString + "!!!"); // concatenação
        System.out.println(variavelString);

        variavelString = variavelString + "!!!"; // alterando o valor da variável
        System.out.println(variavelString);

        double numero1 = 9;
        double numero2 = 2;
        System.out.println(numero1+numero2); // adição
        System.out.println(numero1-numero2); // subtração
        System.out.println(numero1*numero2); // multiplicação
        System.out.println(numero1/numero2); // divisão
        System.out.println(numero1%numero2); // resto da divisão

// Potência
        double potencia = Math.pow(2,3); // função para potência, primeiro argumento é a base e o segundo argumento é o expoente
        System.out.println(potencia);

// Raíz
        double raiz = Math.sqrt(4); // função para raíz quadrada
        System.out.println(raiz);

    Já vimos: Criar projeto
            Comentários em linha única ou múltiplas linhas
            Funções print, println e printf (máscara de substituição)
            Tipos de dados primitivos, os 8 tipos de byte (short, int, long, float, double, char, boolean)
            Strings
            Operadores aritiméticos
            Função ráiz e potência
            Entrada de dados via teclado - Scanner


        int numero;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        numero = input.nextInt();
        System.out.print("O número que você digitou foi: " + numero);
        input.close();

        String palavra;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        palavra = entrada.nextLine();
        System.out.print("A palavra que você digitou foi: " + palavra);
        entrada.close();

        String nome, sobrenome;
        Scanner scanner = new Scanner(System.in); // só declara uma vez
        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine(); // nextline usamos para ler strinsgs
        System.out.print("Digite seu sobrenome: ");
        sobrenome = scanner.nextLine();
        System.out.printf("O meu nome é %s e meu sobrenome é %s", nome, sobrenome);
         // close é a última coisa do código

        String nome, sobrenome;
        int idade;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();
        scanner.nextLine();  //nextline vazio para limpar uma vez

        System.out.print("Digite seu sobrenome: ");
        sobrenome = scanner.nextLine();

        System.out.println(nome);
        System.out.println(sobrenome);
        System.out.println(idade);*/

    }
}