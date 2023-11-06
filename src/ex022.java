import java.util.Scanner;

public class ex022 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite em qual ano você nasceu: ");
            int AnoNasc = sc.nextInt();

            int AnoAtual = 2023;

            if (AnoAtual - AnoNasc < 18){
                System.out.printf("Você ainda falta %d ano(s) pra poder se alistar.", 18 - (AnoAtual - AnoNasc));

             }else{
                System.out.printf("Você passou %d ano(s) do alistamento.", (AnoAtual - AnoNasc) -18 );
            }
            sc.close();
        }
}
