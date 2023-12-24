
package poo.empleado;

public final  class Director extends Jefatura {
    
    /*
    Esta clase si extiende hacia Jefatura podra
    usar los metodos extendidos desde Empleados
    general que es donde se instacia Jefatura
    si por alguna razon queremos romper la cadena de herencia
    podemos usar la palabra reservada final en este ejemplo ninguna otra 
    clase podra instanciar los metodos y variables de la clase 
    Director. Esto tambien se aplica a los metos en ocaciones como en este 
    ejemplo tendremos la ventaja que el interprete de java permita sobre escrbibr los 
    metodos de forma que podre tener en clases diferentes dos metodos llamados de la 
    misma forma pero si queremos que esto no ocurra recurriremos a la palabra reservada 
    final*/

    /**
     *
     * @param incentivo
     * @param nombre
     * @param cargo
     * @param sueldo
     * @param año
     * @param mes
     * @param dia
     */


    public Director(double incentivo, String nombre, String cargo, double sueldo, int año, int mes, int dia) {
        super(incentivo, nombre, cargo, sueldo, año, mes, dia);
    }
    
    
    /*
    Si extendemos nuestras clases y miramos su nive de especialidad nos daremos cuenta que la clase que mas metodos extienda 
    es por ende la clase mas especializada por esto la clase que menos metodos extiende es una clase mas generica como la clase objeto
    */

}
