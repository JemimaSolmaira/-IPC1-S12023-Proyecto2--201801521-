/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Handlers;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author diego
 */
public class JPEGImageHandlerRotator extends ImageHandler {

    protected String save_file;
    protected String new_name;
    protected String new_path;

    protected BufferedImage imagenH;
    protected BufferedImage imagenV;
    

    public JPEGImageHandlerRotator(String filename, String filepath) {
        super(filename, filepath);

        //copy-nombre.jpeg
        int inidiceInicial = super.getFileName().lastIndexOf("-") + 1;
        int indiceFinal = super.getFileName().lastIndexOf(".");

        this.new_name = filename.substring(inidiceInicial, indiceFinal);

        this.save_file = "C:\\Users\\joz\\OneDrive\\Documentos\\NetBeansProjects\\imagenes";
    }

    @Override
    public void readFile() throws Exception {
        File archivo = new File(this.handledFilePath);
        imagenH = ImageIO.read(archivo);
        imagenV = ImageIO.read(archivo);
        
    }

    @Override
    public void generateFiles() throws Exception {
        Horizontal(imagenH);
        Vertical(imagenV);
    }

    public void Horizontal(BufferedImage imagen) {
        for (int i = 0; i < imagen.getHeight(); i++) {
            for (int j = 0; j < imagen.getWidth()/2; j++) {
                int p = imagen.getRGB(j, i);

                
                int a = imagen.getWidth() - j - 1;
                int b = imagen.getRGB(a, i);
          
                
                imagen.setRGB(j, i, b);
                imagen.setRGB(a, i, p);
            }
        }
        
        
        try {
            new_path = save_file + "Hrotation-" + new_name + ".jpeg";

            ImageIO.write(imagen, "JPEG", new File(new_path));
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public void Vertical(BufferedImage imagen) {
        for (int i = 0; i < imagen.getHeight()/2; i++) {
            for (int j = 0; j < imagen.getWidth(); j++) {
                int p = imagen.getRGB(j, i);

                
                int a = imagen.getHeight() - i - 1;
                int b = imagen.getRGB(j, a);
          
                
                imagen.setRGB(j, i, b);
                imagen.setRGB(j, a, p);
            }
        }
        
        
        try {
            new_path = save_file + "Vrotation-" + new_name + ".jpeg";

            ImageIO.write(imagen, "JPEG", new File(new_path));
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
 
}
