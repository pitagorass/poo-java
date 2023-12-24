
package poo.vehiculo;

/* 
 * Esta seria nuestra clase plataforma en este caso le pondremos 
 * el nombre de carro.
 * Es esta clse estaran definidas las caracterisiticas comunes a 
 * todos los carros.
 */
public class Carro {
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso;
    String color;
    int pesoTotal;
    int plataforma;
    boolean asientosCuero;
    boolean climatizador;

    // Un metodo contructor se encarga de dar un estado inicial a nuestro objeto.
    public Carro() {
        ruedas = 4;
        largo = 7;
        ancho = 23;
        motor = 34;
        peso = 34;
        color = "Rojo";
        pesoTotal = 300;
        asientosCuero = true;
        climatizador = false;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPesoTotal() {
        return pesoTotal;
    }

    public void setPesoTotal(int pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    public boolean isAsientosCarro() {
        return asientosCuero;
    }

    public void setAsientosCarro(String asientosCarro) {

        this.asientosCuero = ("si".equals(asientosCarro)) || ("SI".equals(asientosCarro))
                || ("Si".equals(asientosCarro)) || ("sI".equals(asientosCarro));
    }

    public boolean isClimatizador() {
        return climatizador;
    }

    public void setClimatizador(String climatizador) {

        this.climatizador = ("si".equals(climatizador)) || ("SI".equals(climatizador)) || ("Si".equals(climatizador))
                || ("sI".equals(climatizador));
    }

    @Override
    public String toString() {
        return "carro{" + "ruedas=" + ruedas + ", largo=" + largo + ", ancho=" + ancho + ", motor=" + motor + ", peso="
                + peso + ", color=" + color + ", peso_total=" + pesoTotal + ", plataforma=" + plataforma
                + ", asientos cuero=" + asientosCuero + ", climatizador=" + climatizador + '}';
    }

    public String dimePeso() {

        int pesoCarroceria = 300;
        this.pesoTotal = plataforma + pesoCarroceria;

        if (asientosCuero) {
            pesoTotal = plataforma + 50;
        }
        if (climatizador) {
            pesoTotal += 20;
        }

        return "El peso del carroes " + pesoTotal;

    }

    public int precioCarro() {

        int precioFinal = 1000;

        if (asientosCuero) {
            precioFinal += 2000;
        }

        if (climatizador) {
            precioFinal += 1500;
        }

        return precioFinal;

    }

}
