import java.util.Scanner;

public class ex017 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a velocidade do veículo: ");
        int vel = sc.nextInt();
        int multa = 5;

        if (vel > 80){

            System.out.println("Velocidade acima do permitido");
            System.out.printf("Valor da multa R$ %d,00 reais", (vel - 80) * multa);
        }
        else{
            System.out.println("Velocidade permitida");
        }
        sc.close();
    }
}
