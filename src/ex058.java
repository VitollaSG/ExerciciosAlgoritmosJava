import java.util.Scanner;

public class ex058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cont = "s";
        int somaidade = 0;
        int idade = 0;
        int Nalunos = 0;

        while (cont.equals("s")){
            System.out.print("Digite qual a idade do aluno: ");
            idade = sc.nextInt();
            somaidade += idade;
            Nalunos++;

            System.out.print("Quer continuar? [S/N]");
            cont = sc.next();
        }
        System.out.printf("A média da idade dos alunos é %d anos", somaidade/Nalunos);
        sc.close();
    }
}
