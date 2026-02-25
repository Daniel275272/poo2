import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int dia;
        int mes;
        int año;

        System.out.print("Ingrese día: ");
        dia = sc.nextInt();

        System.out.print("Ingrese mes: ");
        mes = sc.nextInt();

        System.out.print("Ingrese año: ");
        año = sc.nextInt();

        dia = dia + 1;

        // febrero
        if (mes == 2) {
            if (dia > 28) {
                dia = 1;
                mes = mes + 1;
            }
        }

        // Meses de 30 días
        if (mes == 4) {
            if (dia > 30) {
                dia = 1;
                mes = mes + 1;
            }
        }

        if (mes == 6) {
            if (dia > 30) {
                dia = 1;
                mes = mes + 1;
            }
        }

        if (mes == 9) {
            if (dia > 30) {
                dia = 1;
                mes = mes + 1;
            }
        }

        if (mes == 11) {
            if (dia > 30) {
                dia = 1;
                mes = mes + 1;
            }
        }

        // Meses de 31 días
        if (mes == 1) {
            if (dia > 31) {
                dia = 1;
                mes = mes + 1;
            }
        }

        if (mes == 3) {
            if (dia > 31) {
                dia = 1;
                mes = mes + 1;
            }
        }

        if (mes == 5) {
            if (dia > 31) {
                dia = 1;
                mes = mes + 1;
            }
        }

        if (mes == 7) {
            if (dia > 31) {
                dia = 1;
                mes = mes + 1;
            }
        }

        if (mes == 8) {
            if (dia > 31) {
                dia = 1;
                mes = mes + 1;
            }
        }

        if (mes == 10) {
            if (dia > 31) {
                dia = 1;
                mes = mes + 1;
            }
        }

        // Diciembre 
        if (mes == 12) {
            if (dia > 31) {
                dia = 1;
                mes = 1;
                año = año + 1;
            }
        }

        System.out.println("La fecha del día siguiente es: " + dia + "/" + mes + "/" + año);
        sc.close();
    }
}
