package ejercicios;

public class Main {
    public static void main(String[] args) {
        
        Libro l1 = new Libro("La bruja verde", "Arin Murphy", 256);
        Libro l2 = new Libro("Rojo,blanco y sangre azul", "Casey McQuiston", 496);

        
        l1.mostrarInfo();
        l2.mostrarInfo();
    }
    
}
