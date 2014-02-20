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
public interface CalculatorService {
    
   int addInt(int a, int b);
   double addDouble(double a, double b);
   boolean checkNum(int a, int b);
   boolean checkObj(Object a, Object b);
   boolean checkTrue(boolean a);
   boolean checkFalse(boolean a);
   String checkNotNull(String a);
   Integer checkNull(Integer a);
   String failPass(String a);
}
