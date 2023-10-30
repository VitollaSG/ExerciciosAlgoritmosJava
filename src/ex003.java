import java.util.Scanner;
public class ex003 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual nome do funcionário? ");
        String nome = sc.nextLine();

        System.out.print("Qual o valor do salário? ");
        double sal = sc.nextDouble();

        System.out.printf ("O funcionário %s tem um slário de R$ %.2f reais", nome, sal);

        sc.close();
    }
}
