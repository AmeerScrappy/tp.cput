/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ameer.tp.cput.calculator;

import org.testng.Assert;
import static org.testng.Assert.*;
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
    
    public CalculatorTest() {
       
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void add() {
     
         Assert.assertEquals(service.add(5, 6), 11);
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
