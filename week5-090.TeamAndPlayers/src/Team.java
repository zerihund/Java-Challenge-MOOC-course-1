/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zed
 */
import java.util.ArrayList;
public class Team {
    private String name;
    private ArrayList<Player> players = new ArrayList<Player>();
    private int maxSize;
    
    public Team(String name){
        this.name = name;
        this.maxSize = 16;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void addPlayer(Player player){
        players.add(player);
    }
    
    public void printPlayers(){
        if(players.size()<this.maxSize){
            for(Player x:players){
                System.out.println(x);
            }
        }
    }
    
    public void setMaxSize(int maxSize){
        this.maxSize=maxSize;
    }
    
    public int size(){
        if(this.maxSize<this.players.size())
            return this.maxSize;
        else
            return this.players.size();
    }
    
    public int goals(){
        int buffer = 0;
        
        for (Player i : this.players){
            buffer += i.goals();
        }
        
        return buffer;
    }
    
    
}
