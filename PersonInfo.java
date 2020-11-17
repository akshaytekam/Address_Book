 
package addressbook;

import javax.swing.*;
public class PersonInfo {  
 
  String name;
    String address;
   String phoneNum;
 
//Constructor
 
   public PersonInfo(String n, String add, String phone){
 
    name = n;
    address = add;
    phoneNum = phone;  //follow namming conventiaon fo variable names
  }  // PersonInfo constructor
 
public void print(){
 
    JOptionPane.showMessageDialog(null, "Name:" +name+"Address:" +address+ "Phone No.:"+ phoneNum);
  }
 
}
