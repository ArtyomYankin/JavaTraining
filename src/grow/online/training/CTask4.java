package grow.online.training;

import java.math.BigInteger;

public class CTask4 {
    BigInteger MULTI = BigInteger.valueOf(1);
    public void MultiOfSqr(){

        for (int i=2;i<201;i++)
        {
            MULTI=MULTI.multiply(BigInteger.valueOf((long)i*i));
        }
       System.out.println("Произведение квадратов первых двуста чисел: "+MULTI);
    }
}
