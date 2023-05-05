
package clases;

import java.io.Serializable;


public class Nodo implements Serializable{
     Usuario usuario;
     Nodo Siguente;
     
    
     public Usuario getUsuario() {
        return usuario;
    } 
    
    public void setDato(Usuario nuevo) {
        this.usuario = nuevo;
    }
    
}
