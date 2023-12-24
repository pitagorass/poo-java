
package poo.temporizador;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizadorPrincipal {

    public static void main(String[] args) {

        Hora horalocal = new Hora();
        Timer mitiempo = new Timer(3000, horalocal);

        mitiempo.start();
        JOptionPane.showMessageDialog(null, " Haz click en aceptar para detenerme ");
        System.exit(0);

    }

}

class Hora implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        Date horaLocal = new Date();
        System.out.println("Te pongo la hora cada 6 segundos " + horaLocal);
        Toolkit.getDefaultToolkit().beep();

    }
}
