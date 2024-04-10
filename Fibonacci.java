import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
            int numero = scanner.nextInt();

            if (verificarFibonacci(numero)) {
                System.out.println(numero + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println(numero + " não pertence à sequência de Fibonacci.");
            }

            System.out.print("Deseja verificar outro número? (S/N): ");
            String opcao = scanner.next();

            if (!opcao.equalsIgnoreCase("S")) {
                continuar = false;
            }
        }

        scanner.close();
    }

    public static boolean verificarFibonacci(int numero) {
        int a = 0;
        int b = 1;
        if (numero == 0) {
            return true;
        }

        while (b <= numero) {
            if (b == numero) {
                return true;
            }
            int temp = b;
            b = a + b;
            a = temp;
        }
        return false;
    }
}
