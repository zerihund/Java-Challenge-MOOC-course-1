/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zed
 */
import java.util.Random;
public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starLastPrint=0;
    public NightSky(double density,int width, int height ){
        this.density = density;
        this.width = width;
        this.height =height;  
    }
    
    public NightSky(double density){
        this(density,20,10);                                                                                                         
    }
    
    public NightSky(int width, int height){
        this(0.1,width,height);
    }
    
    public void printLine(){
        Random random = new Random();
        for(int i=0;i<width;i++){
            double prob = random.nextDouble();
            if(prob>this.density){
                System.out.print(" ");
            }
            else{
                System.out.print("*");
                starLastPrint++;
            }
        }
    
    }
    
    public void print(){
        starLastPrint=0;
        for(int i=0;i<this.height;i++){
            printLine();
        }
        System.out.println("");
    }
    
    public int starsInLastPrint(){
        return starLastPrint;
    }
    
}
