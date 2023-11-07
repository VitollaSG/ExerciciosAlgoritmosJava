import java.util.Scanner;

public class ex019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double n2 = sc.nextDouble();

        double media = ((n1 + n2) / 2);

        if (media < 7){
            System.out.printf("Sua média foi %.1f. Apriveitamento razoável", media);

        }else{
            System.out.printf("Sua média foi %.1f. Apriveitamento bom", media);

        }
        sc.close();
    }
}
