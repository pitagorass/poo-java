
package poo.tiposEnumerados;

import java.util.*;
/*
Tipos enumeradosdirectamente relacionado con la clase ENUM que nos permite crear tipos enumerados
muchas veces surge la necesidad de almacenaar en una variable una serie de valores 
pero no queremos que en un futuro se puedan que almacenar mas valores o modificar 
los valores existentes.
Imagina que necesitamos almacenar en una variable te tipo String tallas de ropa 
que pude ser Grande ExtraGrande Mediana Pequeña y podriamos almacenar azul pero eso
no es lo que queremos explicitamente solo necesitamos almacenar esos valores ningun otro 

El tipo enumerado no es mas que una variable OBJETO de tipo enum que nos permite almacenar un grupo de valores
y solo esos valores, no puede estar declarado dentro del main 


*/

public class usoTallas {
    
    //enum Talla{SMALL,MEDIUM,BIG,VERY_BIG};
    
    
      enum Talla{
          
          SMALL("S"),MEDIUM("M"),BIG("L"),VERY_BIG("XL");
        
          private String abreviatura;
          
          private Talla(String abreviatura){
              this.abreviatura=abreviatura;
          }
          
          public String getAbreviatura(){
              return abreviatura;
          }
      }
    
    public static void main(String[] args ){
        
        //Talla s = Talla.SMALL;
        //Talla m = Talla.MEDIUM;
        //Talla l = Talla.BIG;
        //Talla xl = Talla.VERY_BIG;
        
        Scanner entrada =  new Scanner(System.in);
        System.out.println("Escriba una talla: SMALL, MEDIUM,BIG,VERY_BIG");
        String entrada_datos = entrada.next().toUpperCase();
        
        //toUperCase() este metodo pasa a mauscula olo que el usuario pase en consola
        
        Talla la_talla = Enum.valueOf(Talla.class, entrada_datos);
        //ValueOF() este metodo statico  devuelve el nombre de la constante
        //enumerada a la que pertence el texto introducido si el usuario almacena SMALL 
        //lo que hace valueOF() detecta a que tipo pertenece pues el texto String que 
        //introdujo el usuario en consola y que esta almacenado en entrada
        
        System.out.println("Talla = " +la_talla);
        System.out.println("Su abreviatura es = "+la_talla.getAbreviatura());
        
        
        
                
        
    }
    
}
