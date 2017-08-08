/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuascmcgame;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
/**
 *
 * @author yee
 */
public class categoryWindow extends JFrame {
    
    private JPanel category;
    private JButton bowstring;
    private JButton wind;
    private JButton pluck;
    private JButton percussion;

    
    public static void main(String[] args) {

        JFrame Frame = new JFrame("KUASCMC Music Game");
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setVisible(true);
        Frame.setSize(150,300);
        Frame.setLocationRelativeTo(null);

        
        
        
    }
    
    public categoryWindow() throws HeadlessException {
        
        category = new JPanel(new FlowLayout());
      //  category.setLayout(new FlowLayout(FlowLayout.CENTER));
        category.setBounds(0,0,50,30);        
        bowstring = new JButton ("拉弦");
        bowstring.setVisible(true);
        category.add(bowstring,FlowLayout.CENTER);
        
        getContentPane().add(category);
        pack();
     // setLayout(new BorderLayout());
     //  add("North",category);
    }
}
