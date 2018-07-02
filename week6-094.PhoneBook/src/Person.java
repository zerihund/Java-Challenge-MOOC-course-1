/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zed
 */
import java.util.AbstractList;
public class Person {
    private String name;
    private String PhoneNumber;
    
    
    public Person(String name,String phoneNumber){
        this.name= name;
        this.PhoneNumber=phoneNumber;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getNumber(){
        return this.PhoneNumber;
    }
    
    public void changeNumber(String newNumber){
        this.PhoneNumber = newNumber;
    }
    
    public String toString(){
     return getName() + " number: " + getNumber();
    }
    public void add(String name, String number){
    
    }
    
}
