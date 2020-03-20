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
public class ShowStoreTest {
    
    public ShowStoreTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @Test
    public void testName() {
        ShoeStore aShoeStore = new ShoeStore();
        if (aShoeStore.getShoeList().size() > 0) {
            assertTrue(true);
        } else {
            assertTrue(false);
        }
    }
        
    
}
