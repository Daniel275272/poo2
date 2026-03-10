package ejercicios;

public class Main3 {
    public static void main(String[] args) {
        Usuarios user = new Usuarios("JavaCoder7");
        user.nuevoSeguidor();
        user.nuevoSeguidor();
        user.nuevoSeguidor();
        System.out.println("Total de seguidores: " + user.seguidores);
    }
}
