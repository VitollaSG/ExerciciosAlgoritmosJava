import java.util.Scanner;

public class ex062 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Nidade = 0; int totalIdade = 0; int Midade = 0;
        String cont = "";

        do {
            System.out.print("Digite a idade: ");
            int idade = sc.nextInt();

            totalIdade += idade;
            Nidade ++;

            if (idade > 21){
                Midade++;
            }

            System.out.print("Quer continuar? [S/N]");
            cont = sc.next();

        } while(cont.equalsIgnoreCase("s"));
        System.out.printf("Foram digitadoas %d idades %n", Nidade);
        System.out.printf("A média entre todas idades digitadas é %d %n", totalIdade/Nidade );
        System.out.printf("%d pessoas tem mais que 21 anos %n", Midade);

        sc.close();
    }
}
