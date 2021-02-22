/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.system;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author Rawan
 */
public class welcomePage extends JFrame{
    JFrame frame=new JFrame();
         JPanel jp= new JPanel();
      
         JLabel welcomeLabel=new JLabel("Hello");
        welcomePage(String userID){
        welcomeLabel.setBounds(0,0,200,35);
        welcomeLabel.setText("Hello  "+userID);
        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);       
    }
}
