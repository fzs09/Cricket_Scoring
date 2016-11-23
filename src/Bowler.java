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
public class Bowler {
    
    Scanner kb = new Scanner(System.in);
    
    String bName = null;
    int status = 0;
    int balls = 0;
    int runs = 0;
    int wickets = 0;
    int maidens = 0;
    double economy = 0.0;
    double overs = 0.0;
    
    void setBalls(int b){
    
        balls = balls + b;
    }
    
    int getBalls(){
    
        return balls;
    }
    
    void setName(String n){
    
        bName = n;
    }
    
    String getName(){
    
        return bName;
    }
    
    void setRun(int r){
    
        runs = runs + r;
    }
    
    int getRun(){
    
        return runs;
    }
    
    void setWickets(){
    
        wickets = wickets + 1;
    }
    
    int getWickets(){
    
        return wickets;
    }
    
    void setMaidens(){
    
        maidens = maidens + 1;
    }
    
    int getMaidens(){
    
        return maidens;
    }
    
    void setOvers(int b){
        
        if(b == 6)
    
        overs = overs + 1;
    }
    
    double getOvers(){
    
        return overs;
    }
    
    void setEconomy(){
    
        economy = runs/overs;
    }
    
    double getEconomy(){
    
        return economy;
    }
    
    void setStatus(int s){
    
        status = s;
    }
    
    int getStatus(){
    
        return status;
    }
    
    
}
