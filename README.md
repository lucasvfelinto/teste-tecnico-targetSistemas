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

Resposta da Questão 3 aqui...

### Questão 4

Resposta da Questão 4 aqui...

### Questão 5

Resposta da Questão 5 aqui...

## Contato

Se houver alguma dúvida ou questão relacionada ao conteúdo deste repositório, sinta-se à vontade para entrar em contato.

[Lucas Felinto](https://github.com/lucasvfelinto)

[(81) 9 9865-0161](https://wa.me/5581998650161)
---

Este repositório é destinado exclusivamente para o processo seletivo de estágio da TargetSistemas. Todos os direitos reservados.
