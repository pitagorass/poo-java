
package poo.empleadoEjemplo;

public class Empleado {

    private final String nombre;
    private String seccion;
    private final int identificacion;

    /*
     * Los metodos estaticos
     * No actuan sobre objetos
     * No acceden campos de ejemplar(Variables/constantes declaradas en la clase),
     * a menos que sean tambien statics
     * Para llamarlos se utiliza el nombre_clase.nombre_metodo_variable
     */
    private static int identificacionSiguiente = 1;

    public Empleado(String nombre) {

        this.nombre = nombre;
        seccion = "Administracion";
        identificacion = identificacionSiguiente;
        identificacionSiguiente++;
    }

    public void SetCambiaSeccion(String seccion) {
        this.seccion = seccion;

    }

    public String getDevielveDatos() {
        return "El nombre es " + nombre + " la seccion es " + seccion + " y su identificacione es " + identificacion;
    }

    public static String getIdentificacionSiguiente() {
        return "La identificacion siguiente es " + identificacionSiguiente;
    }

}
