import java.util.Scanner;

public class ex056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = 0;
        int soma = 0;
        int n2 = 0;
        String cont = "s";

        while(cont.equals("s")){

            System.out.print("Digite um número: ");
            n1 = sc.nextInt();

            soma = n1 + n2;
            n2 = soma;

            System.out.print("Deseja continuar [S/N] ");
            cont = sc.next();
        }
        System.out.printf("A soma dos valores é: %d", soma);
        sc.close();
    }
}








