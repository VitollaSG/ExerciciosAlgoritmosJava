import java.util.Scanner;
import java.util.Locale;
public class ex005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite a primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double n2 = sc.nextDouble();

        System.out.printf("A média entre %.1f e %.1f é %.1f ", n1, n2, (n1 + n2)/2);

        sc.close();
    }
}
