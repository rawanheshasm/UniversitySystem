/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.system;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author Rawan
 */
public class Dentistry extends JFrame implements ActionListener{
        private Container Container;
    private static JLabel titlelec;
    private static JLabel lec1;
    private static JLabel lec2;
    private static JLabel lec3;
    private static JLabel lec4;
    private static JLabel lec5;
    private static JLabel lec6;
    private static JLabel lec7;
    private static JLabel titleas;
    private static JButton submit;
    private static JTextArea TA;
    private static JCheckBox term;
    private static JLabel S;
    private static JLabel quiz;
    private static JButton quiz1;
    private static JButton quiz2;
    private static JButton quiz3;
    private static JLabel y;
    private static JTextField juja;

    Dentistry(String s ) {
        super(s);
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        titlelec = new JLabel("Online Lectures:-");
        lec1 = new JLabel("lecture 1");
        lec2 = new JLabel("lecture 2");
        lec3 = new JLabel("lecture 3");
        lec4 = new JLabel("lecture 4");
        lec5 = new JLabel("lecture 5");
        lec6 = new JLabel("lecture 6");
        lec7 = new JLabel("lecture 7");
        submit = new JButton("Submit");
        quiz = new JLabel("Quizzes:-");
        titleas = new JLabel("Assignments:-");
        TA = new JTextArea();
        Container = getContentPane();
        Container.setLayout(null);

        titlelec.setFont(new Font("Arial", Font.BOLD, 20));
        titlelec.setSize(200, 70);
        titlelec.setLocation(20, 5);
        Container.add(titlelec);

        lec1.setFont(new Font("Arial", Font.PLAIN, 20));
        lec1.setSize(100, 20);
        lec1.setLocation(20, 60);
        Container.add(lec1);

        lec2.setFont(new Font("Arial", Font.PLAIN, 20));
        lec2.setSize(100, 20);
        lec2.setLocation(20, 90);
        Container.add(lec2);

        lec3.setFont(new Font("Arial", Font.PLAIN, 20));
        lec3.setSize(100, 20);
        lec3.setLocation(20, 120);
        Container.add(lec3);

        lec4.setFont(new Font("Arial", Font.PLAIN, 20));
        lec4.setSize(100, 20);
        lec4.setLocation(20, 150);
        Container.add(lec4);

        lec5.setFont(new Font("Arial", Font.PLAIN, 20));
        lec5.setSize(100, 20);
        lec5.setLocation(20, 180);
        Container.add(lec5);

        lec6.setFont(new Font("Arial", Font.PLAIN, 20));
        lec6.setSize(100, 20);
        lec6.setLocation(20, 210);
        Container.add(lec6);

        lec7.setFont(new Font("Arial", Font.PLAIN, 20));
        lec7.setSize(100, 20);
        lec7.setLocation(20, 240);
        Container.add(lec7);

        titleas.setFont(new Font("Arial", Font.BOLD, 20));
        titleas.setSize(200, 70);
        titleas.setLocation(20, 270);
        Container.add(titleas);

        submit.setFont(new Font("Arial", Font.PLAIN, 15));
        submit.setSize(120, 40);
        submit.setLocation(20, 350);
        submit.addActionListener(this);
        Container.add(submit);

//        TA.setFont(new Font("Arial", Font.PLAIN, 15));
//        TA.setSize(200, 75);
//        TA.setLocation(20, 400);
//        Container.add(TA);

        term = new JCheckBox("Before Submitting please confirm that this is your work");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(450, 60);
        term.setLocation(20, 400);
        Container.add(term);

        S = new JLabel("");
        S.setFont(new Font("Arial", Font.PLAIN, 20));
        S.setSize(500, 25);
        S.setLocation(100, 525);
        Container.add(S);

        quiz.setFont(new Font("Arial", Font.BOLD, 25));
        quiz.setSize(200, 70);
        quiz.setLocation(550, 5);
        Container.add(quiz);

        quiz1 = new JButton("Quiz A");
        quiz1.setFont(new Font("Arial", Font.PLAIN, 20));
        quiz1.setSize(120, 40);
        quiz1.setLocation(550, 80);
        quiz1.addActionListener(this);
        Container.add(quiz1);
        

        quiz2 = new JButton("Quiz B");
        quiz2.setFont(new Font("Arial", Font.PLAIN, 20));
        quiz2.setSize(120, 40);
        quiz2.setLocation(550, 130);
        quiz2.addActionListener(this);
        Container.add(quiz2);

        quiz3 = new JButton("Quiz C");
        quiz3.setFont(new Font("Arial", Font.PLAIN, 20));
        quiz3.setSize(120, 40);
        quiz3.setLocation(550, 180);
        quiz3.addActionListener(this);
        Container.add(quiz3);

        y = new JLabel("");
        y.setFont(new Font("Arial", Font.PLAIN, 20));
        y.setSize(100, 20);
        y.setLocation(550, 300);
        Container.add(y);
        
//        juja=new JTextField();
//          juja.setFont(new Font("Arial", Font.PLAIN, 15));
//        juja.setSize(1, 1);
//        juja.setLocation(550, 400);
//        Container.add(juja);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == submit) {
            if (term.isSelected()) {
                setVisible(false);
                AssigmentFile ass=new AssigmentFile();
            }
            else
            {
              S.setText("please accept terms first");
            }

        } 
        else if  (e.getSource() == quiz1) {
        
                JOptionPane.showMessageDialog(null, "No quiz to attempt,Back to the course");
    }
        else if  (e.getSource() == quiz2) {
        
                JOptionPane.showMessageDialog(null, "No quiz to attempt,Back to the course");
    }
        else if  (e.getSource() == quiz3) {
        
                JOptionPane.showMessageDialog(null, "No quiz to attempt,Back to the course");
    }
}
}
