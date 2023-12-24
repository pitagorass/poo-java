
package poo.interfacesClasesInternas;

/*
Interfaces 
Conjunto de directrices que deben cumplir las clases

Tenemos las clases 
Clase_EjemploUno  
Interfaz_Uno


Clase_EjemploUno extend Interfaz_Uno
implica que si la interfaz en su interiro tienen establecidas directrices(metodos)
que tendran que implementar o sobre escribir por la clase que hera esa interfaz por lo cual 
si una interfaz por ejemplo tiene definidas en su interior dos metodos
estamos obligados que la clase que implementa la interfaz tenga tambien incluidos los metodos 

En definitiva las interfaces lo que hacen es establecer los comportamientos a
cumplir por las clases que implementan esas interfaces y esos comportamientos 
viene determinados por los metodos que nos obligan a incluir en las clases que implementa la interfaz 

Caracteristicas 
lo primero que tenemos que saber interfaces al igual que en las calses las tenemos predefinidas  
en la API de java disponibles para poder usarlas.

Las Caracteriticas principales  son que todas las interfaces solo tienen metodos abstractos 
y constantes unicamente.
las interfaces como las clases crean un fichero.class, no se pueden instanciar no se usa el new,
todos los metodos son public y abstract, aunque en general si no se coloca el modificador de acceso
y el abstract el propio entorno de desarrollo lo coloca por defecto 

en java a diferencia de otros lengueajes de programacion no se admite la herencia multilple no se puede extender a mas de una clase 
y para solventar este problema java tiene las interfaces 

podemos tener una clse que implementa varias interfaces suponfamos que dos si la interfaz uno tiene los metodos saludar(),comer() que seran abstractos
la clase tendra que sobre escribir esos metodos.

ClaseJefatura extends Empleado implemaents interfazUno. interfazDos 


Tengo dos clases 
ClaseEmpleado 
CaseJefatura 
esta ultima extiende de empleado 

ClaeEmpleado directorComercial = new ClaseJefatura("Santiago",2500000,2011,02,13);

Tenemos una clase y una interfaz 
ClaseEmpleado
InterfazComparable

las clases no pueden extender heredar de las interfaces pero si se pueden implementar a la hora de crear objetos
instanciar esto esta prohibido 

InterfazComparable ejemple = new InterfazComparable(); //NO SE PUEDEEEEE


InterfazComparable ejemple = new ClaseEmpleado("Antonio "12222,12,12,21); //Esto encambio si se puede 


*/

public interface Jefes {

    public abstract  String Tdesiciones(String Tdesiciones);
    
}
