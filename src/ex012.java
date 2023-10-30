import java.util.Scanner;

public class ex012 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o preço do produto? ");
        double preco = sc.nextDouble();

        System.out.printf("O valor do produto com desconto é: R$ %.2f reais", preco - (preco * 5 / 100) );

    }
}
