package co.edu.uniquindio.poo;

public class App {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Crear Bibliotecarios
        System.out.println("--- Creando Bibliotecarios ---");
        biblioteca.crearBibliotecario("Laura Ramírez", "1010101010", "555-1234", "laura@correo.com", 2000.0);
        biblioteca.crearBibliotecario("Carlos Pérez", "2020202020", "555-5678", "carlos@correo.com", 1800.0);
        
        // Crear Estudiantes
        System.out.println("--- Creando Estudiantes ---");
        biblioteca.crearEstudiante("Ana García", "3030303030", "555-6789", "ana@correo.com");
        biblioteca.crearEstudiante("Luis Martínez", "4040404040", "555-7890", "luis@correo.com");

        // Crear Libros
        System.out.println("--- Creando Libros ---");
        biblioteca.crearLibro("L001", "Programación en Java", 5);
        biblioteca.crearLibro("L002", "Estructuras de Datos", 3);

        // Realizar Préstamos
        System.out.println("--- Realizando Préstamos ---");
        Estudiante estudiante = biblioteca.estudiantes.get(0);  // Ana García
        Bibliotecario bibliotecario = biblioteca.bibliotecarios.get(0);  // Laura Ramírez
        Libro libro = biblioteca.libros.get(0);  // Programación en Java

        biblioteca.crearPrestamo(estudiante, bibliotecario, libro);

        // Consultar la cantidad de préstamos en los que está incluido un libro
        System.out.println("--- Consultar Préstamos de Libros ---");
        biblioteca.consultarPrestamosPorLibro("Programación en Java");

        // Realizar otro préstamo
        biblioteca.crearPrestamo(estudiante, bibliotecario, libro);

        // Consultar de nuevo para ver el aumento
        biblioteca.consultarPrestamosPorLibro("Programación en Java");

        // Mostrar la cantidad de préstamos realizados por un bibliotecario
        System.out.println("--- Prestamos realizados por Bibliotecario ---");
        System.out.println("Bibliotecario " + bibliotecario.getNombre() + " ha realizado " + bibliotecario.getPrestamosRealizados() + " préstamos.");

        // Consultar préstamos realizados por otro libro
        biblioteca.consultarPrestamosPorLibro("Estructuras de Datos");
    }
}
