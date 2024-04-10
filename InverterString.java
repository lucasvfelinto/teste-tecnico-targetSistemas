import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String texto = scanner.nextLine();

        String textoInvertido = inverterString(texto);
        System.out.println("String invertida: " + textoInvertido);

        scanner.close();
    }

    public static String inverterString(String texto) {
        char[] caracteres = texto.toCharArray();
        int tamanho = caracteres.length;
        for (int i = 0; i < tamanho / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[tamanho - 1 - i];
            caracteres[tamanho - 1 - i] = temp;
            System.out.println(caracteres);
        }
        return new String(caracteres);
    }
}
