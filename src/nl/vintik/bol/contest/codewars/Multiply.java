package nl.vintik.bol.contest.codewars;

import java.math.*;

public class Multiply {
    public static Double multiply(Double a, Double b) {
        if(a!= null && b!= null){
            return new BigDecimal(a).multiply(new BigDecimal(b)).doubleValue();
        }
        return 0D;
    }
}
