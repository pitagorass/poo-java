
package poo.interfacesClasesInternas;


/*
Las interfaces como en este caso tambien pueden heredar extenderse a otras interfaces
En este caso todas las clases que implementen esta interfaz

Esto tambien quiere decir que la clase que implemente la interfaz Trabajadores 
tendra no solo el metodo EstableceBono si no tambien Tdesiciones  */ 
public interface Trabajadores extends Jefes {
    
    
    //por convencion se sobreentiende es una constante y que ademas es public y abstracta no se coloca 
    /*public static final*/ double bonus_base=1500;
    
    //por convencion el public abstrac de los metodos de una interfaz se sobreentiende asi que no se coloca
    /*public abstract*/ double EstableceBono(double bonificacion );
    
    
}
