import java.util.Scanner;

public class ex063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cont = "s";
        double soma = 0;
        double c = 0;
        double par = 0;

        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        soma += n;
        double menorV = n;
        if (n % 2 == 0) {
            par++;
        }

        sc.nextLine();
        System.out.print("Quer continuar? [s/n]");
        cont = sc.nextLine();

        do {
            System.out.print("Digite um número: ");
            n = sc.nextInt();
            soma += n;

            if (n < menorV) {
                menorV = n;
            }
            if (n % 2 == 0) {
                par++;
            }

            c++;
            sc.nextLine();
            System.out.print("Quer continuar? [s/n]");
            cont = sc.nextLine();
        } while (cont.equalsIgnoreCase("s"));

        System.out.printf("A soma entre todos os números é: %.0f%n", soma);
        System.out.printf("O menor valor digitado foi %.0f%n", menorV);
        System.out.printf("A média entre todos os valores é: %.1f%n", soma / c);
        System.out.printf("%.0f valor(es) digitados são par", par);
    }
}
