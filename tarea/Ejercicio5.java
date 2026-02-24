import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int numero1, numero2;

        System.out.print("Ingrese el primer número: ");
        numero1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        numero2 = sc.nextInt();

        if (numero1 > numero2) {
            System.out.println("El primer número es el mayor");
        }
        else if (numero1 < numero2) {
            System.out.println("El primer número es el más pequeño");
        }
        else {
            System.out.println("Ambos números son iguales");
        }

        sc.close();
    }
}
