/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */          

package com.ameer.tp.cput.calculator;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import service.CalculatorImpl;
import service.CalculatorService;

/**
 *
 * @author student
 */
public class CalculatorTest {
    
    public static CalculatorService service;
    
    String word;
    Integer number;
    String msg;
    
    public CalculatorTest() {
       
        word = "Something";
        msg = "Deliberate fail";
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void AssertNumbers() {
     
         Assert.assertEquals(service.addInt(5, 6), 11);
         Assert.assertEquals(service.addDouble(5.0, 6.0), 11.0);
     }

     @Test
     public void AssertComparison(){
         
         Assert.assertSame(service.checkNum(5, 5), true);
         Assert.assertNotSame(service.checkNum(5, 5), false);
     }
     
     @Test
     public void AssertTruth(){
         
         Assert.assertTrue(service.checkTrue(false));
     }
     
     @Test
     public void AssertFalse(){
         
         Assert.assertFalse(service.checkFalse(false));
     }
     
     @Test
     public void AssertNull(){
         
         Assert.assertNotNull(service.checkNotNull(word));
         Assert.assertNull(service.checkNull(number));
         
     }
     
     @Test
     public void AssertFail(){
         Assert.fail(service.failPass(msg));
     }
     
    @BeforeClass
    public static void setUpClass() throws Exception {
        
        service = new  CalculatorImpl();
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        
        
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
