package vn.edu.hcmus.fit.ndhuy.hijava.myarray;

import java.awt.*;

/**
 * vn.edu.hcmus.fit.ndhuy.hijava.myarray
 * Created by ndhuy
 * Date 21/10/2021 - 16:13
 * Description: Demo Sawtooth Array
 */
public class main {
    /**
     * main function
     * @param argv terminal parameters
     */
    public static void main(String[] argv) {
        int arr[][] = init();
        output(arr);
    }

    /**
     * print sawtooth array
     * @param arr sawtooth array
     */
    public static void output(int[][] arr) {
        System.out.println("Number of rows: " + arr.length + "\t");
        for(int[] row : arr) {
            System.out.print("=> Number of column: " + row.length);
            for(int col : row) {
                System.out.print(col + "\t");
            }
            System.out.println();
        }
    }

    /**
     * init sawtooth array
     * @return sawtooth array
     */
    public static int[][] init() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };
        return arr;
    }
}
