import java.util.Scanner;

public class ex015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de dias trabalhado: ");
        double dias = sc.nextDouble();

        System.out.printf("O salário desse mês é: R$ %.2f reais", 25 * 8 * dias);
    }
}
