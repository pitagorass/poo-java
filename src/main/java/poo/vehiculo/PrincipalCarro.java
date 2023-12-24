package poo.vehiculo;

public class PrincipalCarro {

    public static void main(String[] args) {

        Carro micarro1 = new Carro(); // Instanciar una clase. Ejemplar De Clase.

        /*
         * micarro1.ruedas=3
         * Esto no esta permitido
         * Es una incongruencia estamos cometiendo lo que se llama una
         * violacion de datos.
         * La incongruencia consiste en que en la clase coche en nuestro metodo
         * contructor le estamos dando un estado inicial a nuestra clase es decir las
         * caracteristicas comunes
         * las que van a compartir todos los objetos pertenecientes a esta clase
         * una de esas caracterisiticas es que tiene que tener 4 ruedas.
         * No tiene sentido que desde nuestro contructor le demos un valor a nuestro
         * numero de ruedas
         * Desde una clase diferente como es PrincipalCarro.java pueda decir que un
         * carro tiene diferente numero de ruedas
         * para queee entonces el cotructor.
         * Tenemos claro que existen datos que tenemos que encapsular es decir consiste
         * en que las ruedas solo se pueda modificar
         * desde la propia clase.
         * 
         * Igual que solo podemos adelantar o atrasar una cacion desde la Clase 1 en la
         * imagen del documento. No desde otra clase.
         * Esa es la encapsulacion
         * 
         */
        micarro1.setColor("Morado");

        Furgoneta mifurgoneta1 = new Furgoneta(7, 580);
        mifurgoneta1.setColor("Rojo");
        mifurgoneta1.setAsientosCarro("Si");
        mifurgoneta1.setClimatizador("no");

        System.out.println(micarro1.toString());
        System.out.println(mifurgoneta1.toString());

    }
}
