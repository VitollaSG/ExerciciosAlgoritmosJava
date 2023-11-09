import java.util.Scanner;

public class ex037 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Qual seu nome? ");
            String nome = sc.nextLine();

            System.out.print("Qual seu salário atual?");
            double salario = sc.nextDouble();

            sc.nextLine();

            System.out.print("Qual seu genero? (Masculino/Feminino/Todes)? ");
            String genero = sc.nextLine();

            System.out.println("A quanto tempo trabalha na empresa?");
            double tempo = sc.nextDouble();

            double salarioNovo;

            if (genero.equalsIgnoreCase("feminino")){
                if ( tempo < 15){
                    salarioNovo = salario * 0.05;
                    System.out.printf("Parabens, ganhou um aumento de R$: %.2f", salarioNovo);
                }
                else if ( tempo < 20){
                    salarioNovo = salario * 0.12;
                    System.out.printf("Parabens, ganhou um aumento de R$: %.2f", salarioNovo);
                }
                else{
                    salarioNovo = salario * 0.23;
                    System.out.printf("Parabens, ganhou um aumento de R$: %.2f", salarioNovo);
                }
            }
            else if (genero.equalsIgnoreCase("m")){
                if ( tempo < 20){
                    salarioNovo = salario * 0.03;
                    System.out.printf("Parabens, ganhou um aumento de R$: %.2f", salarioNovo);
                }
                else if ( tempo < 30){
                    salarioNovo = salario * 0.13;
                    System.out.printf("Parabens, ganhou um aumento de R$: %.2f", salarioNovo);
                }
                else{
                    salarioNovo = salario * 0.25;
                    System.out.printf("Parabens, ganhou um aumento de R$: %.2f", salarioNovo);
                }
            }
            else {
                System.out.println("Você perdeu todo seu salario para deixar de ser besta");
            }

    }
}
