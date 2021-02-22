/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.system;
import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.ITALIC;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Nour
 */
public class Start 
        extends JFrame implements ActionListener {
    private static JLabel label;
    private static JLabel label2;
     private static JButton signUP;
 private static JButton signIn;
 JPanel panel=new JPanel();
     JFrame frame=new JFrame();
     Start (){
         frame. setSize(420,300);
frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

frame.add(panel);
  panel.setLayout(null);
  JLabel label= new JLabel("Welcome TO MIU");
  label.setForeground(Color.red);
  label.setFont(new Font(Font.SERIF, Font.PLAIN, 22));
 // label.setFont(new Font(ITALIC Font.PLAIN, 50));
  label.setBounds(150,10,180,40);
  panel.add(label);
 // JLabel label2= new JLabel("ch");
 // label2.setBounds(100,40,80,25);
 // panel.add(label2);
 JButton signUP=new JButton("Sign Up");
 signUP.setForeground(Color.black);
 signUP.setBounds(80,100,120,40);
 signUP.setFont(new Font(Font.SERIF, Font.PLAIN,25));
  signUP.addActionListener(this);
  panel.add(signUP);
  
   JButton signIn=new JButton("Sign in");
 signIn.setForeground(Color.black);
 signIn.setBounds(250,100,120,40);
 signIn.setFont(new Font(Font.SERIF, Font.PLAIN,25));
 signIn.addActionListener(this);
  panel.add(signIn);
  frame.setVisible(true);
     }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==signUP){
         frame.setVisible(false);
           Register r=new Register();
        }
      else  {
           frame.setVisible(false);
            idandPasswords s = new idandPasswords();       
            login bla=new login((s.logininfo));
        
    }
    }}
