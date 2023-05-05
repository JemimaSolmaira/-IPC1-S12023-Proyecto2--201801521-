
package clases;


public class ListaUsuarios extends EstructuraDeDatos{

        Nodo primero;
        Nodo ultimo;
       private int size;

    public ListaUsuarios() {
        this.primero = null;
        this.ultimo = null;
        this.size = 0;
    }
    
    public boolean listaVacia() {
        return primero == null;
    }
    
    @Override
    public void add(Object e) {
        Usuario usuario = (Usuario) e;
        
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.usuario = usuario;
        
        if (primero == null) {
            primero = nuevoNodo;
            primero.Siguente = null;
            ultimo = primero;
        }else{
            ultimo.Siguente = nuevoNodo;
            nuevoNodo.Siguente = null;
            ultimo = nuevoNodo;
        }
       size++;
    }

    
    public void mostrar() {
        Nodo actual = new Nodo();
        actual = primero;
        int contador = 0;
        while (actual != null) {
            System.out.println("[" + contador + "]: " + actual.getUsuario().getNombre());
            actual = actual.Siguente;
            contador ++;
        }
    }
    
    
    @Override
    public Object peek() {
        Object a = null;
        return a;
    }

    public boolean busqueda(Usuario e){
        Nodo temporal = primero;
        while (temporal!=null && temporal.usuario.nombre!= e.nombre){
        temporal = temporal.Siguente;
        
        }
    
      return temporal != null;
    }
    

    @Override
    public Object find(Object e) {
       
        
        Usuario usuario = (Usuario) e;
       Nodo actual = primero;
       Object enviar = null;
       
        System.out.println("el usuario recibido para buscar es" + usuario.nombre);
        System.out.println(" ");
        System.out.println("el nodo actual es" + actual.usuario.getNombre());
       
      while (actual!=null) {
          if(usuario.getNombre().equals(actual.usuario.getNombre())){
              System.out.println("nombre encontrado" + actual.usuario.getNombre());
             enviar = actual.usuario;
              break;
              
          }
          
      actual = actual.Siguente;
                    
      }
       
        
      return enviar;
    }

    Nodo actual = null;
    @Override
    public Object getNext() {
        
        Object object= null;
            
         if (actual == null)   {
         actual  = new Nodo();
         }    
           
         actual = primero;
         
        object = actual.getUsuario();
        actual = actual.Siguente;
            

        return object;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public Object get(int i) {
        
        Usuario usuario = null;
        
    Nodo actual = primero; 
    int contador = 0; 
    
    while (actual != null && contador < i) {
        actual = actual.Siguente;
        contador++;
    }
      
    if (actual != null) {
        usuario = actual.usuario;    }
        Object object = usuario;
        
        return object;
        
    }

    @Override
    public Object pop() {
        Object object= null;
        return object;
       
    }

    @Override
    public void delete(Object e) {
        
    }

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }
    
}
