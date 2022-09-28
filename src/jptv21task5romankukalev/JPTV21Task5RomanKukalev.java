/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21task5romankukalev;
import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author pupil
 */
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author pupil
 */
public class JPTV21Task5RomanKukalev {

    /**
     * @param args the command line arguments
     */
    static int getIntFromRange(int min, int max){
        Random rand = new Random();
        return rand.nextInt(max-min+1)+min;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int min = 100;
        int max = 0;
        int[][] arr = new int[5][];
        arr[0] = new int[3];
        arr[1] = new int[5];
        arr[2] = new int[7];
        arr[3] = new int[8];
        arr[4] = new int [9];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = getIntFromRange(50,100);
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("=====================================");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                for(int n = 0; n < arr.length; n++){
                    for(int m = 0; m < arr[n].length; m++){
                        if(arr[i][j]>arr[n][m]){
                            arr[i][j] = arr[i][j]+arr[n][m];
                            arr[n][m] = arr[i][j]-arr[n][m];
                            arr[i][j] = arr[i][j]-arr[n][m];
                        }
                    }
                }           
            }   
            
          }
          for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr[i].length; j++){
                
                
                    System.out.printf("%4d", arr[i][j]);
                }
                System.out.println();
          }
    }
}