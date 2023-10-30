import java.util.Scanner;

public class ex008 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a distancia em metros que deseja converter: ");
        double n1 = sc.nextDouble();

        System.out.printf("%.0f metros em decâmetro  é %.2f dam%n: ", n1, n1 / 10);
        System.out.printf("%.0f metros em hectômetro  é %.2f hm%n: ", n1, n1 / 100);
        System.out.printf("%.0f metros em quilômetro  é %.2f km%n: ", n1, n1 / 1000);
        System.out.printf("%.0f metros em decímetro   é %.2f dm%n: ", n1, n1 * 10);
        System.out.printf("%.0f metros em centímetro  é %.2f cm%n: ", n1, n1 * 100);
        System.out.printf("%.0f metros em milímetro  é: %.2f mm", n1, n1 * 1000);

        sc.close();

    }
}
