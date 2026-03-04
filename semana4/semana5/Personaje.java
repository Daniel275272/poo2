package semana4.semana5;

public class Personaje {
    String nombre;
    int nivel;
    // Constructor que obliga a dar un nombre al crear el
    public Personaje(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel; // Todos empiezan en nivel 1 por defecto
    }
    public void mostrarInfo() {
        System.out.println("Heroe: " + nombre + " | Nivel: " + nivel);
    }
}
