/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojatrabajo3;

/**
 *
 * @author David
 */
public class SelectionSort {
    public static void selectionSort (Comparable[] list)
    {
        int min;
        Comparable temp;

        for (int index = 0; index < list.length-1; index++)
        {
            min = index;
            for (int scan = index+1; scan < list.length; scan++)
                if (list[scan].compareTo(list[min]) < 0)
                    min = scan;
        // Swap the values
        temp = list[min];
        list[min] = list[index];
        list[index] = temp;
        }
    }
}
