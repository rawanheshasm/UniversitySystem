/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.system;
import java.awt.Color;
import java.awt.Font;
 import java.awt.Panel;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
  import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
/**
 *
 * @author Rawan
 */
public class login implements ActionListener {
    private static JLabel userlabel;
 private static JTextField userText;
 private static JLabel passwordlabel;
 private static JPasswordField passwordText;
 private static JButton login;
 private static JButton Reset;
 private static JLabel sucess;
  JLabel messageLabel=new JLabel();
//  JButton RESETBUTTON=new JButton("Reset");
  JPanel panel=new JPanel();
     JFrame frame=new JFrame();

HashMap<String,String> logininfo=new HashMap<String,String>();
 public login (HashMap<String,String>loginoriginal){ 
     logininfo=loginoriginal;
    
   frame. setSize(420,300);
frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
frame.setVisible(true);
frame.add(panel);
  panel.setLayout(null);
  JLabel label= new JLabel("username");
  label.setBounds(10,20,80,25);
  panel.add(label);
  userText=new JTextField(20);
  userText.setBounds(100,20,165,25);
  panel.add(userText);
  JLabel label2= new JLabel("Password");
  label2.setBounds(10,70,80,25);
  panel.add(label2);
   passwordText= new JPasswordField(20);
  passwordText.setBounds(100,70,165,25);
  panel.add(passwordText);
   login = new JButton ("login");
  login.setBounds(100,120,80,25);
login.addActionListener(this);
login.setFocusable(false);
  panel.add(login);
  
  Reset=new JButton("Reset");
  Reset.setBounds(200,120,80,25);
  Reset.setFocusable(true);
  Reset.addActionListener(this);
  panel.add(Reset);
  messageLabel.setBounds(100,200,250,35);
       messageLabel.setFont(new Font(null,Font.ITALIC,25) );
     //  RESETBUTTON.setBounds(225,200,100,25);
      // RESETBUTTON.addActionListener(this);
     //  panel.add(RESETBUTTON);
       panel.add(messageLabel);
  frame.setVisible(true);
 }
 @Override
    public void actionPerformed(ActionEvent e) {
   if(e.getSource()==Reset){
       userText.setText("");
       passwordText.setText("");
       messageLabel.setText("");
   }
   if(e.getSource()==login){
       String  userID=userText.getText();
       String password=String.valueOf(passwordText.getPassword());
     //  String  password=passwordText.getText();
    if(logininfo.containsKey(userID)){
        if(logininfo.get(userID).equals(password)){
          messageLabel.setForeground(Color.blue);
            //messageLabel.setText("login Successful !");
            //frame.dispose();
            //welcomePage WelcomePage = new welcomePage(userID);
            JOptionPane.showMessageDialog(null, "login Successful !");
             Courses c=new Courses();
            frame.setVisible(false);
        }
        else{
               messageLabel.setForeground(Color.red);
            messageLabel.setText("wrong  password !");
        }
    }else{
              messageLabel.setForeground(Color.red);
            messageLabel.setText("usename not found!");
    
   }
    }

}}
