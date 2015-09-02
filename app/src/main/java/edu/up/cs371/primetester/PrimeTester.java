package edu.up.cs371.primetester;

/**
 * Created by vegdahl on 7/17/2015.
 *
 * The purpose of this class is to define a static method, isPrime, that determines whether an
 * integer is a prime number.
 */
public class PrimeTester {
    /**
     * Tells whether an integer is prime.
     *
     * @param n the number to test
     * @return true iff n is prime
     */
    public static boolean isPrime(long n) {
        //loop to see if the number is divisible by
        //2 or itself
        int i;
        for(i=2; i < n; i++) {
            //in this case not prime
            if(n % i == 0 && i != n) {
            return false;
            }
        }
        //in all other cases, prime
        return true;
    }
}
