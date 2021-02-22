/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.system;
import java.util.HashMap;
/**
 *
 * @author Rawan
 */
public class idandPasswords {
    HashMap<String,String> logininfo=new HashMap<String,String>();
    idandPasswords (){
      logininfo.put("nour", "123");
      logininfo.put("rawan", "123");
      logininfo.put("jomana", "123");
      logininfo.put("yasmine", "123");
      logininfo.put("nesma", "123");
      logininfo.put("walaa", "123");
      logininfo.put("randa", "123");
         logininfo.put("maha", "123");
    }
   
    public HashMap getlogininfo(){
        return logininfo;
    }
}
