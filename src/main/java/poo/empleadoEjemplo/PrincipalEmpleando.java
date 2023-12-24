
package poo.empleadoEjemplo;

public class PrincipalEmpleando {

    public static void main(String[] args) {

        Empleado Empleado1 = new Empleado("Laura");
        Empleado Empleado2 = new Empleado("Santiago");

        Empleado1.SetCambiaSeccion("Recursos Humanos");

        System.out.println(Empleado1.getDevielveDatos());
        System.out.println(Empleado2.getDevielveDatos());
        System.out.println(Empleado.getIdentificacionSiguiente());

    }
}
