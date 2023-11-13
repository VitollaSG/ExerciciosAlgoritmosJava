import java.util.Random;
import java.util.Scanner;

public class ex032 {
    public static void main(String[] args) {
        Random num = new Random();
        Scanner sc = new Scanner(System.in);
        String cont = "s";

        while (cont.equalsIgnoreCase("s")) {

            int n2 = num.nextInt(10);

            System.out.print("Digite um número: ");
            int n1 = sc.nextInt();

            if (n1 == n2){
                System.out.println("Você acertou!");
            } else {
                System.out.println("Você errou!");
            }
            System.out.print("Quer jogar novamente? ");
            cont = sc.next();
        }
        sc.close();
    }
}
