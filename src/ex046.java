public class ex046 {
    public static void main(String[] args) {
        int n1 = 0;
        int c = 6;
        int soma = 0;

        while (c < 100) {
            soma = c + n1;
            n1 = soma;
            c = c + 2;

       }
        System.out.print(soma);
    }
}