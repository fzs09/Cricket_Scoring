/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a
 */
import java.util.*;
public class batsMan {
    
    String name = null;
    int status = 0;
    int runs = 0;
    boolean out = false;
    int ballsPlayed = 0;
    int fours = 0;
    int sixes = 0;
    int dots = 0;
    
    
    Scanner kb = new Scanner(System.in);
    
    void setName(String n){
       
    
        name = n;
    }
    
    String getName(){
    
        return name;
    }
    
    void setRun(int r){
    
        runs = runs + r;
    }
    
    int getRun(){
    
        return runs;
    }
    
    void setOut(boolean b){
    
        out = b;
    }
    
    boolean getOut(){
    
        return out;
    }
    
    void setBallsPlayed(){
    
        ballsPlayed = ballsPlayed + 1;
    }
    
    int getBallsPlayed(){
    
        return ballsPlayed;
    }
    
    void setFours(int f){
    
        if(f==4)
        fours = fours + 1;
    }
    
    int getFours(){
    
        return fours;
    }
    
    void setSixes(int s){
    
        if(s==6)
        sixes = sixes + 1;
    }
    
    int getSixes(){
    
        return sixes;
    }
    
    void setDots(int d){
    
        dots = dots + 1;
    }
    
    int getDots(){
    
        return dots;
    }
    
    void setStatus(int s){
    
        status = s;
    }
    
    int getStatus(){
    
        return status;
    }
    
    
    
}
