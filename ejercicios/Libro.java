package ejercicios;

public class Libro {
    String titulo;
    String autor;
    int paginas;
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    public void mostrarInfo() {
        System.out.println("Libro: " + this.titulo + ", escrito por " + this.autor);
    }

    
}
