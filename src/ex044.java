import java.util.Scanner;

public class ex044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número inicial da contagem : ");
        int n1 = sc.nextInt();

        System.out.print("Digite até qual número deseja contar: ");
        int n2 = sc.nextInt();

        System.out.print("Digite quantos números deseja pular na contagem: ");
        int n3 = sc.nextInt();

        System.out.print("Contagem: ");

        if (n1 < n2) {
            while (n1 <= n2) {
                System.out.print(n1 + ", ");
                n1 = n1 + n3;
            }
        }else {
            while (n1 >= n2) {
                System.out.print(n1 + ", ");
                n1 = n1 - n3;
            }
        }
        System.out.print("acabou!!");
    }
}

