/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.system;
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.ITALIC;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
/**
 *
 * @author Rawan
 */
public class LoginOptions extends JFrame{
      private static JLabel label;
    private static JLabel label2;
     private static JButton Student;
 private static JButton Instructor;
 JPanel panel=new JPanel();
     JFrame frame=new JFrame();
 public LoginOptions(){
         frame. setSize(400,350);
frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

frame.add(panel);
  panel.setLayout(null);
  JLabel label= new JLabel("Login Info");
  label.setForeground(Color.red);
  label.setFont(new Font(Font.SERIF, Font.PLAIN, 40));
 // label.setFont(new Font(ITALIC Font.PLAIN, 50));
  label.setBounds(150,10,180,40);
  panel.add(label);
 // JLabel label2= new JLabel("ch");
 // label2.setBounds(100,40,80,25);
 // panel.add(label2);
 JButton signUP=new JButton("Students");
 signUP.setForeground(Color.black);
 signUP.setBounds(80,100,120,40);
 signUP.setFont(new Font(Font.SERIF, Font.PLAIN,20));
  panel.add(signUP);
   JButton signIN=new JButton("Instructor");
 signIN.setForeground(Color.black);
 signIN.setBounds(250,100,120,40);
 signIN.setFont(new Font(Font.SERIF, Font.PLAIN,20));
  panel.add(signIN);
  frame.setVisible(true);
     }
}
