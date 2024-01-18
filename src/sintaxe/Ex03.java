package sintaxe;
import java.util.Scanner;;
//Calcular e exibir a média aritmética de quatro valores quaisquer que serãodigitadospelo usuário.

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mediaAritmetica;

        System.out.println("Digite o primeiro valor: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo valor: ");
        double num2 = scanner.nextDouble();

        System.out.println("Digite o terceiro valor: ");
        double num3 = scanner.nextDouble();

        System.out.println("Digite o quarto valor: ");
        double num4 = scanner.nextDouble();

        mediaAritmetica = ((num1 + num2 + num3 + num4) / 4);

        System.out.println("A média aritmética dos valores foi igual a: " + mediaAritmetica);
    }
}
