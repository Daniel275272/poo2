package semana4;

import java.util.Scanner;

public class clase4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rango1 = 0, rango2 = 0, rango3 = 0, rango4 = 0;
        System.out.println("cuantos alumnos: ");
        int cantidad = sc.nextInt();

        for(int i = 1;i <= cantidad ; i++){
            System.out.print("Digite el peso: ");
            int peso = sc.nextInt();
            if (peso<40){
                rango1++;
            }else{
                if(peso>=40 && peso < 50){
                   rango2++;
            }else{
                if (peso>=50 && peso < 60){
                    rango3++;
                }else{
                    rango4++;
            }
           }
        }
        }
        System.out.println("menos de 40 kg =>"+rango1);
        System.out.println("mas de 40 kg y menos de 50 kg =>"+rango2);
        System.out.println("mas de 50 kg y menos de 60 kg =>"+ rango3);
        System.out.println("mas o igual a 60 kg =>"+ rango4);
        sc.close();

    }
}
