
package poo.temporizador;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class PruebaTemporizadorPrincipalDos {
    
    public static void main(String[] args) {   
        Reloj mireloj = new Reloj(2000,true);
        mireloj.enMarcha();
        JOptionPane.showMessageDialog(null," Pulsa aceptar para terminar ");
        System.exit(0);
        
    }
}
    class Reloj{
       
        private int  Intervalo;
        private boolean Sonido;
        
        public Reloj(int Intervalo,boolean Sonido){
           
            this.Intervalo= Intervalo;
            this.Sonido=Sonido;
        }
        public void  enMarcha(){
            
            ActionListener oyente = new DameLaHoraDos();
            Timer proceso = new Timer(Intervalo,oyente);
            proceso.start();
            
        }
        private class DameLaHoraDos implements ActionListener{
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
                Date Hora = new Date();
                
                System.out.println("Te pongo la hora cada dos segundos " +Hora);
                
                if(Sonido){
                      Toolkit.getDefaultToolkit().beep();  
                }
               
            }           
        } 
    }
     
   