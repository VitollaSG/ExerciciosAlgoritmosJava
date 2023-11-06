public class ex047 {
    public static void main(String[] args) {

        int n1 = 500;
        int n2 = 0;

        int soma = 0;

        while (n1 > 0){

            soma = n1 + n2;
            n2 = soma;
            n1 = n1 - 50;
        }
        System.out.println(soma);
    }
}
