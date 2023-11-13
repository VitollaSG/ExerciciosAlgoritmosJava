import java.util.Scanner;

public class ex067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite até que número você quer contar: ");
        int n = sc.nextInt();

        for(int c = 0; c <= n; c++){
            System.out.print(c + ", ");
        }
        System.out.print("fim");
    }
}
