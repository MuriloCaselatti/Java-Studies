package sintaxe;
import java.util.Scanner;
//Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e dois metros e que um quilômetro possui mil metros, fazer um programa para converter milhas marítimas emquilômetros

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a distância em marítima: ");
        double milhasMaritimas = scanner.nextDouble();

        //se 1 milhaM é igual 1852km
        //1 km é igual 1000m

        double km = milhasMaritimas * 1852 /1000;
        System.out.println(milhasMaritimas + " Milhas Maritimas correspondem a: " + km + "quilometros");
        
    }
}
