import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List<Bibliotecario> bibliotecarios = new ArrayList<>();
    List<Estudiante> estudiantes = new ArrayList<>();
    List<Libro> libros = new ArrayList<>();
    List<Prestamo> prestamos = new ArrayList<>();

    // Crear Bibliotecario
    public void crearBibliotecario(String nombre, String cedula, String telefono, String correo, double salario) {
        Bibliotecario b = new Bibliotecario(nombre, cedula, telefono, correo, salario);
        bibliotecarios.add(b);
    }

    public void crearEstudiante(String nombre, String cedula, String telefono, String correo) {
        Estudiante e = new Estudiante(nombre, cedula, telefono, correo);
        estudiantes.add(e);
    }

    public void crearLibro(String codigo, String titulo, int unidadesDisponibles) {
        Libro l = new Libro(codigo, titulo, unidadesDisponibles);
        libros.add(l);
    }

    public void crearPrestamo(Estudiante estudiante, Bibliotecario bibliotecario, Libro libro) {
        if (libro.prestar()) {
            Prestamo p = new Prestamo(estudiante, bibliotecario);
            estudiante.incrementarPrestamos();
            bibliotecario.incrementarPrestamos();
            prestamos.add(p);
            System.out.println("Préstamo exitoso.");
        } else {
            System.out.println("No hay unidades disponibles de este libro.");
        }
    }

    public void consultarPrestamosPorLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("El libro '" + titulo + "' está incluido en " + libro.getPrestamosIncluidos() + " préstamo(s).");
                return;
            }
        }
        System.out.println("Libro no encontrado.");
    }
}
