import java.util.Scanner;
import java.util.Locale;

public class ContaBanco {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Olá cliente. Por favor, informe o seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.println("Por favor, informe a sua Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Insira o número da Agência:");
        Integer numero = scanner.nextInt();

        System.out.printf("Insira o seu saldo: ");
        Float saldo = scanner.nextFloat();

        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", o número da conta é " + numero + " e o seu saldo de " + saldo + " já está disponível para o saque.");
        
    }
}
