import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicitando e recebendo dados do usuário
        System.out.print("Por favor, digite o número da Agência: ");
        int numero = scanner.nextInt();

        System.out.print("Por favor, digite a Agência: ");
        String agencia = scanner.next();

        System.out.print("Por favor, digite o Nome do Cliente: ");
        String nomeCliente = scanner.next();

        System.out.print("Por favor, digite o Saldo: ");
        double saldo = scanner.nextDouble();

        // Exibindo mensagem com as informações inseridas pelo usuário
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechando o scanner
        scanner.close();

       
    }
}
