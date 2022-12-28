/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sa;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Aluno_Manha
 */
public class Eventos {
    
    
    
    public void nextWindow(JFrame open, JFrame close)
    {
        close.dispose();
        open.show();
    }
    
    public void centerJFrame(JFrame jframe) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();

        int X = (int) ((dimension.getWidth() - jframe.getWidth()) / 2);
        int Y = (int) ((dimension.getHeight() - jframe.getHeight()) / 2);

        jframe.setLocation(X, Y);
    }
    
}
