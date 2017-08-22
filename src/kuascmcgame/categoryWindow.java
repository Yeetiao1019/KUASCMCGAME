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
    
    private Container container;
    private JPanel category;
    private JButton bowstring;
    private JButton wind;
    private JButton pluck;
    private JButton percussion;

    
    public static void main(String[] args) {

        

        new categoryWindow();
        
        
    }
    
     categoryWindow()  {
        
        container = getContentPane();
        container.setLayout(new GridLayout(1,1));
        
        category = new JPanel();
        category.setLayout(null);
        category.setBorder(BorderFactory.createLineBorder(Color.blue, 2));  
        
        bowstring = new JButton ("拉弦");
        bowstring.setLocation(50,30);
        bowstring.setSize(50,50);
        
        container.add(category);
        category.add(bowstring);
   
        
        
        
        
        setTitle("KUASCMC Music Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(150,300);
        setLocationRelativeTo(null);
    }
}
