package homeentertainmentautomation.Services;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class JResize {
    
    public BufferedImage resized;
    
    public JResize(BufferedImage image, int width, int height) {
        
        resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = resized.createGraphics();
        g2d.drawImage(image, 0, 0, width, height, null);
        
    } // end default constructor
    
} // end class
