
package gui_tp4;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelFondo extends JPanel{
    
    private Image fondo;
    
     public PanelFondo() {
        fondo = new ImageIcon(getClass().getResource("/gui_tp4/fondoVI.png")).getImage();
    }
    
     @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
    } 
               
}
