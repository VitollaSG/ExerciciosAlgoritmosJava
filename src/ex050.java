import java.util.Random;

public class ex050 {
    public static void main(String[] args) {
        Random num = new Random();
        int cont = 0; int quant = 0; int maiorque5 = 0; int div3 = 0;



        while (cont < 20) {

            System.out.print(" " + num.nextInt(10));
            if (num.nextInt() > 5){
                maiorque5++;
            }
            if (num.nextInt() % 3 == 0){
                div3++;
            }
            quant++;
            cont++;
        }

        System.out.printf("%n Foram sorteados %d números acima de 5 %n", maiorque5);
        System.out.printf("%d dos números sorteados são divisiveis por 3", div3);

    }
}
