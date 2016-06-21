package ppackagge;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * With <3 by matej on 21/06/16.
 */
public class For {
    public static void main(String[] args) {
        List<BigInteger> bl = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 1000; ++i) {
            bl.add(BigInteger.probablePrime(100, rnd));
        }

        for (long i = 0; i < Long.MAX_VALUE; i ++) {
            for (int j = 0; j < bl.size(); ++j) {
                BigInteger b = bl.get(j);
            }
        }
    }
}
