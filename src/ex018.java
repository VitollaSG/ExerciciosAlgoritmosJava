import java.util.Scanner;

public class ex018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual ano de nescimento? ");
        int anoNasc = sc.nextInt();
        int anoAtual = 2023;

        if (anoAtual - anoNasc >= 16){
            System.out.printf("Você tem %d anos, já pode votar", anoAtual-anoNasc);
        }
        else{
            System.out.printf("Você tem %d anos, ainda não pode votar", anoAtual-anoNasc);
        }
    }
}
