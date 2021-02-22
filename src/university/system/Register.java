/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.system;
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
/**
 *
 * @author Rawan
 */
public class Register
     extends JFrame 
    implements ActionListener { 
  
    // Components of the Form 
    private Container c; 
    private JLabel title; 
    private JLabel Firstname; 
    private JLabel Lastname; 
    private JTextField fName; 
    private JTextField lName; 
    private JLabel MobileNumber; 
    private JTextField mobilenumber; 
    private JLabel Gender; 
    private JRadioButton Male; 
    private JRadioButton Female; 
    private ButtonGroup genderButton; 
    private JLabel DateOfBirth; 
    private JComboBox date; 
    private JComboBox month; 
    private JComboBox year; 
    private JLabel Address; 
    private JTextArea address; 
    private JLabel Faculty;
    private JComboBox faculty; 
    private JCheckBox term; 
    private JButton submit; 
    private JButton reset; 
    private JButton skip; 
    private JTextArea tout; 
    private JLabel Reset; 
    private JLabel Submit; 
    private JTextArea resadd; 
  
    private String dates[] 
        = { "1", "2", "3", "4", "5", 
            "6", "7", "8", "9", "10", 
            "11", "12", "13", "14", "15", 
            "16", "17", "18", "19", "20", 
            "21", "22", "23", "24", "25", 
            "26", "27", "28", "29", "30", 
            "31" }; 
    private String months[] 
        = { "Jan", "feb", "Mar", "Apr", 
            "May", "Jun", "July", "Aug", 
            "Sup", "Oct", "Nov", "Dec" }; 
    private String years[] 
        = { "1995", "1996", "1997", "1998", 
            "1999", "2000", "2001", "2002", 
            "2003", "2004", "2005", "2006", 
            "2007", "2008", "2009", "2010", 
            "2011", "2012", "2013", "2014", 
            "2015", "2016", "2017", "2018", 
            "2019" 
        }; 
  private String faculties[] 
        = { "Select Faculty","Computer sceince","Alsun","Pharmacy","Dentistry",
            "Mass Communication","Bussiness", " Engineering" 
        }; 
    // constructor, to initialize the components 
    // with default values. 
    public Register() 
    { 
        setTitle("Registration Form"); 
        setBounds(300, 90, 900, 600); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(true); 
  
         c = getContentPane(); 
        c.setLayout(null); 
  
        title = new JLabel("Registration Form"); 
        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
        title.setSize(300, 30); 
        title.setLocation(300, 30); 
        c.add(title); 
  
        Firstname = new JLabel("First Name");  
        Firstname.setFont(new Font("Arial", Font.PLAIN, 20)); 
        Firstname.setSize(100, 20); 
        Firstname.setLocation(100, 100); 
        c.add(Firstname); 
       
        Lastname = new JLabel("Last Name");
        Lastname.setFont(new Font("Arial", Font.PLAIN, 20)); 
        Lastname.setSize(100, 20); 
        Lastname.setLocation(100, 150); 
        c.add(Lastname); 
  
        fName = new JTextField(); 
        fName.setFont(new Font("Arial", Font.PLAIN, 15)); 
        fName.setSize(190, 20); 
        fName.setLocation(220, 100); 
        c.add(fName); 
       
        lName = new JTextField(); 
        lName.setFont(new Font("Arial", Font.PLAIN, 15)); 
        lName.setSize(190, 20); 
        lName.setLocation(220, 150); 
        c.add(lName); 
        
        MobileNumber= new JLabel("Mobile"); 
        MobileNumber.setFont(new Font("Arial", Font.PLAIN, 20)); 
        MobileNumber.setSize(100, 20); 
        MobileNumber.setLocation(100, 200);
        c.add(MobileNumber); 
  
        mobilenumber = new JTextField(); 
        mobilenumber.setFont(new Font("Arial", Font.PLAIN, 15)); 
        mobilenumber.setSize(150, 20); 
       mobilenumber.setLocation(220, 200); 
           c.add(mobilenumber);
        
  
        Gender = new JLabel("Gender"); 
        Gender.setFont(new Font("Arial", Font.PLAIN, 20)); 
        Gender.setSize(100, 20); 
        Gender.setLocation(100, 250); 
        c.add(Gender); 
  
        Male = new JRadioButton("Male"); 
        Male.setFont(new Font("Arial", Font.PLAIN, 15)); 
        Male.setSelected(false); 
        Male.setSize(75, 20); 
        Male.setLocation(200, 250); 
        c.add(Male); 
  
        Female = new JRadioButton("Female"); 
        Female.setFont(new Font("Arial", Font.PLAIN, 15)); 
        Female.setSelected(false); 
        Female.setSize(80, 20); 
        Female.setLocation(275, 250); 
        c.add(Female); 
  
        genderButton = new ButtonGroup(); 
        genderButton.add(Male); 
        genderButton.add(Female); 
  
        DateOfBirth = new JLabel("DOB"); 
        DateOfBirth.setFont(new Font("Arial", Font.PLAIN, 20)); 
        DateOfBirth.setSize(100, 20); 
        DateOfBirth.setLocation(100, 300); 
        c.add(DateOfBirth); 
  
        date = new JComboBox(dates); 
        date.setFont(new Font("Arial", Font.PLAIN, 15)); 
        date.setSize(50, 20); 
        date.setLocation(200, 300); 
        c.add(date); 
  
        month = new JComboBox(months); 
        month.setFont(new Font("Arial", Font.PLAIN, 15)); 
        month.setSize(60, 20); 
        month.setLocation(250, 300); 
        c.add(month); 
  
        year = new JComboBox(years); 
        year.setFont(new Font("Arial", Font.PLAIN, 15)); 
        year.setSize(60, 20); 
        year.setLocation(320, 300); 
        c.add(year); 
  
        Faculty = new JLabel("Faculty"); 
        Faculty.setFont(new Font("Arial", Font.PLAIN, 20)); 
        Faculty.setSize(100, 20); 
        Faculty.setLocation(100, 350); 
        c.add(Faculty); 
        
        faculty = new JComboBox(faculties); 
        faculty.setFont(new Font("Arial", Font.PLAIN, 15)); 
        faculty.setSize(150, 35); 
        faculty.setLocation(200, 345); 
        c.add(faculty); 
        
        Address = new JLabel("Address"); 
        Address.setFont(new Font("Arial", Font.PLAIN, 20)); 
        Address.setSize(100, 20); 
        Address.setLocation(100, 400); 
        c.add(Address); 
  
        address = new JTextArea(); 
        address.setFont(new Font("Arial", Font.PLAIN, 15)); 
        address.setSize(200, 50); 
        address.setLocation(200, 400); 
        address.setLineWrap(true); 
        c.add(address); 
  
        
        term = new JCheckBox("Accept Terms And Conditions."); 
        term.setFont(new Font("Arial", Font.PLAIN, 15)); 
        term.setSize(250, 20); 
        term.setLocation(150, 465); 
        c.add(term); 
  
        submit = new JButton("Submit"); 
        submit.setFont(new Font("Arial", Font.PLAIN, 15)); 
        submit.setSize(100, 20); 
        submit.setLocation(150, 500); 
        submit.addActionListener(this); 
        c.add(submit); 
  
        reset = new JButton("Reset"); 
        reset.setFont(new Font("Arial", Font.PLAIN, 15)); 
        reset.setSize(100, 20); 
        reset.setLocation(300, 500); 
        reset.addActionListener(this); 
        c.add(reset);
  
        skip = new JButton("Login"); 
        skip.setFont(new Font("Arial", Font.PLAIN, 15)); 
        skip.setSize(250, 40); 
        skip.setLocation(535, 510); 
        skip.addActionListener(this); 
        c.add(skip); 
        
       tout = new JTextArea(); 
        tout.setFont(new Font("Arial", Font.PLAIN, 15)); 
        tout.setSize(300, 400); 
        tout.setLocation(500, 100); 
        tout.setLineWrap(true); 
        tout.setEditable(false); 
        c.add(tout); 
  
       Reset = new JLabel(""); 
        Reset.setFont(new Font("Arial", Font.PLAIN, 20)); 
        Reset.setSize(500, 25); 
        Reset.setLocation(100, 525); 
        c.add(Reset); 
  
        resadd = new JTextArea(); 
        resadd.setFont(new Font("Arial", Font.PLAIN, 15)); 
        resadd.setSize(200, 75); 
        resadd.setLocation(580, 175); 
        resadd.setLineWrap(true); 
        c.add(resadd); 
        setVisible(true); 
    } 
  
    // method actionPerformed() 
    // to get the action performed 
    // by the user and act accordingly 
    public void actionPerformed(ActionEvent e) 
    { 
        if (e.getSource() == submit) { 
            if (term.isSelected()) { 
                if(fName.getText().isEmpty())
                {
                tout.setText(""); 
                resadd.setText(""); 
                //JOptionPane.showMessageDialog(null, "please enter first name");
                Reset.setText("Please fill the missing things"); 
                }
                if( lName.getText().isEmpty() )
                {
                tout.setText(""); 
                resadd.setText(""); 
                //JOptionPane.showMessageDialog(null, "please enter last name");
                Reset.setText("Please fill the missing things"); 
                }
                if( mobilenumber.getText().isEmpty())
                {
                   tout.setText(""); 
                resadd.setText(""); 
                //JOptionPane.showMessageDialog(null, "please enter mobile number");
                Reset.setText("Please fill the missing things");   
                }
                if(Male.isSelected() || Female.isSelected() ){
                    tout.setText(""); 
                resadd.setText(""); 
                //JOptionPane.showMessageDialog(null, "please select your gender");
                Reset.setText("Please fill the missing things");    
                }
                 if(date.getSelectedItem()== "1" && month.getSelectedItem()=="Jan" && year.getSelectedItem()=="1995" )
                {
                   tout.setText(""); 
                resadd.setText(""); 
                //JOptionPane.showMessageDialog(null, "please choice your date of birth");
                Reset.setText("Please fill the missing things");   
                }
                if(faculty.getSelectedItem()=="Select Faculty")
                {
                   tout.setText(""); 
                resadd.setText(""); 
                //JOptionPane.showMessageDialog(null, "please choice your faculty");
                Reset.setText("Please fill the missing things");   
                }
                if(address.getText().isEmpty())
                {
                   tout.setText(""); 
                resadd.setText(""); 
                //JOptionPane.showMessageDialog(null, "please enter address");
                Reset.setText("Please fill the missing things");   
                }
                else{
                String data1; 
                String data 
                    = "First Name : "
                      + fName.getText() + "\n"
                        +"Last Name : "+ lName.getText() + "\n"
                      + "Mobile Number : "
                      + mobilenumber.getText() + "\n"; 
                if (Male.isSelected()) 
                    data1 = "Gender : Male"
                            + "\n"; 
                else
                    data1 = "Gender : Female"
                            + "\n"; 
                String data2 
                    = "Date Of Birth : "
                      + (String)date.getSelectedItem() 
                      + "/" + (String)month.getSelectedItem() 
                      + "/" + (String)year.getSelectedItem() 
                      + "\n"; 
                /*String fac
                    = "faculty : "
                      + faculties.getSelectedItem() + "\n";*/
                String data3 = "Address : " + address.getText()+"\n";
                String data4="           Log In Information "+"\n";
                String data5="Your UserName: "+fName.getText()+"\n";
                String data6="Your Password: 123"+"\n";
                tout.setText(data + data1 + data2 + data3+data4+data5+data6); 
                tout.setEditable(false); 
                Reset.setText("Registration Successfully.."); 
            } 
            }
   
            else { 
                tout.setText(""); 
                resadd.setText(""); 
                Reset.setText("Please accept the"
                            + " terms & conditions.."); 
            } 
        } 
  
        else if (e.getSource() == reset) { 
            String def = ""; 
            fName.setText(def); 
            lName.setText(def); 
            address.setText(def); 
            mobilenumber.setText(def); 
            faculty.setSelectedIndex(0);
            genderButton.clearSelection();
            Reset.setText(def); 
            tout.setText(def); 
            term.setSelected(false); 
            date.setSelectedIndex(0); 
            month.setSelectedIndex(0); 
            year.setSelectedIndex(0); 
            resadd.setText(def); 
        } 
        else if(e.getSource()== skip)
        {
            setVisible(false);
            idandPasswords s = new idandPasswords();       
            login bla=new login((s.logininfo));
        }
    } 
}
