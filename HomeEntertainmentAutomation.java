package homeentertainmentautomation;

import javax.swing.JFrame;

public class HomeEntertainmentAutomation {

    public static void main(String[] args) {
        
        HomeAutomationGUI gui = new HomeAutomationGUI();
        
        gui.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        gui.setVisible(true);
        
    } // end main
    
} // end class
