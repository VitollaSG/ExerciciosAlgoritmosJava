import java.util.Scanner;

public class ex066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite um número para ver sua tabuada: ");
        int n = sc.nextInt();

        for (int c = 0; c <= 10; c++)
        System.out.printf("%d X %d = %d%n", n, c, n * c);

    }
}
