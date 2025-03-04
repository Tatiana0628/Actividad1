import java.util.Scanner;

class Libro {
    private String titulo;
    private String autor;
    private int numeroEjemplares;
    private int numeroprestados;

    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.numeroEjemplares = 0;
        this.numeroprestados = 0;
    }

    public Libro(String titulo, String autor, int numeroEjemplares, int numeroprestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroprestados = numeroprestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public int getNumEjemplaresPrestados() {
        return numeroprestados;
    }

    public void setNumEjemplaresPrestados(int numeroprestados) {
        this.numeroprestados = numeroprestados;
    }

    public boolean prestar() {
        if (numeroprestados < numeroEjemplares) {
            numeroprestados++;
            return true;
        }
        return false;
    }

    public boolean devolver() {
        if (numeroprestados > 0) {
            numeroprestados--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + "\nAutor: " + autor + "\nEjemplares: " + numeroEjemplares + "\nEjemplares Prestados: " + numeroprestados;
    }
}

public class Biblioteca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Libro libro1 = new Libro("Death Note", "Tsugumi Ohba", 5, 2);
        Libro libro2 = new Libro();

        System.out.println("Ingrese el título del libro2:");
        libro2.setTitulo(scanner.nextLine());

        System.out.println("Ingrese el autor del libro2:");
        libro2.setAutor(scanner.nextLine());

        System.out.println("Ingrese el número de ejemplares:");
        libro2.setNumeroEjemplares(scanner.nextInt());

        System.out.println("Ingrese el número de ejemplares prestados:");
        libro2.setNumEjemplaresPrestados(scanner.nextInt());

        System.out.println("\nEstado inicial de los libros:");
        System.out.println(libro1);
        System.out.println(libro2);

        System.out.println("\nRealizando un préstamo en libro1...");
        if (libro1.prestar()) {
            System.out.println("Préstamo realizado con éxito.");
        } else {
            System.out.println("No hay ejemplares disponibles para préstamo.");
        }

        System.out.println("\nRealizando una devolución en libro1...");
        if (libro1.devolver()) {
            System.out.println("Devolución realizada con éxito.");
        } else {
            System.out.println("No hay ejemplares prestados para devolver.");
        }

        System.out.println("\nEstado final de los libros:");
        System.out.println(libro1);
        System.out.println(libro2);

        scanner.close();
    }
}

