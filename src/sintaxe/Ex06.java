package sintaxe;
import java.util.Scanner;


//Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e exibir sua temperatura equivalente em Fahrenheit.
public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double fahrenheit;

        System.out.println("Digite o valor da temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        fahrenheit = ((celsius * 9/5) + 32);
        System.out.println("O valor da temperatura em Fahrenheit é equivalente a: " + fahrenheit);

    }
}
