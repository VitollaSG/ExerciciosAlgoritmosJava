import java.util.Scanner;

public class ex016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de cigarros fumados por dia: ");
        double cigarros = sc.nextDouble();

        System.out.print("Digite a quantidade de dias fumados: ");
        double dias = sc.nextDouble();

        System.out.printf("A quantidade de dias perdidos por conta do cigarro é de %.1f dias", (cigarros * dias * 10) / 1440);
    }
}
