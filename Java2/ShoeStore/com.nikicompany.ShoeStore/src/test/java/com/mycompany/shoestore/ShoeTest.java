/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shoestore;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author niki
 */
public class ShoeTest {
    
    private static String TEST_STRING = "test";
    private int TEST_INT = 0;
    public ShoeTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }    
    @Test
    public void testName() {
        Shoe aShoe = new Shoe();
        aShoe.setName(TEST_STRING);
        assertTrue(aShoe.getName().equals(TEST_STRING));
    }
    
    @Test
    public void testSize() {
        Shoe aShoe = new Shoe();
        aShoe.setSize(TEST_INT);
        assertTrue(aShoe.getSize() == TEST_INT);
    }
    
    @Test
    public void testModel() {
        Shoe aShoe = new Shoe();
        aShoe.setModel(TEST_STRING);
        assertTrue(aShoe.getModel().equals(TEST_STRING));
    }
    
}
