import java.util.Scanner;

public class ex051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        double maiorPreco = 0;
        double menorPreco = 0;


        System.out.print("Digite o valor do produto: ");
        double preco = sc.nextDouble();
        menorPreco = preco;

        while (cont < 7) {
            System.out.print("Digite o valor do produto: ");
            preco = sc.nextDouble();

            if (preco > maiorPreco){
                maiorPreco = preco;
            }
            if (preco < menorPreco){
                menorPreco = preco;
            }
            cont++;
        }
        System.out.printf("O maior preço digitado foi: R$ %.2f reais %n", maiorPreco);
        System.out.printf("O menor preço digitado foi: R$ %.2f reais", menorPreco);
        sc.close();
    }
}
