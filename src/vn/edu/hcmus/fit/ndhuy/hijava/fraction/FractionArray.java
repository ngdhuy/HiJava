package vn.edu.hcmus.fit.ndhuy.hijava.fraction;

/**
 * vn.edu.hcmus.fit.ndhuy.hijava.fraction
 * Created by ndhuy
 * Date 21/10/2021 - 16:54
 * Description: ...
 */
public class FractionArray {
    private Fraction[] arr;

    /**
     * Default constructor
     */
    public FractionArray() {
        this.arr = null;
    }

    /**
     * Constructor with parameters
     * @param arr array of fraction
     */
    public FractionArray(Fraction... arr) {
        this.arr = arr;
    }

    /**
     * Copy constructor
     * @param fa fraction array
     */
    public FractionArray(FractionArray fa) {
        this.arr = fa.arr;
    }

    /**
     * getter Fraction array
     * @return array of fraction
     */
    public Fraction[] getArr() {
        return arr;
    }

    /**
     * setter Fraction array
     * @param arr of fraction
     */
    public void setArr(Fraction[] arr) {
        this.arr = new Fraction[arr.length];
        for(int i = 0; i < arr.length; i++)
            this.arr[i] = new Fraction(arr[i]);
    }

    /**
     * Convert object to String
     * @return String
     */
    @Override
    public String toString() {
        if(this.arr == null)
            return "Array is empty";
        else {
            String s = "";
            for(Fraction f : this.arr)
                s += f.toString() + " ";
            return s;
        }
    }

    /**
     * Parse String to Fraction Array
     * @param s String
     * @return Fraction Array
     */
    public static FractionArray parse(String s) {
        FractionArray fa = new FractionArray();
        String[] arrStr = s.split(" ");
        fa.arr = new Fraction[arrStr.length];
        for(int i = 0; i < arrStr.length; i++)
            fa.arr[i] = Fraction.parse(arrStr[i]);
        return fa;
    }
}
