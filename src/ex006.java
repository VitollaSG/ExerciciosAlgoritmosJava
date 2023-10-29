import java.util.Scanner;
public class ex006 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n1 = sc.nextInt();

        System.out.printf("O antecessor de %d é %d%n", n1, n1 - 1 );
        System.out.printf("O sucessor de %d é %d", n1, n1 + 1);

    }
}
