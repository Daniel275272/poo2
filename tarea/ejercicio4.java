import java.util.Scanner;

public class ejercicio4{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);

        int angulo;
        int numero;
        int x, y, z;
        double temperatura;
        double distancia;

        System.out.print("Ingrese un ángulo: ");
        angulo = sc.nextInt();

        System.out.print("Ingrese la temperatura: ");
        temperatura = sc.nextDouble();

        System.out.print("Ingrese un número: ");
        numero = sc.nextInt();

        System.out.print("Ingrese x: ");
        x = sc.nextInt();

        System.out.print("Ingrese y: ");
        y = sc.nextInt();

        System.out.print("Ingrese z: ");
        z = sc.nextInt();

        System.out.print("Ingrese distancia: ");
        distancia = sc.nextDouble();

        // a
        if (angulo == 90) {
            System.out.println("El ángulo es un ángulo recto");
        }
        else {
            System.out.println("El ángulo no es un ángulo recto");
        }

        // b
        if (temperatura > 100) {
            System.out.println("Por encima del punto de ebullición del agua");
        }
        else {
            System.out.println("Por debajo del punto de ebullición del agua");
        }

        //  c
        int totalPositivos = 0;
        int totalNegativos = 0;

        if (numero > 0) {
            totalPositivos = totalPositivos + numero;
        }
        else {
            totalNegativos = totalNegativos + numero;
        }

        System.out.println("Total positivos: " + totalPositivos);
        System.out.println("Total negativos: " + totalNegativos);

        // d
        int contador = 0;

        if (x > y) {
            contador = contador + 1;
        }

        if (z < 20) {
            contador = contador + 1;
        }

        if (contador == 2) {
            int p;
            System.out.print("Ingrese valor para p: ");
            p = sc.nextInt();
        }

        // e
        contador = 0;

        if (distancia > 20) {
            contador = contador + 1;
        }

        if (distancia < 35) {
            contador = contador + 1;
        }

        if (contador == 2) {
            double tiempo;
            System.out.print("Ingrese tiempo: ");
            tiempo = sc.nextDouble();
        }

        sc.close();
    }
}