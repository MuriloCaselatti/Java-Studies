//Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que serádigitado.

package sintaxe;
//java.util é uma biblioteca do Java. Scanner é um classe que serve para analisar dados primitivos e strings a partir de uma entrada, seja teclado ou outros tipos de dados
import java.util.Scanner;;

public class Ex01 {
    public static void main(String[] args) {
        int result;
        //Scanner é uma classe que estou instanciando uma variavel
        //scanner é minha variavel que estou usando para me referir a instancia Scanner
        //new Scanner está criando uma nova instancia da classe Scanner
        //System.in esta representando o console, assim estou criando um scanner que le a entrada do teclado
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da aresta do quadrado: ");
        int aresta = scanner.nextInt();

        result = (aresta * aresta);
        System.out.print("O valor da area do quadrado é igual a: " + result);
    }
}
