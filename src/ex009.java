import java.util.Scanner;

public class ex009 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos reais você possui: ");
        double real = sc.nextDouble();

        System.out.printf("Você pode comprar %.2f dolares", real/5.04);

        sc.close();
    }
}
