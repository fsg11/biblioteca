

public class Estudiante extends Persona {
    private int prestamos;

    public Estudiante(String nombre, String cedula, String telefono, String correo) {
        super(nombre, cedula, telefono, correo);
        this.prestamos = 0;
    }

   
    public int getPrestamos() {
        return prestamos;
    }


    public void incrementarPrestamos() {
        prestamos++;
    }
}
