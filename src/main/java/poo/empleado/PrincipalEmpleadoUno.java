
package poo.empleado;

import java.util.Arrays;

public class PrincipalEmpleadoUno {

    public static void main(String[] args) {

        Jefatura jefeRecursosHumanos = new Jefatura(2, "Patricia torres", "Enfermeria", 4, 2020, 1, 2);

        jefeRecursosHumanos.setIncentivo(9);
        System.out.println(jefeRecursosHumanos.getSueldo());

        System.out.println(" El sueldo es " + jefeRecursosHumanos.getSueldo());
        jefeRecursosHumanos.setSubeSueldo(34);

        System.out.println(jefeRecursosHumanos.getSueldo());

        EmpleadoGeneral[] empleados = new EmpleadoGeneral[6];

        empleados[0] = new EmpleadoGeneral("Santiago Vargas ", "Programador", 1500000, 2020, 1, 20);
        empleados[1] = new EmpleadoGeneral("Laura Stephania Diaz", "Profesora", 1100000, 2020, 8, 13);
        empleados[2] = new EmpleadoGeneral("Clara Patricia Acevedo Daza", "Enfermera", 2000000, 1978, 3, 19);
        empleados[3] = new EmpleadoGeneral("Antono Ferenandez ");
        empleados[4] = jefeRecursosHumanos;
        empleados[5] = new Jefatura(40, "Manuel Alejandro ", "Quimico Farmaceutico", 20, 2020, 2, 27);

        /*
         * aca tenemos un objeto arreglo llamado empleadosx de tamaño dos que es
         * instanciado de la clase EmpleadoGeneral
         * EmpleadoGeneral[] empleadosx = new EmpleadosGeneral[1]; su funcion es
         * almacenar objetos, en este caso el objeto empleado1 que instancian a la clase
         * EmpleadoGenaral
         * EmpleadoGeneral empleado1 = new EmpleadoGeneral("Pacha alexandra",
         * "Fisica Teorica", 3500000,2008,5,10);
         * ahora lo almaceno en mi arreglo
         * empleados[0]=empleado1;
         * en este caso las opciones de metodos para poder usar con este objeto en el
         * arreglo son todos los metodos de la calse EmpleadoGeneral que logicamente son
         * iguales
         * pues el objeto y el arreglo estan instanciados por esta clase
         */

        EmpleadoGeneral[] empleadosx = new EmpleadoGeneral[2];

        EmpleadoGeneral empleado2 = new EmpleadoGeneral("Pacha alexandra", "Fisica Teorica", 3500000, 2008, 5, 10);

        empleadosx[0] = empleado2;

        System.out.println(empleadosx[0].getNombre());

        /*
         * En este caso es importarte comprender que el objeto jefe_dos que es
         * instanciado de la clase Jefe y esta siendo almacenado en el arreglo
         * empleadosx[en la pocicion uno]
         * ( este arrreglo EmpleadoGeneral[] empleadosx = new EmpleadoGeneral[2]; es
         * instanciado
         * por la clase EmpleadoGeneral.)
         * 
         * esto quiere decir que solo podra instanciar los metodos, variables,
         * consatantes y utilizarlos de la clase EmpleadoGeneral en realidad si en
         * nuestro arreglo almacenamos
         * objetos que instancien de una clase diferente ha EmpleadoGeneral como en este
         * caso que instanciamos de la clase Jefe.
         * 
         * tendremos que realizar una fundicion Casting, solo si queremos desde nuestro
         * arreglo usar los metodos de la clse Jefe y no podremos directamente
         * pues a diferencia de nuestro objetto empleado2 que esta instanciado por la
         * misma clase que instancia el arreglo, nuestro objeto jefe_dos esta
         * instanciado
         * por la clase Jefatura y el arreglo por la clase Empleado General.
         * 
         * para poder usar los metodos desde el arreglo, los metodos propios de la clase
         * Jefatura tendremos que hacer una fundicion del lugar donde
         * esta almacenado nuestro objeto osea empleadosx [1].
         * 
         * Por ello tendremos que hacer una fundicion o casting
         * 
         * double xxx = 34.56;
         * int xxc=(int)xxx;
         */

        Jefatura jefe_dos = new Jefatura(20, "Canela spanky ", " Agente Secreto de la nacion rusa ", 8000000, 2013, 6,
                2);

        empleadosx[1] = jefe_dos;

        Jefatura jefeFinanzas = (Jefatura) empleadosx[1];

        jefeFinanzas.setIncentivo(23);

        /*
         * 
         * ~queria programar pero tenia que gritar sentia que hiba muy rapido casi a
         * punto de perder la fuerza para continuar escribiendo
         * ~estoy convencido que ahora todos podran serserserserserseras un
         * ´prograamaadooor entrena mi joven ppadawan volvere a tu
         * ~total fista del final el dia que realmente se detenga para mi la fiesta
         * 
         * 
         * 
         * ABSTRACT
         * los metodos que son declarados como abstract son metodos que conforme se
         * extiendan a otras clases podran seer sobre escritos si se define
         * un metodo abstract en una clase toda la clase sera abstracta
         * 
         * 
         */

        /*
         * Arrays
         * this class contains varius mathods for manipulating arrays (such as sorting
         * and searching)
         * entre sus metodos existe el metodo public static void sort(Object[] a)
         * sort the specified array of objects into ascending order, aording to the
         * naatural ordering
         * of its elements. All elements in the array must implement the comparable
         * interface
         * 
         * Ordena el arreglo de objetos
         */

        Arrays.sort(empleados);

        // Se usa la palabra reservada intanceof para determinar a que instancia
        // pertenece un objeto
        EmpleadoGeneral director_comercial = new Jefatura(12, "Julian Andres", "Constructor", 12100000, 12, 4, 2);
        Comparable ejemplo = new EmpleadoGeneral("jazz");

        if (director_comercial instanceof EmpleadoGeneral) {
            System.out.println("El objeto director comercial intancia a EmpleadoGeneral");
        }

        // INTERFAZ
        // llamamos al metodo que intancia la clase EmpleadoDos de la Interfaz Jefe

        System.out.println(jefeFinanzas.Tdesiciones("Despidir a Canela Spanky"));

        System.out.println(
                "El jefe: " + jefeFinanzas.getNombre() + "Tiene un bono de:" + jefeFinanzas.EstableceBono(200));

        System.out.println(empleados[2].getNombre() + " Tiene un bono de " + empleados[2].EstableceBono(30));

        // Sube el sueldo de los empleados almacenados en el arreglo de objetos
        // empleados
        for (EmpleadoGeneral e : empleados) {
            e.setSubeSueldo(5);
        }
        // Muestra el nombre, cargo, sueldo y dia de contratacion para los empleados
        // almacenados
        // en el arreglo de objetos empleados

        for (EmpleadoGeneral e : empleados) {

            System.out.println("\n" + "Nombre " + e.getNombre() + "\n" +
                    "Cargo " + e.getCargo() + "\n" +
                    "Sueldo " + e.getSueldo() + "\n" +
                    "Dia de contratacion " + e.getDiaContrato());

        }
    }
}
