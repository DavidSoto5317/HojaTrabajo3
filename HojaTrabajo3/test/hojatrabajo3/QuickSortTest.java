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
 * @author David Soto y Jose Cifuentes
 */
public class QuickSortTest {
    private int [] araysortest = {5,4,3,2,1};

    @Test
    public void testQuicksort1() {
        QuickSort test = new QuickSort();
        test.sort(araysortest);
        int result = araysortest[0];			
        assertEquals(1, result);
    }
	
    @Test
    public void testQuicksort2() {
        QuickSort test = new QuickSort();
        test.sort(araysortest);
        int result =araysortest[1];
        assertEquals(2,result);
    }
	
    @Test
    public void testQuicksort3() {
        QuickSort test = new QuickSort();
        test.sort(araysortest);
        int result =araysortest[2];
        assertEquals(3,result);
    }
	
    /**
     * El proximo es erroneo a proposito sigue el 4 pero pondremos 5
     */
	
    @Test
    public void testQuicksort4() {
        QuickSort test = new QuickSort();
        test.sort(araysortest);
        int result =araysortest[3];
        assertEquals(5,result);
    }
}
