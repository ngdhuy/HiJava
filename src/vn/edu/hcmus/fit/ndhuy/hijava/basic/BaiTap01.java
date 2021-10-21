package vn.edu.hcmus.fit.ndhuy.hijava.basic;

import java.util.Scanner;

/**
 * vn.edu.hcmus.fit.ndhuy.hijava.basic
 * Created by ndhuy
 * Date 21/10/2021 - 14:57
 * Description: BaiTap01
 */
public class BaiTap01 {
    /**
     * main function
     * @param argv String
     */
    public static void main(String[] argv) {
        // input
        int n = input();
        // bus
        int s = Sum(n);

        // output
        output(s, n);
    }

    /**
     * Print Sum value
     * @param s is result
     * @param n is number
     */
    public static void output(int s, int n) {
        String str = String.format("Sum(%d) = %d", n, s);
        System.out.println(str);
    }

    /**
     * Sum 1 to n
     * @param n integer
     * @return sum integer
     */
    public static int Sum(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++)
            sum += i;
        return sum;
    }

    /**
     * Input a integer number from 3 to 50
     * @return n : integer
     */
    public static int input() {
        int n;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Enter integer number n = ");
            n = scan.nextInt();
            // Check alert error
            if(n <= 3 || 50 < n)
                System.out.println("N is invalid. Please, enter again!");
        } while(n <= 3 || 50 < n);
        return n;
    }
}
