package homeentertainmentautomation.customcomponents;

import homeentertainmentautomation.Services.JResize;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class JImagePanel extends javax.swing.JPanel {
    
    private BufferedImage image;
    private int width, height;
    
    public JImagePanel() {
        
        try {
            image = ImageIO.read(getClass().getResource("/homeentertainmentautomation/resources/background.jpg"));
        } catch(java.io.IOException ex) {
            System.out.println(ex);
        }
        
        initComponent();
        
    } // end default constructor
    
    public JImagePanel(String path) {
        
        try {
            image = ImageIO.read(getClass().getResource(path));
        } catch(java.io.IOException ex) {
            System.out.println(ex);
        }
        
        initComponent();
        
    } // end default constructor
    
    private void initComponent() {
        
        Dimension size = this.getPreferredSize();
        size.width = size.height = Math.max(size.width, size.height);
        this.setPreferredSize(size);
        
        this.setOpaque(false);
        this.setFocusable(false);
        
        this.width = this.getWidth();
        this.height = this.getHeight();
        
        this.addComponentListener(new ComponentAdapter() {
           
            @Override
            public void componentResized(ComponentEvent ce) {
                repaint();
            }
            
        });
        
    } // end initComponent()
    
    public void changeImage(String path) {
        
        try {
            image = ImageIO.read(getClass().getResource(path));
        } catch(java.io.IOException ex) {
            System.out.println(ex);
        }
        
        repaint();
        
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        
        JResize resize = new JResize(image, this.getWidth(), this.getHeight());
        g.drawImage(resize.resized, 0, 0, this);
        
    }
    
}
