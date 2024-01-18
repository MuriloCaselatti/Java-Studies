package sintaxe;
import java.util.Scanner;
//A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double areaCirculo;
        double pi = 3.14;

        System.out.println("Digite o valor do diametro do Circulo: ");
        double diametro = scanner.nextDouble();

        areaCirculo = pi * diametro;

        System.out.println("A area do circulo corresponde a: " + areaCirculo);
    }
}
