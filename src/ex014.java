import java.util.Scanner;

public class ex014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por quantos dias o veículo foi alugado? ");
        int dias = sc.nextInt();

        System.out.print("Quantos quilômetros foi rodado com o veículo? ");
        double km = sc.nextDouble();

        System.out.printf("O valor total a pagar pelo aluguel é: R$ %.2f reais", dias * 90 + km * 0.20);
        sc.close();
    }
}