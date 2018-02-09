/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojatrabajo3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David
 */
public class RadixSortTest {
    /**
     * Test of getMax method, of class RadixSort.
     */
    private int [] araysortest = {5,4,3,2,1};
    
    /**
     * Test of radixsort method, of class RadixSort.
     */
    @Test
    public void testRadixsort() {
        int[] arr = araysortest;
        int n = 5;
        RadixSort.radixsort(araysortest, n);
        int result = araysortest[1];
        assertEquals(2, result);
    }
    
    /**
     * Test of radixsort method, of class RadixSort.
     */
    @Test
    public void testRadixsort2() {
        int[] arr = araysortest;
        int n = 5;
        RadixSort.radixsort(araysortest, n);
        int result = araysortest[0];
        assertEquals(1, result);
    }

    /**
     * Test of radixsort method, of class RadixSort.
     * No funciona a proposito
     */
    @Test
    public void testRadixsort3() {
        int[] arr = araysortest;
        int n = 5;
        RadixSort.radixsort(araysortest, n);
        int result = araysortest[1];
        assertEquals(3, result);
    }
    
}
