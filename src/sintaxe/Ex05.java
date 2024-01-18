package sintaxe;
import java.util.Scanner;;
//Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tensao;

        System.out.println("Digite o valor da corrente do circuito: ");
        double corrente = scanner.nextDouble();

        System.out.println("Digite o valor da Resistencia do circuito: ");
        double resistencia = scanner.nextDouble();

        tensao = (resistencia * corrente);
        System.out.println("O valor da tensao do circuito é de: " + tensao);
    }
}
