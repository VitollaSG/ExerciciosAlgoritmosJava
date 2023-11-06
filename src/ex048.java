import java.util.Scanner;

public class ex048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        int soma = 0;
        int n2 = 0;

        while (cont < 7) {

            System.out.print("Digite um número: ");
            int n1 = sc.nextInt();

            soma = n1 + n2;
            n2 = soma;

            cont++;

        }
        System.out.printf("A soma dos valores é: %d", soma);
    }
}
