/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zed
 */
public class LyyraCard {
    private double balance;
    public LyyraCard (double balanceAtStart){
       this.balance=balanceAtStart; 
    }
     public String toString() {
        // write code here
         return "The card has " + this.balance + " euros";
    }
     public void payEconomical() {
    // write code here
        if(this.balance>=2.50){
            balance-=2.50;
        }
    }

    public void payGourmet() {
    // write code here
        if(this.balance>=4.0){
            balance-=4.0;
        }
        
    }
    public void loadMoney(double amount){
        if (this.balance + amount>=150 && amount>0){
            this.balance = 150;
        }
        else if(amount>0) {
            this.balance +=amount;
        }
    }
    
}
