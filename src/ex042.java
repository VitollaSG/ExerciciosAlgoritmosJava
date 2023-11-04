import java.util.Scanner;

public class ex042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite até qual número deseja contar: ");
        int n1 = sc.nextInt();
        int cont = 0;

        System.out.print("Contagem: ");

        while (cont <= n1){
            System.out.print(cont + ", ");
            cont++;
        }
        System.out.print("acabou!!");
        sc.close();
    }
}

