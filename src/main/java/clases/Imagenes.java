
package clases;

import java.io.File;
import java.io.Serializable;
import javax.swing.ImageIcon;


public class Imagenes implements Serializable {
     File imagen;
     String Nombre;

    public Imagenes(File imagen, String Nombre) {
        this.imagen = imagen;
        this.Nombre = Nombre;
    }

   

    public File getImagen() {
        return imagen;
    }

    public void setImagen(File imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
    
}
