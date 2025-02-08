import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaBanco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("------- Bem-vindo ao Banco Mundial -------");

        System.out.println("Qual o número da conta: ");
        int conta = scan.nextInt();

        System.out.println("Qual o número da agência: ");
        String agencia = scan.next();

        scan.nextLine();
        System.out.println("Qual o nome do cliente: ");
        String cliente = scan.nextLine();

        System.out.println("Qual o saldo da conta: ");
        double saldo = scan.nextDouble();

        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " +saldo + " já está disponível para saque.");

        scan.close();
    }
}