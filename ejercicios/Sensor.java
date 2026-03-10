package ejercicios;

public class Sensor {
    double temperatura;
    String ubicacion;
    public Sensor(String ubicacion) {
        this.ubicacion = ubicacion;
        this.temperatura = 25.0; 
    }
    public void ajustar(double nuevaTemp) {
        this.temperatura = nuevaTemp;
        System.out.println("Temperatura en " + this.ubicacion + " ajustada a " + this.temperatura + "°C");
    }
    public void verificarAlerta() {
        if (this.temperatura > 45.0) {
            System.out.println("¡ALERTA en " + this.ubicacion + "!");
        } else {
            System.out.println("Temperatura normal en " + this.ubicacion + ".");
        }
    }
    
}
