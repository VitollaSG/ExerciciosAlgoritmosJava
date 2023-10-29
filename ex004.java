import java.util.Scanner;
public class ex004 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo valor: ");
        int n2 = sc.nextInt();

        System.out.printf("A soma entre %d e %d é igual a %d", n1, n2, n1 + n2);
    }
}
