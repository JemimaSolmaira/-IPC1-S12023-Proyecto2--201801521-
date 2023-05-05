
package clases;

import java.io.Serializable;
import java.util.ArrayList;


public class Categorias implements Serializable {
   private ArrayList<String> cat; 

    public Categorias() {
        cat=new ArrayList<String>();
        cat.add("General");
    }

public void add(String a){
  cat.add(a);
  
  for (int i = 0; i < cat.size(); i++) {
          
      System.out.println(cat.get(i).toString());
        }
  
}
    
    public void borrar(int i){
     cat.remove(i);
    }

    public boolean verificar(String a){
        boolean si = false;
        
        for (int i = 0; i < cat.size(); i++) {
            if (cat.get(i).toString()== a){
                si = true;
                
                break;
                
            }
        }
        return si;
    }
    
    public int Buscarindice(String a){
     int indice = -1;
        for (int i = 0; i < cat.size(); i++) {
            if (cat.get(i).toString()== a){
                indice = i;
                
                break;
                
            }
        }
      return indice;
    }
    
    public String indice(int i){
        return cat.get(i).toString();   
    }

    public ArrayList getCat() {
        return cat;
    }

    public void setCat(ArrayList cat) {
        this.cat = cat;
    }




}
