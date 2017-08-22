/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuascmcgame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import javazoom.jl.player.advanced.*;
/**
 *
 * @author yee
 *
 * 
 */
//此題為琵琶

public class play2 extends JFrame {
    private Container container;
    private JPanel screen;
    private JRadioButton answer1;
    private JRadioButton answer2;
    private JRadioButton answer3;
    private JButton play;
    private JButton stop;
    private JButton submit;
    private ButtonGroup buttongroup ;
    private FileInputStream soundfile;
    private Player soundplayer;
    private Thread thread1;
    private boolean threadstatus = true;    
        
    
        
        play2(){
          
            container = getContentPane();
            container.setLayout(new GridLayout(1,1));
            screen = new JPanel();
            screen.setLayout(null);
            screen.setBorder(BorderFactory.createLineBorder(Color.blue, 2)); 
            
           // sound = getAudioClip(getCodeBase(),"erhu.mp3");
           try{
            soundfile = new FileInputStream("erhu.mp3");
            soundplayer = new Player(soundfile);
            //soundplayer.play();
           }catch(Exception e){
               System.out.println(e);
           }
            play = new JButton("Play");
            play.setSize(100,50);
            play.setLocation(100,100);
            play.setActionCommand("play");
            
            stop = new JButton("Stop");
            stop.setSize(100,50);
            stop.setLocation(210,100);
            stop.setActionCommand("stop");
            
            answer1 = new JRadioButton();
            answer1.setSize(25,20);
            answer1.setLocation(75,250);
            answer2 = new JRadioButton();
            answer2.setSize(25,20);
            answer2.setLocation(275,250);
            answer3 = new JRadioButton();
            answer3.setSize(25,20);
            answer3.setLocation(475,250);
            
            buttongroup = new ButtonGroup();
            buttongroup.add(answer1);
            buttongroup.add(answer2);
            buttongroup.add(answer3);
            
            container.add(screen);
            buttongroup.add(answer1);
            buttongroup.add(answer2);
            buttongroup.add(answer3);
            
            screen.add(play);
            screen.add(stop);
            screen.add(answer1);
            screen.add(answer2);
            screen.add(answer3);
           /* 
            this.addWindowListener(
                new WindowAdapter(){
                    public void windowOpened(WindowEvent e){
                        if(KUASCMCGAME)
                    }
                }
        );*/
           
          
          
           play.addActionListener(new ActionListener(){    //播放
           public void actionPerformed(ActionEvent e){
                
                   thread1 = new Thread(new Runnable(){  //播放線程
               public void run() {
                        String playcommand = e.getActionCommand();
               if(playcommand == "play"){
               try {
                   soundplayer.play();

               } catch (Exception exc) {
                   exc.printStackTrace();
                   System.out.println("Failed to play the file.");
               }
                 }
                   }
               });           
               thread1.start();
             }
        });
           
            /*
           stop.addActionListener(new ActionListener(){    //停止
           public void actionPerformed(ActionEvent e){
                
           try {
             thread1.sleep(2000);
             thread1.interrupt();
               } catch (InterruptedException ex) {
            ex.printStackTrace();
           }
               
            }
           });*/
            
            setTitle("KUASCMC Music Game");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
            setSize(650,500);
            setLocationRelativeTo(null);
            
        }
        

        
        public static void main(String[] args){
            new play2();
        } 
}
