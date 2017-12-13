/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail_Test;

import OregonTrail_Control.InventoryControl;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dad
 */
public class InventoryControlTest {

    public InventoryControlTest() {
    }

    /**
     * Test 1
     */
    @Test
    public void test1CalcQuantity() {
        System.out.println("Test Case 1");
        double onHand = 12;
        double items = 14;
        //double weight = 12;
        //double cost = 168;        
        InventoryControl instance = new InventoryControl();
        double expResult = 168;
        double result = instance.calcQuantity(onHand, items);//, weight, cost);
        assertEquals(expResult, result, 0.0);

    }
/**
     * Test 2
     */
    @Test
    public void test2CalcQuantity() {
        System.out.println("Test Case 2");
        double onHand = -22;
        double items = 14;
        //double weight = 12;
        //double cost = 168;        
        InventoryControl instance = new InventoryControl();
        double expResult = -1;
        double result = instance.calcQuantity(onHand, items);//, weight, cost);
        assertEquals(expResult, result, 0.0);

    }/**
     * Test 3
     */
    @Test
    public void test3CalcQuantity() {
        System.out.println("Test Case 3");
        double onHand = 12;
        double items = -14;
        //double weight = 12;
        //double cost = 168;        
        InventoryControl instance = new InventoryControl();
        double expResult = -1;
        double result = instance.calcQuantity(onHand, items);//, weight, cost);
        assertEquals(expResult, result, 0.0);

    }/**
     * Test 4
     */
    @Test
    public void test4CalcQuantity() {
        System.out.println("Test Case 4");
        double onHand = 301;
        double items = 14;
        //double weight = 12;
        //double cost = 168;        
        InventoryControl instance = new InventoryControl();
        double expResult = -1;
        double result = instance.calcQuantity(onHand, items);//, weight, cost);
        assertEquals(expResult, result, 0.0);

    }/**
     * Test 5
     */
    @Test
    public void test5CalcQuantity() {
        System.out.println("Test Case 5");
        double onHand = 2;
        double items = -301;
        //double weight = 12;
        //double cost = 168;        
        InventoryControl instance = new InventoryControl();
        double expResult = -1;
        double result = instance.calcQuantity(onHand, items);//, weight, cost);
        assertEquals(expResult, result, 0.0);

    }/**
     * Test 6
     */
    @Test
    public void test6CalcQuantity() {
        System.out.println("Test Case 1");
        double onHand = 0;
        double items = 14;
        //double weight = 12;
        //double cost = 168;        
        InventoryControl instance = new InventoryControl();
        double expResult = 0;
        double result = instance.calcQuantity(onHand, items);//, weight, cost);
        assertEquals(expResult, result, 0.0);

    }
    
}
