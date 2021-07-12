package com.section5;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Operators {

    public static void main(String[] args) {

        System.out.println(20/3);
        System.out.println(20/3.0);

        System.out.println((double)20/3);


        BigDecimal rideFee = BigDecimal.valueOf(20).setScale(2);

        BigDecimal amountOfPeople = BigDecimal.valueOf(3);

        BigDecimal changePerPerson = rideFee.divide(amountOfPeople, RoundingMode.HALF_UP);// Rounding mode must be specified. Else gives rounding exception.

        System.out.println(changePerPerson);

        double d = 3.1;
        double d2 = 1.21;

        System.out.println(d-d2);

        BigDecimal bd3 = BigDecimal.valueOf(3.1).setScale(2);
        BigDecimal bd4 = BigDecimal.valueOf(1.21).setScale(2);

        System.out.println(bd3.subtract(bd4));
    }
}
