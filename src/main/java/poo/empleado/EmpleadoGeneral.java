package poo.empleado;

import java.util.Date;
import java.util.GregorianCalendar;

import poo.interfacesClasesInternas.Trabajadores;

public class EmpleadoGeneral implements Comparable, Trabajadores {
    
    private String nombre;
    private String cargo;
    double sueldo;
    private Date diaContrato;
    
    public EmpleadoGeneral(String nombre, String cargo, double sueldo, int año, int mes, int dia){
        this.nombre = nombre;
        this.cargo=cargo;
        this.sueldo= sueldo;
        
        GregorianCalendar calendario = new GregorianCalendar(año,mes,dia-1);
        diaContrato = calendario.getTime();
    }
    
    public EmpleadoGeneral(String nombre){
        
        this(nombre,"Sin asignar",1000000,2020,01,14);
    }
    
    public void setNombre( String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public String getCargo(){
        return cargo;
    }
    
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    public double getSueldo(){
        return sueldo;
    }
    public void setSubeSueldo(double porcentaje){
        
        double aumento = (sueldo*porcentaje)/100;
        sueldo += aumento;
        setSueldo(sueldo);
    }
    
    public void setDiaContrato( Date diaContrato){
        this.diaContrato=diaContrato;
    }
    public Date getDiaContrato(){
        return diaContrato;
    }

    @Override
    public String toString() {
        return "EmpleadoGeneral{" + "nombre=" + nombre + ", cargo=" + cargo + ", sueldo=" + sueldo + ", diaContrato=" + diaContrato + '}';
    }

    
    //FUNDICION Y SOBRE ESCRITURA 
    @Override
    public int compareTo(Object miObjeto) {
        EmpleadoGeneral otroEmpleado = (EmpleadoGeneral) miObjeto;
        if(this.sueldo<otroEmpleado.sueldo){
            return -1;
        }
        if(this.sueldo>otroEmpleado.sueldo){
            return 1;
        }
        return 0;  
    } 

    @Override
    public double EstableceBono(double bonificacion) {
     double prima=200;        
     return Trabajadores.bonus_base+bonificacion+prima;
    }

    @Override
    public String Tdesiciones(String Tdesiciones) {
     return "Un miembro de la direccion a tomado la desicion de:  "+ Tdesiciones;
    }
}
