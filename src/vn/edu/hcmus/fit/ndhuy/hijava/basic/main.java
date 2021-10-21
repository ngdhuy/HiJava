package vn.edu.hcmus.fit.ndhuy.hijava.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * vn.edu.hcmus.fit.ndhuy.hijava.basic
 * Created by ndhuy
 * Date 21/10/2021 - 14:18
 * Description: ...
 */
public class main {

    /**
     * Define main function
     * @param args String[]
     */
    public static void main(String[] args){
        System.out.println("Welcome to Java courses");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date myDate = sdf.parse("20/10/2021");
            System.out.println(myDate);

            System.out.print("Enter your name: ");
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            String strFormat = String.format("Your name is %s", s);
            System.out.println(strFormat);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
