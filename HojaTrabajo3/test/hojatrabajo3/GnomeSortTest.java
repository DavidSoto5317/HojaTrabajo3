/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojatrabajo3;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author David Soto y Jose Cifunetes
 */
public class GnomeSortTest {
	
    private int [] arrayGnome = {3,8,7,5,4,9};
	
    @Test
    public void Gnome1(){
        GnomeSort.gnomeSort(arrayGnome);
        int result = arrayGnome[0];
        assertEquals(3, result);
    }
	
	@Test
    public void Gnome2(){
        GnomeSort.gnomeSort(arrayGnome);
        int result = arrayGnome[2];
        assertEquals(5, result);
    }
	
	/**
	 * El proximo es erroneo a proposito 
	 */
		
	@Test
    public void Gnome3(){
        GnomeSort.gnomeSort(arrayGnome);
        int result = arrayGnome[5];
        assertEquals(9, result);
    }
	
}