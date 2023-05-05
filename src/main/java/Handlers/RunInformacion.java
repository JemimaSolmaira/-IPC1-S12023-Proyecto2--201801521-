
package Handlers;

import javax.swing.JTextArea;


public class RunInformacion implements Runnable {

    JTextArea texto;
    String nombre;
    String dato;

    public RunInformacion(JTextArea texto, String nombre, String dato) {
        this.texto = texto;
        this.nombre = nombre;
        this.dato = dato;
    }

    
 
    @Override
    public void run() {
       texto.append(nombre+dato+"\n");  
    }
    
}
