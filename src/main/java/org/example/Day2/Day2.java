package org.example.Day2;

public class Day2 {

//  Method that takes 2 ints, works out if any of the numbers in that range are repeated
//  ranges. So 222 would be fine but 2222 or 22 would not be.
//  Make the number a string, split it in half and see if it is equal. Loop through
//  the numbers in the range. If they are equal, then convert to number and add to count.
    public static long invalidID(long start, long finish) {
        long sum = 0;
        for (long i = start; i <= finish; i++) {
            if (repeatNum(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean repeatNum(long num) {
        boolean repeats = false;
        String numStr = String.valueOf(num);
        int lenString = numStr.length();
        if (lenString % 2 == 0) {
            String string1 = numStr.substring(0, lenString/2);
            String string2 = numStr.substring(lenString/2, lenString);
            if (string1.equals(string2)) {
                repeats = true;
            }
        }
        if (lenString % 3 == 0) {
            String string1 = numStr.substring(0, lenString/3);
            String string2 = numStr.substring(lenString/3, lenString*2/3);
            String string3 = numStr.substring(lenString*2/3, lenString);
            if (string1.equals(string2) && string1.equals(string3)) {
                repeats = true;
            }
        }
        if (lenString % 4 == 0) {
            String string1 = numStr.substring(0, lenString/4);
            String string2 = numStr.substring(lenString/4, lenString/2);
            String string3 = numStr.substring(lenString/2, lenString*3/4);
            String string4 = numStr.substring(lenString*3/4, lenString);
            if (string1.equals(string2) && string1.equals(string3) && string1.equals(string4)) {
                repeats = true;
            }
        }
        if (lenString % 5 == 0) {
            String string1 = numStr.substring(0, lenString/5);
            String string2 = numStr.substring(lenString/5, lenString*2/5);
            String string3 = numStr.substring(lenString*2/5, lenString*3/5);
            String string4 = numStr.substring(lenString*3/5, lenString*4/5);
            String string5 = numStr.substring(lenString*4/5, lenString);
            if (string1.equals(string2) && string1.equals(string3) && string1.equals(string4) && string1.equals(string5)) {
                repeats = true;
            }
        }
        if (lenString % 7 == 0) {
            String string1 = numStr.substring(0, lenString/7);
            String string2 = numStr.substring(lenString/7, lenString*2/7);
            String string3 = numStr.substring(lenString*2/7, lenString*3/7);
            String string4 = numStr.substring(lenString*3/7, lenString*4/7);
            String string5 = numStr.substring(lenString*4/7, lenString*5/7);
            String string6 = numStr.substring(lenString*5/7, lenString*6/7);
            String string7 = numStr.substring(lenString*6/7, lenString);
            if (string1.equals(string2)
                    && string1.equals(string3)
                    && string1.equals(string4)
                    && string1.equals(string5)
                    && string1.equals(string6)
                    && string1.equals(string7)) {
                repeats = true;
            }
        }
        return repeats;
    }
}
