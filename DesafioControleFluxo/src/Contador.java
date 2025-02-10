import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = scan.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = scan.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro precisa ser maior do que o primeiro.");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm < parametroDois) {
            int contagem = parametroDois - parametroUm;
            for (int i = 0; i < contagem; i++) {
                System.out.println("Imprimindo o número " + (i + 1));
            }
        } else {
            throw new ParametrosInvalidosException();
        }
    }
}