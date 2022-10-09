import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
    
    try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
        System.out.println("Por favor, informe o seu nome:");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, informe o seu Sobrenome:");
        String sobrenomeCliente = scanner.next();
        
        System.out.println("Por favor, digite o número da Agência:");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite o número da Conta sem o dígito:");
        int numero = scanner.nextInt();

        System.out.println("Por favor, informe o dígito:");
        int digito = scanner.nextInt();
        
        System.out.println("Informe o saldo atual na sua conta:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente +" "+ sobrenomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta "+ numero +"-"+ digito +" e seu saldo " + saldo + " já está disponível para saque.");
    }
    
    
}
}
