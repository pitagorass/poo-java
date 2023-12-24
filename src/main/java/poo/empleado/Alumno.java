
package poo.empleado;

public class Alumno extends Persona {

    private final String carrera;

    public Alumno(String carrera, String nombre) {
        super(nombre);
        this.carrera = carrera;
    }

    @Override
    public String GetDescripcion() {

        return "su carrera es " + carrera + "El nombre de nuesto alumno es " + getNombre();
    }

}
