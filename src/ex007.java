import java.util.Scanner;
public class ex007 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número real: ");
        double n1 = sc.nextDouble();

        System.out.printf("O dobro de %.1f é %.2f%n", n1, n1 * 2);
        System.out.printf("A terça parte de %.1f é %.2f%n", n1, n1 / 3);

    }
}
