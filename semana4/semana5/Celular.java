package semana4.semana5;

public class Celular {
    
    String marca;
    String modelo;
    int bateria =100;

    public void llamar(String numero) {
        System.out.println("llamada al "+ numero +"....");
        this.bateria -=5; 
        
    }
}
