
package poo.empleado;

public class UsoPersona {

    /*
     * 
     * Modificadores de acceso
     * 
     * modificador clase package subclase todos
     * public si si si si
     * protected si si si no
     * private si no no no
     * por defecto si si no no
     * 
     */

    public static void main(String[] args) {

        Persona[] lasPersonas = new Persona[2];

        lasPersonas[0] = new EmpleadoDos("Laura Sthepania Dias Torres", 1450000, 2012, 11, 2);

        lasPersonas[1] = new Alumno("Economista", "Raul Stiven Ramirez Luna");

        /*
         * Esta parte no es necesaria pues el entorno de desarrollo comprende a que
         * clase se refiere para acceder a la informacion
         * en el bucle for cuando hace el llamado atravres de la variable p. al metodo
         * abstracto getDescripcion();
         * 
         * 
         */
        EmpleadoDos fundir = (EmpleadoDos) lasPersonas[0];

        System.out.println(lasPersonas[0].GetDescripcion());

        System.out.println(fundir.GetDescripcion());

        for (Persona p : lasPersonas) {

            System.out.println(p.getNombre() + p.GetDescripcion());
        }
    }
}
