/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.awt.Image;
import java.io.Serializable;
import javax.swing.ImageIcon;


public class NodoIm implements Serializable {

    private Imagenes imagen;
    private NodoIm siguiente;
    private NodoIm anterior;
    
    public NodoIm(Imagenes imagen) {
        this.imagen = imagen;
        this.siguiente = null;
        this.anterior = null;
    }
    
    // Getters y setters
    
    public Imagenes getDato() {
        return imagen;
    }
    
    public void setDato(Imagenes dato) {
        this.imagen = dato;
    }
    
    public NodoIm getSiguiente() {
        return siguiente;
    }
    
    public void setSiguiente(NodoIm siguiente) {
        this.siguiente = siguiente;
    }
    
    public NodoIm getAnterior() {
        return anterior;
    }
    
    public void setAnterior(NodoIm anterior) {
        this.anterior = anterior;
    }
}
