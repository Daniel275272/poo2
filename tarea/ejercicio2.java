import java.util.Scanner;

public class ejercicio2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int dia;
        int turno;
        double horas;
        double tarifa = 0;
        double jornal;

        System.out.print("Ingrese el día (1-7, donde 7 es domingo): ");
        dia = sc.nextInt();

        System.out.print("Ingrese el turno (1=diurno, 2=nocturno): ");
        turno = sc.nextInt();

        System.out.print("Ingrese las horas trabajadas: ");
        horas = sc.nextDouble();

        if (turno == 1) {
            tarifa = 5;
        }

        if (turno == 2) {
            tarifa = 8;
        }
        
        if (dia == 7) {
            if (turno == 1) {
                tarifa = tarifa + 2;
            }

            if (turno == 2) {
                tarifa = tarifa + 3;
            }
        }

        jornal = tarifa * horas;

        System.out.println("El jornal es: " + jornal + " euros");
        sc.close();
    }
}