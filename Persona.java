public class Persona {


    String nombre; 
    int edad; 
public Persona(String nombre, int edad) {
    this.nombre = nombre; 
    this.edad = edad; 
}

public void Mostrar () {
    System.out.println( "Nombre: " + nombre);
    System.err.println("Edad: " + edad);
}

public void correr () {
    System.out.println (nombre + "está corriendo");
}

public static void main(String[] args) {
    Persona  pablo = new Persona ("Pablo", 21);
    pablo.Mostrar ();
    pablo.correr ();
}
}
