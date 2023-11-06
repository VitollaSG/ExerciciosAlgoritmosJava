import java.util.Scanner;

public class ex049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        int par = 0;
        int impar = 0;

        while (cont < 6) {

            System.out.print("Digite um número: ");
            int n1 = sc.nextInt();

            if (n1 %2 == 0){
                par++;
            }
            else{
                impar++;
            }
            cont++;

        }
        System.out.printf("Foram digitados %d número(s) par(es) e %d número(s) ímpar(es).%n", par, impar);

    }
}


