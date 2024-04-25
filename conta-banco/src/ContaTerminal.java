import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        //TODO:Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in);

        //Exibir as menssagens ao usuário
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numero = Integer.parseInt(sc.nextLine()); // Lê como string e converte para inteiro

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = Double.parseDouble(sc.nextLine()); // Lê como string e converte para double

        // Exibindo mensagem formatada com os dados inseridos
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo +
                " já está disponível para saque.");

        sc.close(); // Fechando o scanner
    }
}


