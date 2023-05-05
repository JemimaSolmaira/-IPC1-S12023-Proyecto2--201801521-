
package Handlers;


public class RunImageHandler implements Runnable {

    ImageHandler Image;

    public RunImageHandler(ImageHandler Image) {
        this.Image = Image;
    }
    
    
    
    @Override
    public void run() {
        try {
            JPEGHandler.runHandler(Image);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
