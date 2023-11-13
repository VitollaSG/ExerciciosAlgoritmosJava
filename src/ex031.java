import java.util.Random;
import java.util.Scanner;

public class ex031 {
    public static void main(String[] args) {
        Random num = new Random();
        Scanner sc = new Scanner(System.in);
        String cont = "s";

        while (cont.equalsIgnoreCase("s")) {
            int n1 = num.nextInt(3);
            System.out.println(n1);
            System.out.println("=====================JokenPo=====================");
            System.out.println("Digite 1 para papel");
            System.out.println("Digite 2 para pedra");
            System.out.println("Digite 3 para tesoura");
            System.out.println("=====================JokenPo=====================");

            System.out.print("Digite um número: ");
            int n2 = sc.nextInt();


            if ((n1 == 1) && (n2 == 2) || (n1 == 2) && (n2 == 3) ||(n1 == 3) && (n2 == 1)){
                System.out.println("Você perdeu!");
            }
            else if ((n1 == 1) && (n2 == 3) || (n1 == 2) && (n2 == 1) || (n1 == 3) && (n2 == 2)) {
                System.out.println("Você ganhou!!");
            }
            else{
                System.out.println("Empate");
            }
            System.out.print("Quer jogar novamente? ");
            cont = sc.next();
            sc.close();
        }
    }
}

