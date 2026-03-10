package ejercicios;

public class Usuarios {
    String username;
    int seguidores;
    public Usuarios (String username) {
        this.username = username;
        this.seguidores = 0; 
    }
    public void nuevoSeguidor() {
        this.seguidores = this.seguidores + 1; 
        System.out.println("¡Nuevo seguidor para " + this.username + "!");
    }
    public void mostrarPerfil() {
        System.out.println("Usuario: " + this.username + " | Seguidores: " + this.seguidores);
    }
  
}
