
package poo.modificadorAcceso;

public class ClaseUno {
    
   /*
    Modificadores de acceso por defecto
    en este caso creamos un objeto que se intancia a la claseTres que a su ves se extiende a la claseUno
    La claseTres esta en un paquete llamado ModificadorAcesoUno la subclase de la cual hereda es la claseUno
    que esta en el paquete ModificadorAcesso
    La claseUno  tiene unas variables y metodos estos  tienen el modificador de acceso por defecto 
    que no permite que se instancie su contenido, si este contenido es llamdo desde una subclases en un paquete diferente.
    */
    
    int variable_uno = 5;
    int variable_dos = 7;
    
    String metodo(){
        return "El valor de mi variable uno es "+variable_uno;
    }
    
   /*
    Modificador de acceso protected 
    este modificados de acceso 
    */
    
    protected int variable_tres =6;
    
    protected String metodoSaludo(){
        return "Cuenta con migo hijo de perra";
    }
    
}
