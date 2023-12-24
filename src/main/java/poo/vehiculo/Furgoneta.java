
package poo.vehiculo;

public class Furgoneta extends Carro {

    private int capacidadCarga;
    private int plazasExtra;

    public Furgoneta(int capacidadExtra, int plazasCarga) {
        super(); // llamar al constructor de la superclase o clase padre
        this.capacidadCarga = capacidadCarga;
        this.plazasExtra = plazasExtra;

    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    @Override
    public String toString() {
        return "furgoneta{" + super.toString() + "capacidadCarga=" + capacidadCarga + ", plazasExtra=" + plazasExtra
                + '}';
    }

}
