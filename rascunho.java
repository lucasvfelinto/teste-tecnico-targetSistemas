public class rascunho {

    public static void main(String[] args) {
        questao01();
    }

    public static void questao01() {
        int indice = 13, soma = 0, k = 0;
        while (k < indice) {
            k++;
            soma = soma + k;
        }
        System.out.println(soma);
    }

    public static int questao02(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } 

        
        return n;
    }
}
