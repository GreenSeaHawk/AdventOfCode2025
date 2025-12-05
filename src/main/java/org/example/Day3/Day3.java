package org.example.Day3;

public class Day3 {

    public static Long biggestInt(String numStr){
        String biggestInt = "";
        int lenNumStr = numStr.length();
        int int1Index = 0;
        for (int j = 0; j < 12; j++) {
            int int1 = Character.getNumericValue(numStr.charAt(j));
            for (int i = int1Index + j + 1; i < lenNumStr - 11 + j; i++) {
                int x = Character.getNumericValue(numStr.charAt(i));
                if (x > int1) {
                    int1 = x;
                    int1Index = i;
                }
            }
            biggestInt += String.valueOf(int1);
        }
//        int int2 = Character.getNumericValue(numStr.charAt(int1Index + 1));
//        for (int i = int1Index +1; i < numStr.length(); i++) {
//            int x = Character.getNumericValue(numStr.charAt(i));
//            if (x > int2) {
//                int2 = x;
//            }
//        }
        return Long.parseLong(biggestInt);
    }
}
