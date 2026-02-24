import java.util.Scanner;

public class ejercio1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double distancia;
        double precioTotal;
        int dias;
        int descuento = 0;
        System.out.print("Ingrese la distancia en km: ");
        distancia = sc.nextDouble();
        System.out.print("Ingrese los días de estancia: ");
        dias = sc.nextInt();
        precioTotal = distancia * 2 * 2.5;
        if (distancia > 800) {
            descuento = descuento + 1;
        }

        if (dias > 7) {
            descuento = descuento + 1;
        }

        if (descuento == 2) {
            precioTotal = precioTotal - precioTotal * 30 / 100;
        }

        System.out.println("El precio del billete es: " + precioTotal + " euros");


        sc.close();
    }
}