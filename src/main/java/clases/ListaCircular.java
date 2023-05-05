
package clases;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;


public class ListaCircular extends EstructuraDeDatos{
    
    private NodoIm primero;
    private NodoIm ultimo;
    private int size;
    
    public ListaCircular() {
        this.primero = null;
        this.ultimo = null;
    }
    
    public boolean estaVacia() {
        return primero == null;
    }
    
//    public void addinicio(Image dato) {
//        NodoIm nuevo = new NodoIm(dato);
//        if (estaVacia()) {
//            primero = nuevo;
//            ultimo = nuevo;
//            primero.setAnterior(ultimo);
//            ultimo.setSiguiente(primero);
//        } else {
//            nuevo.setSiguiente(primero);
//            primero.setAnterior(nuevo);
//            primero = nuevo;
//            primero.setAnterior(ultimo);
//            ultimo.setSiguiente(primero);
//        }
//    }
//    
//    public void addfinal(Image dato) {
//        NodoIm nuevo = new NodoIm(dato);
//        if (estaVacia()) {
//            primero = nuevo;
//            ultimo = nuevo;
//            primero.setAnterior(ultimo);
//            ultimo.setSiguiente(primero);
//        } else {
//            ultimo.setSiguiente(nuevo);
//            nuevo.setAnterior(ultimo);
//            ultimo = nuevo;
//            ultimo.setSiguiente(primero);
//            primero.setAnterior(ultimo);
//        }
//    }
    
    public void eliminarinicio() {
        if (!estaVacia()) {
            if (primero == ultimo) {
                primero = null;
                ultimo = null;
            } else {
                primero = primero.getSiguiente();
                primero.setAnterior(ultimo);
                ultimo.setSiguiente(primero);
            }
        }
    }
    
    public void eliminarfinal() {
        if (!estaVacia()) {
            if (primero == ultimo) {
                primero = null;
                ultimo = null;
            } else {
                ultimo = ultimo.getAnterior();
                ultimo.setSiguiente(primero);
                primero.setAnterior(ultimo);
            }
        }
    }
    
    public NodoIm buscarDato(File datoBuscado) {
    if (!estaVacia()) {
        NodoIm actual = primero;
        do {
            if (actual.getDato().imagen.equals(datoBuscado)) {
                return actual;
            }
            actual = actual.getSiguiente();
        } while (actual != primero);
    }
    return null;
}

    @Override
    public void add(Object e) {
        //Agregar al inicio
        
        Imagenes dato =  (Imagenes) e;
       NodoIm nuevo = new NodoIm(dato);
        if (estaVacia()) {
            primero = nuevo;
            ultimo = nuevo;
            primero.setAnterior(ultimo);
            ultimo.setSiguiente(primero);
        } else {
            nuevo.setSiguiente(primero);
            primero.setAnterior(nuevo);
            primero = nuevo;
            primero.setAnterior(ultimo);
            ultimo.setSiguiente(primero);
        }
        size++;    
    }

    @Override
    public Object peek() {
        Object object= null;
        return object;
    }

    
    public void mostrarLista() {
    if (!estaVacia()) {
        NodoIm actual = primero;
        do {
            System.out.println(actual.getDato().getNombre());
            actual = actual.getSiguiente();
        } while (actual != primero);
    }
}

    NodoIm actual=null;
    
    public Imagenes ObtenerSigiente(){
        
        Imagenes enviar = null;
        if(actual==null){ 
        actual = primero.getSiguiente();
        
        }
        // Procesar la información del nodo actual
         enviar=actual.getDato();
        // Avanzar al siguiente nodo
        actual = actual.getSiguiente();
        // Si llegamos al final de la lista, volvemos al primer nodo
        if (actual == null) {
            actual = primero;
        }
        return enviar;
    }
    
    
    public Imagenes ObtenerAnterior(){
      Imagenes enviar = null;
//        if(actual==null){ 
//        actual = primero.getAnterior();
//    }
       actual = actual.getAnterior();
       enviar = actual.getDato();
       
       
       return enviar;
    }
    
    @Override
    public Object find(Object e) {
       
        Imagenes dato = (Imagenes) e;
        NodoIm actual1 = primero;
         Object enviar = null;
       
         while (actual1!=null) {
          if(dato.getNombre().equals(actual1.getDato().getNombre())){
              System.out.println("nombre encontrado" + actual1.getDato().getNombre());
             enviar = actual1.getDato();
              break;
              
          }
          
      actual1 = actual1.getSiguiente();
                    
      }
        
       return enviar; 
    }

    @Override
    public Object getNext() {
        Object object= null;
        return object;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public Object get(int i) {
        
      Imagenes imagenes = null;
        
    NodoIm actual = primero; 
    int contador = 0; 
    
    while (actual != null && contador < i) {
        actual = actual.getSiguiente();
        contador++;
    }
      
    if (actual != null) {
        imagenes = actual.getDato();    }
        Object object = imagenes;
        
        return object;

    }

    @Override
    public Object pop() {
        Object object= null;
        return object;
    }

    @Override
    public void delete(Object e) {
       Imagenes dato = (Imagenes) e;
        
    if (!estaVacia()) {
        // Buscar el nodo que contiene el dato a eliminar
        NodoIm actual1 = primero;
        while (actual1 != null && !actual1.getDato().getNombre().equals(dato.getNombre())) {
            actual1 = actual1.getSiguiente();
        }
        // Si se encontró el nodo, eliminarlo
        if (actual1 != null) {
            // Si el nodo es el primero, actualizar primero
            if (actual1 == primero) {
                primero = actual1.getSiguiente();
            }
            // Si el nodo es el último, actualizar último
            if (actual1 == ultimo) {
                ultimo = actual1.getAnterior();
            }
            // Actualizar los enlaces del nodo anterior y siguiente
            NodoIm anterior = actual1.getAnterior();
            NodoIm siguiente = actual1.getSiguiente();
            if (anterior != null) {
                anterior.setSiguiente(siguiente);
            }
            if (siguiente != null) {
                siguiente.setAnterior(anterior);
            
        }
    }
}

    }

    public NodoIm getPrimero() {
        return primero;
    }

    public void setPrimero(NodoIm primero) {
        this.primero = primero;
    }

    public NodoIm getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoIm ultimo) {
        this.ultimo = ultimo;
    }

    public NodoIm getActual() {
        return actual;
    }

    public void setActual(NodoIm actual) {
        this.actual = actual;
    }
    
    
    
}
