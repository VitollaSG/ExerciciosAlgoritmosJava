import java.util.Scanner;

public class ex057 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double salario = 0;
        double salarioTotalM = 0; double salarioTotalF = 0;
       String cont = "s";


        while (cont.equalsIgnoreCase("s")){
            System.out.print("Qual o salário do funcionário? ");
            salario = sc.nextDouble();

            System.out.print("Qual o sexo do funcionário? ");
            String sexo = sc.next();

            if (sexo.equalsIgnoreCase("m")){
                salarioTotalM += salario;

            }else {
                salarioTotalF += salario;
            }

            System.out.println("Deseja repetir: (S/N)?");
            cont = sc.next();
        }

        System.out.printf("O salário total dos homens é: %.2f reais%n", salarioTotalM);
        System.out.printf("O salario total das mulheres é: %.2f reais: ", salarioTotalF);
        sc.close();

    }
}