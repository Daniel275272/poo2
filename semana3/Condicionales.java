import java.util.Scanner;

public class Condicionales {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Leer dos números y deducir si están en orden creciente a<=b
        int a = 0, b = 0;
        System.out.print("digite a: ");//solicitamos el valor de a
        a = sc.nextInt();//aplicamos por teclado el valor
        System.out.println();
        System.out.print("digite b: ");//solicitamos el valor de b
        b = sc.nextInt();//aplicamos por teclado el valor
        //condicional para deducir si estan en orden creciente o decreciente
        if(a<=b){
            System.out.println("orden creciente");
        }else{
            System.out.println("orden decresiente");
        }
        sc.close();
    }
}
