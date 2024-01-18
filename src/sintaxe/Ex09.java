package sintaxe;
import java.util.Scanner;;

//Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de dólares. Calcular e exibir o valor correspondente em Reais (R$).

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double real;

        System.out.println("Digite o valor da cotação atual do dolar: ");
        double cotacao = scanner.nextDouble();

        System.out.println("Digite o valor em dolar: ");
        double dolar = scanner.nextDouble();

        real = (cotacao * dolar);

        System.err.println("O valor em real corresponde a: " + real);

        scanner.close();
    }
}
