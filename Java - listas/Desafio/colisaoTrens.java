import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class colisaoTrens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            double s0a = lerNumero(scanner, "Posição inicial do Trem A (KM 0 a 10.000): ", 0, 10000);
            double s0b = lerNumero(scanner, "Posição inicial do Trem B (KM 0 a 10.000): ", 0, 10000);

            // Validação de velocidades conforme requisitos
            double va = lerNumero(scanner, "Velocidade do Trem A (positiva, até 300 km/h): ", 0.0001, 300);
            double vb = lerNumero(scanner, "Velocidade do Trem B (negativa, até -300 km/h): ", -300, -0.0001);

            // Verificação de situação onde não há colisão
            if (s0a > s0b) {
                System.out.println("Os trens estão se distanciando. A colisão não ocorrerá.");
            } else {
                // Cálculo do tempo em horas: t = (S0a - S0b) / (Vb - Va)
                double tHoras = (s0a - s0b) / (vb - va);
                double tSegundos = tHoras * 3600;

                // Cálculo da posição de colisão: S = S0a + Va * t
                double posicaoColisao = s0a + (va * tHoras);

                // Cálculo do horário
                LocalTime horarioPartida = LocalTime.of(17, 0, 0);
                LocalTime horarioColisao = horarioPartida.plusSeconds((long) tSegundos);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

                // Saída formatada
                System.out.printf("A colisão de trens acontecerá no KM %.0f e ocorrerá após %.0f segundos no horario de %s\n",
                        posicaoColisao, tSegundos, horarioColisao.format(formatter));
            }

            System.out.print("Deseja executar novamente? (S/N): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("S"));

        System.out.println("FIM DO PROGRAMA");
        scanner.close();
    }

    // Função para validar se a entrada é numérica e está no intervalo
    private static double lerNumero(Scanner sc, String mensagem, double min, double max) {
        double valor;
        while (true) {
            System.out.print(mensagem);
            if (sc.hasNextDouble()) {
                valor = sc.nextDouble();
                if (valor >= min && valor <= max) return valor;
                System.out.printf("Erro: O valor deve estar entre %.0f e %.0f.\n", min, max);
            } else {
                System.out.println("Você digitou um caractere inválido. Por favor, digite novamente.");
                sc.next();
            }
        }
    }
}
