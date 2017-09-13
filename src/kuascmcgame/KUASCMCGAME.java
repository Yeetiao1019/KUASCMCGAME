
package kuascmcgame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author 陳沂
 */
public class KUASCMCGAME extends JFrame {

    KUASCMCGAME(){
        Container container = getContentPane();
        container.setLayout(new GridLayout(2,1));
       // container.setSize(new Dimension(650,500));
       // container.setLayout(new FlowLayout());
        ImageIcon kuas = new ImageIcon(KUASCMCGAME.class.getResource("kuascmc3.png"));
        //ImageIcon cmc = new ImageIcon(KUASCMCGAME.class.getResource("cmc.png"));
        JLabel kuasimg  = new JLabel(kuas);
     //   JLabel cmcimg  = new JLabel(cmc);
        JPanel difficulty = new JPanel();
        JPanel word = new JPanel();
        
        word.setLayout(new GridLayout(1,1));
        word.setBorder(BorderFactory.createLineBorder(Color.blue, 2));
        difficulty.setLayout(null);
        difficulty.setBorder(BorderFactory.createLineBorder(Color.yellow, 2));
        JButton easy = new JButton("開始");
        JButton normal = new JButton("中等");
        JButton hard = new JButton("困難");
        
        easy.setSize(new Dimension(100,50)); //設定按鈕大小
        easy.setLocation(275,80);            //設定按鈕位置
        normal.setSize(new Dimension(100,50));
        normal.setLocation(300,80);
        hard.setSize(new Dimension(100,50));
        hard.setLocation(500,80);
        
        int kuaswidth = 350;
        int kuasheight = 69;

        kuas.setImage(kuas.getImage().getScaledInstance(650,235,Image.SCALE_DEFAULT)); 
        kuasimg.setSize(500,350);
        kuasimg.setLocation(50,50);

       /*
        JButton bowstring = new JButton("拉弦");
        JButton wind = new JButton("吹管");
        JButton pluck = new JButton("彈撥");
        JButton percussion = new JButton("打擊");
        
        bowstring.setSize(new Dimension(100,50));
        bowstring.setLocation(20,20);
        wind.setSize(new Dimension(100,50));
        wind.setLocation(20,75);
        pluck.setSize(new Dimension(100,50));
        pluck.setLocation(20,130);
        percussion.setSize(new Dimension(100,50));
        percussion.setLocation(20,185);
        
        difficulty.add(bowstring);
        difficulty.add(wind);
        difficulty.add(pluck);
        difficulty.add(percussion);
        */
        difficulty.add(easy);
       // difficulty.add(normal);
       // difficulty.add(hard);
        word.add(kuasimg);
     //   word.add(cmcimg,BorderLayout.SOUTH);
        container.add(word);
        container.add(difficulty);
        
        setTitle("KUASCMC Music Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(750,600);
        setLocationRelativeTo(null);
        
        easy.addActionListener(new ActionListener(){    //按鈕事件
           public void actionPerformed(ActionEvent e){
               new play1();
               dispose(); // 關閉視窗
               //System.out.println(score);
           } 
        });
        
        
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        new KUASCMCGAME();
        
    }
   
    
}
