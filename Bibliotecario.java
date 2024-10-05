

public class Bibliotecario extends Persona {
    private double salario;
    private int prestamosRealizados;

    public Bibliotecario(String nombre, String cedula, String telefono, String correo, double salario) {
        super(nombre, cedula, telefono, correo);
        this.salario = salario;
        this.prestamosRealizados = 0;
    }

    // Getters
    public double getSalario() {
        return salario;
    }

    public int getPrestamosRealizados() {
        return prestamosRealizados;
    }

    // Setters
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void incrementarPrestamos() {
        prestamosRealizados++;
    }
}
