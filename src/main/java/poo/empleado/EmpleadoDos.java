
package poo.empleado;

import java.util.Date;
import java.util.GregorianCalendar;

public class EmpleadoDos extends Persona {

    private double sueldo;
    private static int IdeSiguiente;
    private final int id;
    private Date altaContrato;

    public EmpleadoDos(String nombre, double sueldo, int año, int mes, int dia) {
        super(nombre);
        this.sueldo = sueldo;

        GregorianCalendar calendario = new GregorianCalendar(año, mes - 1, dia);
        Date altContrato = calendario.getTime();
        IdeSiguiente = 0;
        ++IdeSiguiente;
        id = IdeSiguiente;

    }

    @Override
    public String GetDescripcion() {
        return "Este Empleado tiene un numero de identificacion " + id + " Un sueldo de " + sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Date getFechaContrato() {
        return altaContrato;
    }

    public double setSubeSueldo(double porcentaje) {
        double aumento = sueldo * porcentaje;
        sueldo += aumento;
        return sueldo;
    }

}
