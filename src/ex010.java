import java.util.Scanner;

public class ex010 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a altura da parede: ");
        double altura = sc.nextDouble();

        System.out.print("Digite a largura da parede: ");
        double largura = sc.nextDouble();

        System.out.printf("Para uma parede com %f metros quadrados será necessário %.1f litros de tinta para o serviço. ", largura * altura, (largura * altura) / 2);

    }
}
