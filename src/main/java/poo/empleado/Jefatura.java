package poo.empleado;

import poo.interfacesClasesInternas.Jefes;

/**
 *
 * @author Pitagoras
 */

public class Jefatura extends EmpleadoGeneral implements Jefes {

    private double incentivo;

    public Jefatura(double incentivo, String nombre, String cargo, double sueldo, int año, int mes, int dia) {
        super(nombre, cargo, sueldo, año, mes, dia);
        this.incentivo = incentivo;
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }

    public double getIncentivo() {
        return incentivo;
    }

    /**
     *
     * @param sueldo
     */
    @Override
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /**
     *
     * @return
     */
    @Override
    public double getSueldo() {
        double sueldofinal;
        sueldofinal = getIncentivo() + super.getSueldo();
        return sueldofinal;
    }

    @Override
    public String toString() {
        return "Jefatura{" + "incentivo=" + incentivo + '}';
    }

    // metodo sobre escrito de la interfaz Jefes

    @Override
    public String Tdesiciones(String Tdesiciones) {
        return "Un miembro de la direccion ha tomado la decision de: " + Tdesiciones;

    }
}
