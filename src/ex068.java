import java.util.Scanner;

public class ex068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mulheres = 0;
        int Hpeso = 0;
        double MpesoM = 0;
        double MaiorPH = 0;

        for (int cont = 0; cont < 8; cont++) {
            System.out.print("Digite o sexo da pessoa:");
            String sexo = sc.next();

            System.out.print("Diite o peso da pessoa: ");
            double peso = sc.nextDouble();

            if (sexo.equalsIgnoreCase("f")){
                mulheres++;
                MpesoM += peso;
            }
            if ((sexo.equalsIgnoreCase("m")) && (peso > 100)){
                Hpeso++;
            }
            if ((sexo.equalsIgnoreCase("m")) && (peso > MaiorPH)){
                MaiorPH = peso;
            }

        }
        System.out.printf("Foram cadastradas %d mulheres%n", mulheres);
        System.out.printf("%d homens pesam mais que 100kg%n", Hpeso);
        System.out.printf("A média de peso entre as mulheres é de %.1fkg%n", MpesoM / mulheres);
        System.out.printf("O maior peso entre os homens é de %.1fkg", MaiorPH);
        sc.close();

    }
}
