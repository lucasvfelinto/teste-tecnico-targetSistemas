# Respostas do Teste Técnico TargetSistemas

Este repositório contém as respostas para o teste técnico da TargetSistemas, utilizado no processo seletivo para estágio na Target Sistemas.

## Questões

### Questão 1

Soma = 91

### Questão 2

Resposta da Questão 2 abaixo:
[Arquivo Fibonacci.java](Fibonacci.java)
ou
```
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
```

### Questão 3

Resposta da Questão 3 aqui:

a) 1, 3, 5, 7, ___

A lógica aqui é adicionar 2 ao número anterior. Portanto, o próximo número será 7 + 2 = 9.

Resposta: 9

b) 2, 4, 8, 16, 32, 64, ____

Aqui, cada número é o dobro do anterior. Então, o próximo número será 64 * 2 = 128.

Resposta: 128

c) 0, 1, 4, 9, 16, 25, 36, ____

Esses são os quadrados dos números naturais, começando de 0. O próximo número será 7^2 = 49.

Resposta: 49

d) 4, 16, 36, 64, ____

Esses são os quadrados dos números pares, começando de 2. O próximo número será 8^2 = 64.

Resposta: 100

e) 1, 1, 2, 3, 5, 8, ____

Essa é a sequência de Fibonacci. Cada número é a soma dos dois anteriores. O próximo número será 8 + 5 = 13.

Resposta: 13

f) 2,10, 12, 16, 17, 18, 19, ____

A lógica aqui é menos clara, mas parece haver um padrão de adição. Observando os números, podemos ver que são todos números consecutivos. O próximo número será 19 + 1 = 20.

Resposta: 20

### Questão 4

Resposta da Questão 4 aqui:
1. **Identificação dos interruptores:**

   Rotule os interruptores como A, B e C.

2. **Primeira ida às salas das lâmpadas:**
   - Ligue o interruptor A e aguarde um tempo.
   - Desligue o interruptor A e ligue o interruptor B.
   - Visite a primeira sala.

3. **Observação da primeira sala:**
   - Se a lâmpada da sala estiver apagada e quente, então o interruptor A controla essa lâmpada.
   - Se a lâmpada da sala estiver acesa, mas não estiver quente, então o interruptor B controla essa lâmpada.
   - Se a lâmpada da sala estiver apagada, mas não estiver quente, então o interruptor C controla essa lâmpada.

### Questão 5

Resposta da Questão 5 abaixo:
[Arquivo InverterString.java](InverterString.java)
ou
```
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

```

## Contato

Se houver alguma dúvida ou questão relacionada ao conteúdo deste repositório, sinta-se à vontade para entrar em contato.

[Lucas Felinto](https://github.com/lucasvfelinto)

[(81) 9 9865-0161](https://wa.me/5581998650161)
---

Este repositório é destinado exclusivamente para o processo seletivo de estágio da TargetSistemas. Todos os direitos reservados.
