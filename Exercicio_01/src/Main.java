import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1,num2, soma;
        Scanner sc = new Scanner(System.in);

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        soma = num1+num2;

        System.out.printf("SOMA = %d%n", soma);
    }
}