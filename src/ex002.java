import java.util.Scanner;
public class ex002 {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Qual seu nome? ");
        String nome = sc.nextLine();
        System.out.print("Olá "+ nome + ", è um prazer de conhecer!!" );

        sc.close();
    }
}
