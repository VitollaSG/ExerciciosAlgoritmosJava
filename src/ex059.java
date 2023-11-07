import java.util.Scanner;

public class ex059 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sexo = ""; String cont = "s";
        int idade = 0; int maiorIdade = 0;
        int QuantH = 0; int menorIdade = 200;  int somaidade = 0;

        while (cont.equalsIgnoreCase("s")){
            System.out.print(" Qual o sexo da pessoa ? [M / F] ");
            sexo = sc.next();

            System.out.print("Qual a idade : ");
            idade = sc.nextInt();

            if (idade > maiorIdade){
                maiorIdade = idade;
            }
            if(sexo.equalsIgnoreCase("m")){
                QuantH++;
            }
            if ((sexo.equalsIgnoreCase("f") && (idade < menorIdade))){
                menorIdade = idade;
            } else{
                menorIdade = 0;
            }
            if (sexo.equalsIgnoreCase("m")){
                somaidade += idade;
            }
            System.out.print("Quer continuar? ");
            cont = sc.next();
        }

        System.out.printf("A maior idade lida foi %d anos%n", maiorIdade);
        System.out.printf("A quantidade de homens cadastrados foram %d%n", QuantH);
        System.out.printf("A idade da mulher mais jovem é %d anos%n", menorIdade);
        System.out.printf("A média entre as idades dos homens é %.1f", (double)somaidade/QuantH);
        sc.close();
    }

}
