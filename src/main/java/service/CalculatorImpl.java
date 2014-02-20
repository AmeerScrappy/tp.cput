/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

/**
 *
 * @author student
 */
public class CalculatorImpl implements CalculatorService{

    public int addInt(int a, int b) {
        
        return a + b;
    }
      
    public double addDouble(double a, double b){
        
        return a + b;
    }

    public boolean checkNum(int a, int b) {
        
        return a == b;
    }
    
    public boolean checkObj(Object a, Object b){
        return a == b;
    }

    public boolean checkTrue(boolean a) {
    
               
        if(5 == 5){
            a = true;
        }
        
        return a;
    }
    
    public boolean checkFalse(boolean a) {
    
               
        if(5 == 5){
            a = false;
        }
        
        return a;
    }
    
    public String checkNotNull(String a){
        
        return a;
    }
    
    public Integer checkNull(Integer a){
        
        return a;
    }

    public String failPass(String a) {
    
        return a;
    }
}
