import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
       
    
        System.out.println("Por favor, digite o número da conta!");
        int nConta=scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        String nAgencia= scanner.next();

        scanner.nextLine();
        
        System.out.println("Por favor, digite o seu nome completo!");
        String nome= scanner.nextLine();
        
        System.out.println("Por favor, digite o seu saldo!");
        double saldo= scanner.nextDouble();

        System.out.println("\nOlá "+nome+ ", obrigado por criar uma conta em nosso banco, sua agência é "+ nAgencia+ ", conta " + nConta + " e seu saldo "+ saldo+ " já está disponível para saque.");
    }

}
