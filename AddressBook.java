 
package addressbook;


import javax.swing.*;
import java.util.*;
 
class AddressBook {
ArrayList<PersonInfo> persons;
 
//constructor
      public AddressBook ( ) {
            persons = new ArrayList<>();
}
 
//add new person record to arraylist after taking input
        public void addPerson( ) {
 
String name = JOptionPane.showInputDialog("Enter your name");
String add = JOptionPane.showInputDialog("Enter your address");
String pNum = JOptionPane.showInputDialog("Enter your phone no");
 
          //construct new person object
          PersonInfo p = new PersonInfo(name, add, pNum);
 
      //add the above PersonInfo object to arraylist
      persons.add(p);
       }
 
            public void search(String name){
            
            for(int i = 0; i < persons.size(); i++){
               PersonInfo p = (PersonInfo)persons.get(i); 
               if(name.equals(p.name)){
                p.print();
                  
             }//if statment
      } //for loop
                   
   }//function search
 
              public void remove(String name){
             for(int i = 0; i < persons.size(); i++){
             PersonInfo p = (PersonInfo)persons.get(i); 
               if(name.equals(p.name)){
                persons.remove(i); }
                }
 
 
      }//remove function
 
}
