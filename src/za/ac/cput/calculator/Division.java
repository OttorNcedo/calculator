package za.ac.cput.calculator;

public class Division {
    /**
     * Returns results of interger division
     *
     * @param numerator
     * @param denominator
     * @return
     */
    public static int intergerDivision(int numerator, int denominator){
        if(denominator < 1) return 0;
        return numerator/denominator;
    }
}
