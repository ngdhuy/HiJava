package vn.edu.hcmus.fit.ndhuy.hijava.fraction;

/**
 * vn.edu.hcmus.fit.ndhuy.hijava.fraction
 * Created by ndhuy
 * Date 21/10/2021 - 16:40
 * Description: ...
 */
public class Fraction {
    //  attribute
    private int numerator;
    private int denominator;

    // Constructor

    /**
     * Default Constructor
     */
    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    /**
     * Construtor with parameters
     * @param numerator integer
     * @param denominator integer
     */
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     * Copy constructor
     * @param f fraction
     */
    public Fraction(Fraction f) {
        this.numerator = f.numerator;
        this.denominator = f.denominator;
    }

    /**
     * getter numerator
     * @return numerator
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * setter numerator
     * @param numerator integer
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * getter denominator
     * @return denominator
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * setter denominator
      * @param denominator integer
     */
    public void setDenominator(int denominator) {
        if(denominator != 0)
            this.denominator = denominator;
    }

    /**
     * toString method
     * @return String
     */
    @Override
    public String toString(){
        return this.numerator + "/" + this.denominator;
    }

    /**
     * Parse String to Fraction object
     * @param s string
     * @return Fraction object
     */
    public static Fraction parse(String s) {
        String[] arrStr = s.split("/");
        Fraction f = new Fraction();
        f.numerator = Integer.parseInt(arrStr[0]);
        f.denominator = Integer.parseInt(arrStr[1]);
        return f;
    }
}
