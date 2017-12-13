/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail_Test;

import Exceptions.RiverCrossingControlException;
import OregonTrail_Control.RiverCrossingControl;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Darrin
 */
public class RiverCrossingControlTest {

    public RiverCrossingControlTest() {
    }
    /**
     * Test 1
     */
    @Test
    public void test1CalcSupplyDrop() throws RiverCrossingControlException {
        System.out.println("Test Case 1");
        double amntSuppliesDropped = 1;
        double currentSupplies = 1;
        double depth = 1;
        double multiplyer = 1;
        double speed = 1;
        double weight = 1;
        double amount = 1;        
        RiverCrossingControl instance = new RiverCrossingControl();
        double expResult = .015;
        double result = instance.calcSupplyDrop(amntSuppliesDropped, currentSupplies, depth, multiplyer, speed, weight, amount);
        assertEquals(expResult, result, 0.0);

    }
        /**
     * Test 2
     */
    @Test
    public void test2CalcSupplyDrop() throws RiverCrossingControlException {
        System.out.println("Test Case 2");
        double amntSuppliesDropped = 1;
        double currentSupplies = 1;
        double depth = 1;
        double multiplyer = 1;
        double speed = 301;
        double weight = 1;
        double amount = 1;        
        RiverCrossingControl instance = new RiverCrossingControl();
        double expResult = -1;
        double result = instance.calcSupplyDrop(amntSuppliesDropped, currentSupplies, depth, multiplyer, speed, weight, amount);
        assertEquals(expResult, result, 0.0);

    }    /**
     * Test 3
     */
    @Test
    public void test3CalcSupplyDrop() throws RiverCrossingControlException {
        System.out.println("Test Case 3");
        double amntSuppliesDropped = 1;
        double currentSupplies = 1;
        double depth = 1;
        double multiplyer = 1;
        double speed = 1;
        double weight = -1;
        double amount = 1;        
        RiverCrossingControl instance = new RiverCrossingControl();
        double expResult = -1;
        double result = instance.calcSupplyDrop(amntSuppliesDropped, currentSupplies, depth, multiplyer, speed, weight, amount);
        assertEquals(expResult, result, 0.0);

    }    /**
     * Test 4
     */
    @Test
    public void test4CalcSupplyDrop() throws RiverCrossingControlException {
        System.out.println("Test Case 4");
        double amntSuppliesDropped = 1;
        double currentSupplies = 1;
        double depth = 1;
        double multiplyer = 1;
        double speed = 1;
        double weight = 1;
        double amount = 301;        
        RiverCrossingControl instance = new RiverCrossingControl();
        double expResult = -1;
        double result = instance.calcSupplyDrop(amntSuppliesDropped, currentSupplies, depth, multiplyer, speed, weight, amount);
        assertEquals(expResult, result, 0.0);

    }    /**
     * Test 5
     */
    @Test
    public void test5CalcSupplyDrop() throws RiverCrossingControlException {
        System.out.println("Test Case 5");
        double amntSuppliesDropped = 1;
        double currentSupplies = 1;
        double depth = 1;
        double multiplyer = 1;
        double speed = 1;
        double weight = 299;
        double amount = 1;        
        RiverCrossingControl instance = new RiverCrossingControl();
        double expResult = 1.50500000000000001;
        double result = instance.calcSupplyDrop(amntSuppliesDropped, currentSupplies, depth, multiplyer, speed, weight, amount);
        assertEquals(expResult, result, 0.0);

    }
}
