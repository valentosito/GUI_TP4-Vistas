
package gui_tp4;


import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

public class DesktopPanelFondo extends JDesktopPane {
    
    
    private final Image fondo;

    public DesktopPanelFondo() {
        
        this.fondo = new ImageIcon(getClass().getResource("/gui_tp4/fondoVP.png")).getImage();
    }
    
     @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
    }
    
    
}
