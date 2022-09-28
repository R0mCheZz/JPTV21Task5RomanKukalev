/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21task5romankukalev;
import java.util.Arrays;
/**
 *
 * @author pupil
 */
public class JPTV21Task5RomanKukalev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] arr = new int [5][];
        arr[0] = new int [3];
        arr[1] = new int [5];
        arr[2] = new int [7];
        arr[3] = new int [8];
        arr[4] = new int [9];
        for (int[] arr1 : arr) {
            ;
        }
{
            int i = 0;
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = ((int)(Math.random() *50 ));
                System.out.print(" " + arr[i][j]+ " ");
            }
            System.out.println();
    }
    }
    
}
