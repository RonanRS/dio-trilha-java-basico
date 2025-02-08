import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaBanco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContaTerminal conta1 = new ContaTerminal();


        System.out.println("Qual o número da conta: ");
        conta1.conta = scan.nextInt();

        System.out.println("Qual o número da agência: ");
        conta1.agencia = scan.next();

        scan.nextLine();
        System.out.println("Qual o nome do cliente: ");
        conta1.cliente = scan.nextLine();

        System.out.println("Qual o saldo da conta: ");
        conta1.saldo = scan.nextDouble();

        System.out.println("Conta: " + conta1.conta);
        System.out.println("Agência: " + conta1.agencia);
        System.out.println("Cliente: " + conta1.cliente);
        System.out.println("Saldo: " + conta1.saldo);

        scan.close();
    }
}