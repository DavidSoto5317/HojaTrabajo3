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
 * @author David Soto y Jose Cifunetes
 */
public class MergeSortTest {
    private int [] arrayTest = {1,5,6,3,9,7,2};
    
    @Test
    public void PruebaSort(){
        MergeSort.mergesort(arrayTest);
        int result = arrayTest[0];
        assertEquals(1, result);
    }
    
    @Test
    public void PruebaSort2(){
        MergeSort.mergesort(arrayTest);
        int result = arrayTest[5];
        assertEquals(7, result);
    }
    
    /**
	 * El proximo es erroneo a proposito 
	 */
    
    @Test
    public void PruebaSort3(){
        MergeSort.mergesort(arrayTest);
        int result = arrayTest[2];
        assertEquals(9, result);
    }
    
    
}