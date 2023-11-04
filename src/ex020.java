import java.util.Scanner;

public class ex020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n1 = sc.nextInt();

        if (n1 % 2 == 0){
            System.out.print("O número digitado é par");

        }else{
            System.out.print("O número digitado é impar");
        }
        sc.close();
    }
}
