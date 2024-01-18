package sintaxe;
import java.util.Scanner;;
//A partir dos valores da base e altura de um triângulo, calcular e exibir suaárea.


public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int result;

        System.out.print("Digite o valor da base do tringulo: ");
        int base = scanner.nextInt();

        System.out.print("Digite o valor da altura do triangulo: ");
        int altura = scanner.nextInt();

        result = base * altura;

        System.out.println("O valor da area do triangulo é igual a: " + result );
    }
}
