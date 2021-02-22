/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.system;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Rawan
 */
public class Students 
        extends Administrator{
    private String faculty;
     private int ID;
     RandomAccessFile StudentSignUpInfo=new RandomAccessFile("StudentSignUpInfo.dat","rw");
     public Students()throws FileNotFoundException{
          ID=0;
        faculty=" ";
       
     }
    public void AddFirstName(){
        try {
         StudentSignUpInfo.writeBytes("First Name: "); 
         StudentSignUpInfo.writeBytes(FirstName);
        }
        catch (IOException InputMismatchException) {
                       System.out.println("first name not entered"+ InputMismatchException );
        }
    }
     public void AddLastName(){
        try {
         StudentSignUpInfo.writeBytes(System.getProperty("line.separator"));
         StudentSignUpInfo.writeBytes("Last Name: "); 
         StudentSignUpInfo.writeBytes(LastName);
        }
        catch (IOException InputMismatchException) {
                       System.out.println("last name not entered"+ InputMismatchException );
        }
    }
         public void AddMobileNumber(){
        try {
         StudentSignUpInfo.writeBytes(System.getProperty("line.separator"));
         StudentSignUpInfo.writeBytes("mobile number: "); 
         StudentSignUpInfo.writeByte(MobileNumber);
        }
        catch (IOException InputMismatchException) {
                       System.out.println("mobile number not entered"+ InputMismatchException );
        }
    }
    public void AddMail(){
        try {
         StudentSignUpInfo.writeBytes(System.getProperty("line.separator"));
         StudentSignUpInfo.writeBytes("mail: "); 
         StudentSignUpInfo.writeBytes(mail);
        }
        catch (IOException InputMismatchException) {
                       System.out.println("mail not entered"+ InputMismatchException );
        }
    }
      public void SetID(int id)
    {
        ID=id;
    }
    public int GetID(){
       return ID;
    }
    public void AddID(){
        try {
            StudentSignUpInfo.writeBytes(System.getProperty("line.separator"));
         StudentSignUpInfo.writeBytes("ID: "); 
         StudentSignUpInfo.writeByte(ID);
        }
        catch (IOException InputMismatchException) {
                       System.out.println("user name not entered"+ InputMismatchException );
        }
    }
        public void SetFaculty(String F)
    {
        faculty=F;
    }
        public String GetFaculty()
        {
            return faculty;
        }
    public void AddFaculty(){
        try {
         StudentSignUpInfo.writeBytes(System.getProperty("line.separator"));
         StudentSignUpInfo.writeBytes("faculty: "); 
         StudentSignUpInfo.writeBytes(faculty);
        }
        catch (IOException InputMismatchException) {
                       System.out.println("faculty not entered"+ InputMismatchException );
        }
    }
  public void AddUserName(){
        try {
         StudentSignUpInfo.writeBytes(System.getProperty("line.separator"));
         StudentSignUpInfo.writeBytes("UserName: "); 
         StudentSignUpInfo.writeBytes(username);
        }
        catch (IOException InputMismatchException) {
                       System.out.println("user name not entered"+ InputMismatchException );
        }
    }
      public void AddPassword(){
        try {
            StudentSignUpInfo.writeBytes(System.getProperty("line.separator"));
         StudentSignUpInfo.writeBytes("password: ");
         StudentSignUpInfo.writeBytes(password);
          StudentSignUpInfo.close();
        }
        catch (IOException InputMismatchException) {
                       System.out.println("password not entered"+ InputMismatchException );
        }
    }
    private void RandomAccessFile(String studentSignUpInfodat, String rw) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}