package org.ii;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class AppTest {
    @Test
    public void twoIntegersSomething() {

        int Price = 4;
        int Paid = 45;

        boolean isItPaidMore = Paid > Price;

        assertEquals(isItPaidMore, true);

    }

    @Test
    public void secondAttempt() {

        int xpectedPayment = 46;
        int actualPayment = 46;

        assertEquals(xpectedPayment, actualPayment);
        
    }


}
