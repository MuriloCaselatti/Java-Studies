package sintaxe;
import java.util.Scanner;


//Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da base que serão digitados.

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double volumeCone;
        double pi = 3.14;

        System.out.println("Digite o valor da altura do cone: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite o valor do raio da base: ");
        double raio = scanner.nextDouble();

        volumeCone = ((1.0 / 3.0 * altura) * pi * (raio*raio));
        System.out.println("O volume do cone corresponde a: " + volumeCone);

        scanner.close();
    }
}
