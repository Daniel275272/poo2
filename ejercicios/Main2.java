package ejercicios;

public class Main2 {
     public static void main (String[] args) {
        
        Sensor sensorCocina = new Sensor("Cocina");  
        sensorCocina.verificarAlerta();
        sensorCocina.ajustar(47.3);
        sensorCocina.verificarAlerta();
    }
    
}
