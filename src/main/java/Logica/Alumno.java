package Logica;

public class Alumno {
    
    int id;
    String nombre;
    String apellido;

    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void mostrarNombre(){
        System.out.println("Hola se decir mi nombre");
    }
    
    public void saberAprobado(double calificacion){
        if(calificacion >= 7){
            System.out.println("Aprobé");
        } else {
            System.out.println("No aprobé");
        }
    }
    
}
