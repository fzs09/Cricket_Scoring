/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a
 */
public class Bowling {
    
    int balls = 0;
    double overs = 0;
    int wickets = 0;
    
    void setBalls(int b){
    
        balls = b;
    }
    
    int getBalls(){
    
        return balls;
    }
    
    void setOvers(int b){
        if(b==6)
    
        overs = overs + 1;
    }
    
    double getOvers(){
    
        return overs;
    }
    
    void setWickets(){
    
        wickets = wickets + 1;
    }
    
    int getWickets(){
    
        return wickets;
    }
    
    
}
