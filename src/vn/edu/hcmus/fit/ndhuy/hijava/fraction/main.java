package vn.edu.hcmus.fit.ndhuy.hijava.fraction;

/**
 * vn.edu.hcmus.fit.ndhuy.hijava.fraction
 * Created by ndhuy
 * Date 21/10/2021 - 16:38
 * Description: ...
 */
public class main {
    /**
     * Main function
     * @param argv console parameters
     */
    public static void main(String[] argv) {
        Fraction f_1 = new Fraction(1, 2);
        Fraction f_2 = Fraction.parse("3/4");

        FractionArray fa = new FractionArray(
                f_1,
                f_2,
                new Fraction(5, 6)
        );

        System.out.println(fa);

        FractionArray fa_1 = FractionArray.parse("10/20 100/50 123/444 789/321");
        System.out.println(fa_1);
    }
}
