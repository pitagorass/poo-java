
package poo.interfacesClasesInternas;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/*
Es una clase dentro de un metodo 
¿cuando se utiliza y por que ?
*Son utiles cuando se va a utilizar 
una vez. El objetivo es simplificar 
aun mas el codigo.
*Su ambito queda estringido al metodo 
donde son declaradoas.
¿ventajas?
*Estan muy "encapsuladas", Ni siquiera la clase
a la que pertencen puede aceder a ella 
Tan solo puede acceder a ella el metodo
donde estan declaradas.

Class Clase_externa{
  public void  metodo(){
     class Clase_Interna_Local{
               codigo clase interna;
     }
       codigo del metodo<;
*/
public class ClaseInternaLocal {

  public static void main(String[] args) {

    Relog comienza = new Relog();
    comienza.marcha(2000, true);
    JOptionPane.showMessageDialog(null, " Tiens que darle en aceptar para detenerlo");
    System.exit(0);
  }
}

class Relog {

  public void marcha(int intervalo, final boolean sonido) {
    // Las calses internas locales no deben llevar modificador de acceso
    class DameLaHorax implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent e) {
        Date hora = new Date();
        System.out.println("Te pongo la hora cada 3 segundos" + hora);
        if (sonido) {
          Toolkit.getDefaultToolkit().beep();
        }
      }
    }
    ActionListener xxx = new DameLaHorax();
    Timer mitemporizador = new Timer(intervalo, xxx);
    mitemporizador.start();
  }
}
