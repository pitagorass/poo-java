
package poo.temporizador;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class DameLaHora implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        Date hora = new Date();
        System.out.println("Te pongo la hora cada 5 segundos " + hora);
        /*
         * Para emitir un sonido usamos las clase toolkit
         * Es el puente entre el Sistema operativo los recursos, y nuestro programas en
         * java desde ella podemos acceder entre otros a el brillo
         * y sonidos del sistema por nombre algunos.
         */
        Toolkit.getDefaultToolkit().beep();

    }
}
