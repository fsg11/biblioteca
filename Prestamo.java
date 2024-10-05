

public class Prestamo {
    private Estudiante estudiante;
    private Bibliotecario bibliotecario;

    public Prestamo(Estudiante estudiante, Bibliotecario bibliotecario) {
        this.estudiante = estudiante;
        this.bibliotecario = bibliotecario;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }
}
