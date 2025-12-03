package org.example.Day2;

public class Day2 {

//  Method that takes 2 ints, works out if any of the numbers in that range are repeated
//  ranges. So 222 would be fine but 2222 or 22 would not be.
//  Make the number a string, split it in half and see if it is equal. Loop through
//  the numbers in the range. If they are equal, then convert to number and add to count.
    public static long invalidID(long start, long finish) {
        long sum = 0;
        for (long i = start; i <= finish; i++) {
            String num = String.valueOf(i);
            int lenString = num.length();
            if (lenString % 2 == 0) {
                String string1 = num.substring(0, lenString/2);
                String string2 = num.substring(lenString/2, lenString);
                if (string1.equals(string2)) {
                    sum += i;
                }
            }
        }
        return sum;
    }

}
