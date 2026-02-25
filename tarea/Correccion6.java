import java.util.Scanner;

public class Correccion6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("cuantos alumnos: ");
        int cantidad = sc.nextInt();

        for(int i = 1;i <= cantidad ; i++){
            System.out.print("Digite el peso: ");
            int peso = sc.nextInt();
            if (peso<40){
                System.out.println("menos de 40 kg");
            }else{
                if(peso>=40 && peso < 50){
                    System.out.println("mas de 40 kg y menos de 50 kg");
            }else{
                if (peso>=50 && peso < 60){
                    System.out.println("mas de 50 kg y menos de 60 kg");
                }else{
                    System.out.println("mas o igual a 60 kg");
            }
           }
        }
        }
        
        sc.close();
    }
}
