import java.util.Scanner;

public class Ancestor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("O antecessor de " + numero + "é" +antecessor);
        System.out.println("O Sucessor de " + numero + "é" + sucessor);

        sc.close();
    }
}