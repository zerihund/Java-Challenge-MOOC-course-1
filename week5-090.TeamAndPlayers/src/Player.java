/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zed
 */

public class Player {
    private String name;
    private int amount;
    public Player (String name){
        this.name = name;
    }
    
    public Player (String name,int amount){
        this.name = name;
        this.amount=amount;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int goals(){
        return this.amount;
    }
    
    public String toString(){
        return "Player:" + getName() + ",goals " + goals();
    }
}
