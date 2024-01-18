package sintaxe;
import java.util.Scanner;;


public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double velocidadeFinal;

        System.out.println("Digite o valor da aceleração: ");
        double aceleracao = scanner.nextDouble();

        System.out.println("Digite o valor da velocidade inicial: ");
        double velocidadeI = scanner.nextDouble();

        System.out.println("Digite o tempo do percurso em segundos: ");
        double tempo = scanner.nextDouble();

        velocidadeFinal = velocidadeI + (aceleracao * (tempo/60));

        System.out.println("O valor da Velocidade Final do Automovel foi de: " + velocidadeFinal);
    }
}
