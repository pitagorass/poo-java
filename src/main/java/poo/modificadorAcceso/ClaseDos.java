
package poo.modificadorAcceso;

import poo.modificadorAccesoUno.ClaseTres;


public class ClaseDos {
  
    public static void main(String [] args){
        
        ClaseUno objetoAceso=new  ClaseUno();
        objetoAceso.variable_dos=3;
        objetoAceso.variable_uno=2;
        objetoAceso.metodo();
        
        ClaseTres objetoAcesoUno =new ClaseTres();
        System.out.println(objetoAcesoUno.metodoSaludo());
        
        
        /*
        En este punto con los modificadores de acceso por defecto que son los que tienen los metodos 
        y variables en la claseUno
        No podemos con el objetoAcesoUno que instncia de la ClaseTres y que esta en un paquete diferente 
        llamar sus metodos ni sus variables pues no lo permite para subclases en paquetes diferentes 
        pues claseTres hereda de la ClaseUno estos metodos 
        
        En cambio si miramos ahora podremos ver que con el modificador protected podemos acceder a una variable y un metodo 
        */
        System.out.println(objetoAcesoUno.metodoSaludo());
        
        /*
        Clase object 
        se le llama tambien la clase cosmica y es la clase que esta en la cuspide de la jerarquita 
        todas las clases heredan de object apenas creamos una clase automaticamente esta heredara de object
        y es por este motivo que cuando nosotros utilizamos las instancias de cualquier tipo como por ejemplo 
        objetoAcesoUno. no salen los metodos que son de la calse object






*/
        
        
    }
}
