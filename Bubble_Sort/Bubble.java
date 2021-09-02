/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buble;

import java.util.Random;



public class Bubble {

    public static int[] bubbleSort(int [] a)
    {
        int temp;
        for(int n = 0 ; n<a.length-1 ; n++) // this is the one position being compared
            for(int i = 1 ; i<a.length-n ; i++) // this is the loop that compares every element after the element chosen by the first loop.
            {
                if (a[i-1] > a[i])
                {
                temp = a[i-1];
                a[i-1] = a[i];
                a[i] = temp;
                }
            }
        return a;
    }

    public static String printArray(int[] i)
    {
        String array = "";
        for(int x = 0 ; x<i.length ; x++)
        {
            array += i[x];
        }
        return array;
    }
    public static int[] randomInt(int[] i , int x)
    {
        Random rand = new Random();
        i = new int[x];
        for(int a = 0 ; a < x ; a++)
        {
            i[a] = rand.nextInt(10);
        }
        return i;
    }
    
    public static void main(String[] args) {
        
        final int SIZE = 10;
        int[] array = new int[SIZE];
        array = randomInt(array , SIZE);
        System.out.println(printArray(array));
        array = bubbleSort(array);
        System.out.println(printArray(array));
        
    }
    
}
