import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        int numero;
        String agencia;
        String nomeCompleto;
        double saldo;

        //TODO: Conhecer e importar a classe Scanner;
        Scanner scanner = new Scanner(System.in);

        //Exibir as mensagens para o nosso usuário
        //Obter pelo scanner os valores digitados no terminal
        System.out.println("Por favor, digite o número da Numero!");
        numero = Integer.parseInt(scanner.nextLine());
        System.out.println("Por favor, digite o número da Agência!");
        agencia = scanner.nextLine();
        System.out.println("Por favor, digite o número da Nome Cliente!");
        nomeCompleto = scanner.nextLine();
        System.out.println("Por favor, digite o número da Saldo!");
        saldo = Double.parseDouble(scanner.nextLine());

        //Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
