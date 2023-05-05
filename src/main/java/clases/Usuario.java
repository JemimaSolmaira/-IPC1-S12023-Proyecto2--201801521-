
package clases;

import java.io.Serializable;


public class Usuario implements Serializable {
    private static final long serialVersionUID = 6529685098267757690L;
    protected String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}