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
public class Courses 
extends JFrame 
        implements ActionListener
{
     private Container con; 
    private JLabel Title; 
    public JLabel Faculty; 
    public JComboBox faculties; 
    public JLabel Year; 
     public JComboBox years; 
   private JLabel Subjects;
     private JComboBox subj;
     public JLabel Next;
     public JButton next;
     public JLabel Continue;
     public JButton continues; 
     
   private String fac[]
           ={
    "select your faculty","Computer sceince","Alsun","Pharmacy","Dentistry",
            "Mass Communication","Bussiness", " Engineering" };
   
      private String cs[]
           ={"select your year","Freshman year","Sophomores year","junior year","senior year" };
      private String als[]
           ={"select your year","Freshman year","Sophomores year","junior year","senior year" };
      private String ph[]
           ={"select your year","first year","second year","third year","forth year","senior year" };
      private String den[]
           ={"select your year","first year","second year","third year","forth year","fifth year","senior year" };
        private String eng[]
           ={ "select your year","first year","second year","third year","forth year","senior year" };
          private String masscom[]
           ={"select your year","Freshman year","Sophomores year","junior year","senior year"};
             private String buss[]
           ={"select your year","Freshman year","Sophomores year","junior year","senior year"};
             
           private String csSub1[]          ={
        "1.Object Oriented Programming CSC140","2.IntroductionToComputerSceince CSC120","3.DataStructureAndAlgorithm CSC110","4.Mathematics BAS110",
        "5.Proability BAS110"};  
            private String csSub2[]          ={
        "1.Object Oriented Programming CSC240","2.IntroductionToComputerSceince CSC220","3.DataStructureAndAlgorithm CSC210","4.Mathematics BAS210",
        "5.Proability BAS110"}; 
        private String csSub3[]          ={
        "1.Object Oriented Programming CSC340","2.IntroductionToComputerSceince CSC320","3.DataStructureAndAlgorithm CSC310","4.Mathematics BAS310",
        "5.Proability BAS110"};
        private String csSub4[]          ={
        "1.Object Oriented Programming CSC440","2.IntroductionToComputerSceince CSC420","3.DataStructureAndAlgorithm CSC410","4.Mathematics BAS410",
        "5.Proability BAS410"}; 
        
            private String AlSub1[] ={
           "1.Translation ENG130","2.Introduction to research methods REM100",
           "3.Sociolinguistics ENG121","4.Freshman 1 ENG101",
           "5.English Litreture ENG101" };
           private String AlSub2[] ={
           "1.Translation ENG230","2.Introduction to research methods REM200",
           "3.Sociolinguistics ENG221","course code:","4.Freshman 1 ENG101",
           "5.English Litreture ENG201" };
            private String AlSub3[] ={
           "1.Translation ENG330","2.Introduction to research methods REM300",
           "3.Sociolinguistics ENG321","4.Freshman 1 ENG301",
           "5.English Litreture ENG301" };
                private String AlSub4[] ={
           "1.Translation ENG430","2.Introduction to research methods REM400",
           "3.Sociolinguistics ENG421","4.Freshman 1 ENG401",
           "5.English Litreture ENG401" };
           
          private String BussSub1[]       ={
          "1.Intermediate Accounting ACT102","2.Research methodology MGT101","3.Bussiness Law MGT101",
          "4.Principle of statistics for bussiness STA102","5.Freshman 2 ENG102 "};                  
          private String BussSub2[]       ={
          "1.Intermediate Accounting ACT202","2.Research methodology MGT201","3.Bussiness Law MGT201",
          "4.Principle of statistics for bussiness STA202","5.Freshman 2 ENG202 "};                  
           private String BussSub3[]       ={
          "1.Intermediate Accounting ACT302","2.Research methodology MGT301","3.Bussiness Law MGT201",
          "4.Principle of statistics for bussiness STA202","5.Freshman 2 ENG102 "};  
           private String BussSub4[]       ={
          "1.Intermediate Accounting ACT402","2.Research methodology MGT401","3.Bussiness Law MGT401",
          "4.Principle of statistics for bussiness STA402","5.Freshman 2 ENG402 "}; 
           
            private String PharSub1[]  
                    ={"1.General Physiology GDN103","2.Computer Application for social sciences SOC104",
              "3.General pathology GDN102","4.Microbiology & Basic Immunology GDN101","5.Oral histology and Embryology HPT101"};          
           private String PharSub2[]  
                   ={"1.General Physiology GDN203","2.Computer Application for social sciences SOC204",
              "3.General pathology GDN202","4.Microbiology & Basic Immunology GDN201","5.Oral histology and Embryology HPT201"};
           private String PharSub3[]  
                   ={"1.General Physiology GDN303","2.Computer Application for social sciences SOC304",
              "3.General pathology GDN302","4.Microbiology & Basic Immunology GDN301","5.Oral histology and Embryology HPT301"};
            private String PharSub4[] 
                    ={"1.General Physiology GDN403","2.Computer Application for social sciences SOC404",
              "3.General pathology GDN402","4.Microbiology & Basic Immunology GDN401","5.Oral histology and Embryology HPT401"};
           private String PharSub5[]  
                   ={"1.General Physiology GDN503","2.Computer Application for social sciences SOC504",
              "3.General pathology GDN502","4.Microbiology & Basic Immunology GDN501","5.Oral histology and Embryology HPT501"};
           
           private String DenSub1[]
                   ={"1.General Physiology GDN103","2.Computer Application for social sciences SOC104",
                    "3.General pathology GDN102","4.Microbiology & Basic Immunology GDN101","5.Oral histology and Embryology HPT101"}; 
             private String DenSub2[]
                   ={"1.General Physiology GDN203","2.Computer Application for social sciences SOC204",
                    "3.General pathology GDN202","4.Microbiology & Basic Immunology GDN201","5.Oral histology and Embryology HPT201"}; 
            private String DenSub3[]
                   ={"1.General Physiology GDN303","2.Computer Application for social sciences SOC34",
                    "3.General pathology GDN302","4.Microbiology & Basic Immunology GDN301","5.Oral histology and Embryology HPT301"}; 
            private String DenSub4[]
                   ={"1.General Physiology GDN403","2.Computer Application for social sciences SOC404",
                    "3.General pathology GDN402","4.Microbiology & Basic Immunology GDN401","5.Oral histology and Embryology HPT401"}; 
             private String DenSub5[]
                   ={"1.General Physiology GDN503","2.Computer Application for social sciences SOC504",
                    "3.General pathology GDN502","4.Microbiology & Basic Immunology GDN501","5.Oral histology and Embryology HPT501"}; 
             private String DenSub6[]
                   ={"1.General Physiology GDN603","2.Computer Application for social sciences SOC604",
                    "3.General pathology GDN602","4.Microbiology & Basic Immunology GDN601","5.Oral histology and Embryology HPT601"}; 
             
           private String MassComSub1[]
                   ={"1.Computer Application COM111","2.Arabic ARB101","3.history HIS106",
                    "4.English FEA2","5.Introduction to computer COM100"};  
            private String MassComSub2[]
                   ={"1.Computer Application COM211","2.Arabic ARB201","3.history HIS206",
                    "4.English FEA2","5.Introduction to computer COM200"};  
            private String MassComSub3[]
                   ={"1.Computer Application COM311","2.Arabic ARB301","3.history HIS306",
                    "4.English FEA2","5.Introduction to computer COM300"};  
            private String MassComSub4[]
                   ={"1.Computer Application COM411","2.Arabic ARB401","3.history HIS406",
                    "4.English FEA2","5.Introduction to computer COM400"};  
            
           private String EngSub1[]
                     ={"1.General Physiology GDN103","2.Computer Application for social sciences SOC104",
                    "3.General pathology GDN102","4.M GDN101","5.mathimatics107"};  
            private String EngSub2[]
                     ={"1.General Physiology GDN203","2.Computer Application for social sciences SOC204",
                    "3.General pathology GDN202","4.M GDN201","5.mathimatics207"};  
            private String EngSub3[]
                     ={"1.General Physiology GDN303","2.Computer Application for social sciences SOC304",
                    "3.General pathology GDN302","4.M GDN301","5.mathimatics307"};  
            private String EngSub4[]
                     ={"1.General Physiology GDN403","2.Computer Application for social sciences SOC404",
                    "3.General pathology GDN402","4.M GDN401","5.mathimatics407"};  
            private String EngSub5[]
                     ={"1.General Physiology GDN503","2.Computer Application for social sciences SOC504",
                    "3.General pathology GDN502","4.M GDN501","5.mathimatics507"};  
  public Courses(){
     setTitle("Choose Your Faculty"); 
        setBounds(300, 90, 900, 600); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(true); 
        setVisible(true);
         con = getContentPane(); 
        con.setLayout(null); 
  
        Title = new JLabel("Choose Your Faculty"); 
        Title.setFont(new Font("Arial", Font.PLAIN, 30)); 
        Title.setSize(300, 30); 
        Title.setLocation(300, 30); 
        con.add(Title); 

        Faculty = new JLabel("Faculties");  
        Faculty.setFont(new Font("Arial", Font.PLAIN, 20)); 
        Faculty.setSize(100, 20); 
        Faculty.setLocation(100, 100); 
        con.add(Faculty); 
        
        faculties = new JComboBox(fac); 
        faculties.setFont(new Font("Arial", Font.PLAIN, 15)); 
        faculties.setSize(150, 35); 
        faculties.setLocation(220,100 ); 
        con.add(faculties); 
        faculties.addActionListener(this);
        
        Year = new JLabel("years");  
        Year.setFont(new Font("Arial", Font.PLAIN, 20)); 
        Year.setSize(100, 20); 
        Year.setLocation(100, 200); 
        con.add(Year); 
        
        Next = new JLabel(""); 
        Next.setFont(new Font("Arial", Font.PLAIN, 20)); 
        Next.setSize(500, 25); 
        Next.setLocation(500, 200); 
        con.add(Next); 
        
        next = new JButton("Next"); 
        next.setFont(new Font("Arial", Font.PLAIN, 15)); 
        next.setSize(100, 20); 
        next.setLocation(500, 225); 
        next.addActionListener(this); 
        con.add(next);
        
        Subjects = new JLabel("Subjects");  
        Subjects.setFont(new Font("Arial", Font.PLAIN, 20)); 
        Subjects.setSize(100, 20); 
        Subjects.setLocation(100, 300); 
        con.add(Subjects); 
        
        Continue= new JLabel(""); 
        Continue.setFont(new Font("Arial", Font.PLAIN, 20)); 
        Continue.setSize(500, 25); 
        Continue.setLocation(500, 200); 
        con.add(Continue); 
        
        continues = new JButton("Continue"); 
        continues.setFont(new Font("Arial", Font.PLAIN, 15)); 
        continues.setSize(100, 20); 
        continues.setLocation(200, 500); 
        continues.addActionListener(this); 
        con.add(continues);
  }   
  public void actionPerformed(ActionEvent e) 
    { 
        if(e.getSource()!=next)
        {
     if(faculties.getSelectedItem()=="Computer sceince")
               {
                years = new JComboBox(cs); 
                years.setFont(new Font("Arial", Font.PLAIN, 15)); 
                years.setSize(150, 35); 
                years.setLocation(200, 200); 
                con.add(years); 
                }
     if(faculties.getSelectedItem()=="Alsun")
              {
               years = new JComboBox(als); 
               years.setFont(new Font("Arial", Font.PLAIN, 15)); 
               years.setSize(150, 35); 
               years.setLocation(200, 200); 
               con.add(years);
               }
     if(faculties.getSelectedItem()=="Pharmacy")
              {
               years = new JComboBox(ph); 
               years.setFont(new Font("Arial", Font.PLAIN, 15)); 
               years.setSize(150, 35); 
               years.setLocation(200, 200); 
               con.add(years);
               }
     if(faculties.getSelectedItem()=="Bussiness")
               {
                 years = new JComboBox(buss); 
                 years.setFont(new Font("Arial", Font.PLAIN, 15)); 
                 years.setSize(150, 35); 
                 years.setLocation(200, 200); 
                 con.add(years); 
                }
     if(faculties.getSelectedItem()=="Mass Communication")
                {
                 years = new JComboBox(masscom); 
                 years.setFont(new Font("Arial", Font.PLAIN, 15)); 
                 years.setSize(150, 35); 
                 years.setLocation(200, 200); 
                 con.add(years); 
                }
     if(faculties.getSelectedItem()=="Dentistry")
                {
                 years = new JComboBox(den); 
                 years.setFont(new Font("Arial", Font.PLAIN, 15)); 
                 years.setSize(150, 35); 
                 years.setLocation(200, 200); 
                 con.add(years); 
                }
     if(faculties.getSelectedItem()=="Engineering")
                {
                 years = new JComboBox(eng); 
                 years.setFont(new Font("Arial", Font.PLAIN, 15)); 
                 years.setSize(150, 35); 
                 years.setLocation(200, 200); 
                 con.add(years); 
                }
        }

        else if(e.getSource()==next){

           if(faculties.getSelectedItem()=="Computer sceince" )
               {
//        Subjects = new JLabel("Subjects");  
//        Subjects.setFont(new Font("Arial", Font.PLAIN, 20)); 
//        Subjects.setSize(100, 20); 
//        Subjects.setLocation(100, 300); 
//        con.add(Subjects); 
                   if(years.getSelectedItem()=="Freshman year")
                   {        
                subj = new JComboBox(csSub1); 
                subj.setFont(new Font("Arial", Font.PLAIN, 15)); 
                subj.setSize(350, 50); 
                subj.setLocation(200, 300); 
                 con.add(subj);
                
               ComputerScience cs=new ComputerScience("Computer sceince");
                   }
                else if(years.getSelectedItem()=="Sophomores year")
                        {
                subj = new JComboBox(csSub2); 
                subj.setFont(new Font("Arial", Font.PLAIN, 15)); 
                subj.setSize(350, 50); 
                subj.setLocation(200, 300); 
                con.add(subj); 
                
                ComputerScience cs=new ComputerScience("Computer sceince");
                        }
               else if(years.getSelectedItem()=="junior year")
                        {
                  subj = new JComboBox(csSub3); 
                subj.setFont(new Font("Arial", Font.PLAIN, 15)); 
                subj.setSize(350, 50); 
                subj.setLocation(200, 300); 
                con.add(subj);
                
               // ComputerScience cs=new ComputerScience("Computer sceince");
                        }
                else if(years.getSelectedItem()=="senior year")
                        {
                subj = new JComboBox(csSub4); 
                subj.setFont(new Font("Arial", Font.PLAIN, 15)); 
                subj.setSize(350, 50); 
                subj.setLocation(200, 300); 
                con.add(subj); 
//                if(subj.getSelectedItem()=="1.Object Oriented Programming CSC440"|| subj.getSelectedItem()=="2.IntroductionToComputerSceince CSC420"
//                        || subj.getSelectedItem()=="3.DataStructureAndAlgorithm CSC410"|| subj.getSelectedItem()=="4.Mathematics BAS410"
//                        || subj.getSelectedItem()=="5.Proability BAS410")
//                {
//                 ComputerScience cs=new ComputerScience("Computer sceince");   
//                }
                 
                        }

                }
     else if(faculties.getSelectedItem()=="Alsun")
              {
                    if(years.getSelectedItem()=="Freshman year")
                   {        
                subj = new JComboBox(AlSub1); 
                subj.setFont(new Font("Arial", Font.PLAIN, 15)); 
                subj.setSize(350, 50); 
                subj.setLocation(200, 300); 
                con.add(subj);
                   }
                else if(years.getSelectedItem()=="Sophomores year")
                        {
                subj = new JComboBox(AlSub2); 
                subj.setFont(new Font("Arial", Font.PLAIN, 15)); 
                subj.setSize(350, 50); 
                subj.setLocation(200, 300); 
                con.add(subj);                      
                        }
               else if(years.getSelectedItem()=="junior year")
                        {
                  subj = new JComboBox(AlSub3); 
                subj.setFont(new Font("Arial", Font.PLAIN, 15)); 
                subj.setSize(350, 50); 
                subj.setLocation(200, 300); 
                con.add(subj);                      
                        }
                else if(years.getSelectedItem()=="senior year")
                        {
                subj = new JComboBox(AlSub2); 
                subj.setFont(new Font("Arial", Font.PLAIN, 15)); 
                subj.setSize(350, 50); 
                subj.setLocation(200, 300); 
                con.add(subj);                      
                        }
               }
       else if(faculties.getSelectedItem()=="Bussiness")
               {  
                if(years.getSelectedItem()=="Freshman year")
                   {                         
                 subj = new JComboBox(BussSub1); 
                 subj.setFont(new Font("Arial", Font.PLAIN, 15)); 
                 subj.setSize(350, 50); 
                 subj.setLocation(200, 300); 
                 con.add(subj); 
                   }
                else if(years.getSelectedItem()=="Sophomores year")
                        {
                 subj = new JComboBox(BussSub2); 
                 subj.setFont(new Font("Arial", Font.PLAIN, 15)); 
                 subj.setSize(350, 50); 
                 subj.setLocation(200, 300); 
                 con.add(subj);                     
                        }
               else if(years.getSelectedItem()=="junior year")
                        {
                 subj = new JComboBox(BussSub3); 
                 subj.setFont(new Font("Arial", Font.PLAIN, 15)); 
                 subj.setSize(350, 50); 
                 subj.setLocation(200, 300); 
                 con.add(subj);                
                        }
                else if(years.getSelectedItem()=="senior year")
                        {
                 subj = new JComboBox(BussSub4); 
                 subj.setFont(new Font("Arial", Font.PLAIN, 15)); 
                 subj.setSize(350, 50); 
                 subj.setLocation(200, 300); 
                 con.add(subj);                      
                        }
 
                }
       else if(faculties.getSelectedItem()=="Mass Communication")
                {
               if(years.getSelectedItem()=="Freshman year")
                   {                         
                 subj = new JComboBox(MassComSub1); 
                 subj.setFont(new Font("Arial", Font.PLAIN, 15)); 
                 subj.setSize(350, 50); 
                 subj.setLocation(200, 300); 
                 con.add(subj); 
                   }
                else if(years.getSelectedItem()=="Sophomores year")
                        {
                 subj = new JComboBox(MassComSub2); 
                 subj.setFont(new Font("Arial", Font.PLAIN, 15)); 
                 subj.setSize(350, 50); 
                 subj.setLocation(200, 300); 
                 con.add(subj);                   
                        }
               else if(years.getSelectedItem()=="junior year")
                        {
                 subj = new JComboBox(MassComSub3); 
                 subj.setFont(new Font("Arial", Font.PLAIN, 15)); 
                 subj.setSize(350, 50); 
                 subj.setLocation(200, 300); 
                 con.add(subj);           
                        }
                else if(years.getSelectedItem()=="senior year")
                        {
                 subj = new JComboBox(MassComSub4); 
                 subj.setFont(new Font("Arial", Font.PLAIN, 15)); 
                 subj.setSize(350, 50); 
                 subj.setLocation(200, 300); 
                 con.add(subj);                  
                        }
                }
        else if(faculties.getSelectedItem()=="Dentistry")
                {
                if(years.getSelectedItem()=="first year")
                   {                         
                 subj = new JComboBox(DenSub1); 
                 subj.setFont(new Font("Arial", Font.PLAIN, 15)); 
                 subj.setSize(350, 50); 
                 subj.setLocation(200, 300); 
                 con.add(subj); 
                   }
                else if(years.getSelectedItem()=="second year")
                        {
                 subj = new JComboBox(DenSub2); 
                 subj.setFont(new Font("Arial", Font.PLAIN, 15)); 
                 subj.setSize(350, 50); 
                 subj.setLocation(200, 300); 
                 con.add(subj);                
                        }
               else if(years.getSelectedItem()=="third year")
                        {
                 subj = new JComboBox(DenSub3); 
                 subj.setFont(new Font("Arial", Font.PLAIN, 15)); 
                 subj.setSize(350, 50); 
                 subj.setLocation(200, 300); 
                 con.add(subj);          
                        }
                else if(years.getSelectedItem()=="forth year")
                        {
                 subj = new JComboBox(DenSub4); 
                 subj.setFont(new Font("Arial", Font.PLAIN, 15)); 
                 subj.setSize(350, 50); 
                 subj.setLocation(200, 300); 
                 con.add(subj);                 
                        }

                else if(years.getSelectedItem()=="fifth year")
                        {
                 subj = new JComboBox(DenSub4); 
                 subj.setFont(new Font("Arial", Font.PLAIN, 15)); 
                 subj.setSize(350, 50); 
                 subj.setLocation(200, 300); 
                 con.add(subj);                 
                        }
                else if(years.getSelectedItem()=="senior year")
                        {
                 subj = new JComboBox(DenSub4); 
                 subj.setFont(new Font("Arial", Font.PLAIN, 15)); 
                 subj.setSize(350, 50); 
                 subj.setLocation(200, 300); 
                 con.add(subj);                 
                        }
                }
        else if(faculties.getSelectedItem()=="Pharmacy")
                {  
                 if(years.getSelectedItem()=="first year")
                   {                         
                 subj = new JComboBox(PharSub1); 
                 subj.setFont(new Font("Arial", Font.PLAIN, 15)); 
                 subj.setSize(350, 50); 
                 subj.setLocation(200, 300); 
                 con.add(subj); 
                   }
                else if(years.getSelectedItem()=="second year")
                        {
                  subj = new JComboBox(PharSub2); 
                 subj.setFont(new Font("Arial", Font.PLAIN, 15)); 
                 subj.setSize(350, 50); 
                 subj.setLocation(200, 300); 
                 con.add(subj);             
                        }
               else if(years.getSelectedItem()=="third year")
                        {
                 subj = new JComboBox(PharSub3); 
                 subj.setFont(new Font("Arial", Font.PLAIN, 15)); 
                 subj.setSize(350, 50); 
                 subj.setLocation(200, 300); 
                 con.add(subj);           
                        }
                else if(years.getSelectedItem()=="forth year")
                        {
                 subj = new JComboBox(PharSub4); 
                 subj.setFont(new Font("Arial", Font.PLAIN, 15)); 
                 subj.setSize(350, 50); 
                 subj.setLocation(200, 300); 
                 con.add(subj);                 
                        }
                else if(years.getSelectedItem()=="senior year")
                        {
                 subj = new JComboBox(PharSub5); 
                 subj.setFont(new Font("Arial", Font.PLAIN, 15)); 
                 subj.setSize(350, 50); 
                 subj.setLocation(200, 300); 
                 con.add(subj);                
                        }

                }
        else if(faculties.getSelectedItem()=="Engineering")
                {
               if(years.getSelectedItem()=="first year")
                   {                         
                  subj = new JComboBox(EngSub1); 
                 subj.setFont(new Font("Arial", Font.PLAIN, 15)); 
                 subj.setSize(350, 50); 
                 subj.setLocation(200, 300); 
                 con.add(subj); 
                   }
                else if(years.getSelectedItem()=="second year")
                        {
                 subj = new JComboBox(EngSub2); 
                 subj.setFont(new Font("Arial", Font.PLAIN, 15)); 
                 subj.setSize(350, 50); 
                 subj.setLocation(200, 300); 
                 con.add(subj);              
                        }
               else if(years.getSelectedItem()=="third year")
                        {
                 subj = new JComboBox(EngSub3); 
                 subj.setFont(new Font("Arial", Font.PLAIN, 15)); 
                 subj.setSize(350, 50); 
                 subj.setLocation(200, 300); 
                 con.add(subj);           
                        }
                else if(years.getSelectedItem()=="forth year")
                        {
                 subj = new JComboBox(EngSub4); 
                 subj.setFont(new Font("Arial", Font.PLAIN, 15)); 
                 subj.setSize(350, 50); 
                 subj.setLocation(200, 300); 
                 con.add(subj);              
                        }
                else if(years.getSelectedItem()=="senior year")
                        {
                 subj = new JComboBox(EngSub5); 
                 subj.setFont(new Font("Arial", Font.PLAIN, 15)); 
                 subj.setSize(350, 50); 
                 subj.setLocation(200, 300); 
                 con.add(subj);              
                        } 
                }
        }
         if(e.getSource()==continues)
        {
             if(faculties.getSelectedItem()=="Computer sceince")
               {
                   setVisible(false);
              ComputerScience cs=new ComputerScience("Computer sceince"); 
                }
     if(faculties.getSelectedItem()=="Alsun")
              {
                  setVisible(false);
               Alsun a=new Alsun("Alsun"); 
               }
     if(faculties.getSelectedItem()=="Pharmacy")
              {
                  setVisible(false);
               Pharmacy p=new Pharmacy("pharamcy"); 
               }
     if(faculties.getSelectedItem()=="Bussiness")
               {
                   setVisible(false);
            Business b=new Business("Business");
                }
     if(faculties.getSelectedItem()=="Mass Communication")
                {
                    setVisible(false);
               MassCom m=new MassCom("MassCom");
                }
     if(faculties.getSelectedItem()=="Dentistry")
                {
                    setVisible(false);
                Dentistry d=new Dentistry("Dentistry"); 
                }
     if(faculties.getSelectedItem()=="Engineering")
                {
                    setVisible(false);
                Engineering d=new Engineering("Engineering"); 
                }
    } 
}}
