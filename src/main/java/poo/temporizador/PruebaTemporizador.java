
package poo.temporizador;

import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/*
Temporizador 
Programa que desencadena una accion cada cierto tiempo 
la clase que implementaremos era timer
Fires one or more ActionEvents at specified intervals. 
An example use is an animation object that uses a Timer as the trigger for drawing its frames.
*/

public class PruebaTemporizador {

    public static void main(String[] args) {

        // DameLaHora oyente = new DameLaHora();
        ActionListener oyente = new DameLaHora();
        Timer mitemporizador = new Timer(5000, oyente);

        mitemporizador.start();
        JOptionPane.showMessageDialog(null, "  Pulsa Aceptar para detener ");
        System.exit(0);
    }

}
