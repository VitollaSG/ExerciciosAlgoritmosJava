import java.util.Scanner;

public class ex013 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário atual do funcionário: ");
        double sal = sc.nextDouble();

        System.out.printf("O valor do salário com aumento será: R$ %.2f reais", sal + (sal * 15 / 100));
        sc.close();
    }
}
