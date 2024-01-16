package Logica;
import Logica.Alumno;

public class POO {

    public static void main(String[] args) {
        
        Alumno alumno1 = new Alumno(1, "Pepe", "Sech");
        Alumno alumno2 = new Alumno();
        
        System.out.println("ID: " + alumno1.getId() + " Nombre: " + alumno1.getNombre() + " Apellido: " + alumno1.getApellido());
    
        alumno2.setId(4);
        alumno2.setNombre("Riv");
        alumno2.setApellido("apellido");
        
        System.out.println("ID: " + alumno2.getId() + " Nombre: " + alumno2.getNombre() + " Apellido: " + alumno2.getApellido());
    }
}
