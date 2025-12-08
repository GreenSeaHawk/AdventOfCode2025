package org.example.Day3;

public class Day3 {

    public static Long biggestInt(String numStr){
        String biggestInt = "";
        int lenNumStr = numStr.length();
        int numIndex = 0;
        for (int j = 0; j < 12; j++) {
            int remaining = 12 - biggestInt.length();
            int max = lenNumStr - remaining;
            int num = Character.getNumericValue(numStr.charAt(numIndex));
            for (int i = numIndex + 1; i <= max; i++){
                int nextNum = (Character.getNumericValue(numStr.charAt(i)));
                if (nextNum > num) {
                    num = nextNum;
                    numIndex = i;
                }
            }
            biggestInt += String.valueOf(num);
            numIndex += 1;
        }
        return Long.parseLong(biggestInt);
    }
}
