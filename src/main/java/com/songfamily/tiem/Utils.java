package com.songfamily.tiem;

public class Utils {
    private static final int INVALID_CHAR = -1;

    public static int atoi(String s) {
        int INVALID_STRING = 0;
        boolean isNegative = false;
        int result = 0;
        int position = 0;

        while (position < s.length()) {
            char c = s.charAt(position);
            position += 1;

            if (c == '-') {
                if (isNegative) {
                    return INVALID_STRING;
                } else {
                    isNegative = true;
                    continue;
                }
            }

            int convertedInt = charToInt(c);
            if (convertedInt == INVALID_CHAR) {
                return INVALID_STRING;
            } else {
                result = result * 10 + charToInt(c);
            }
        }

        if (isNegative) {
            return 0 - result;
        } else {
            return result;
        }
    }

    private static int charToInt(char c) {
        switch (c) {
            case '0': return 0;
            case '1': return 1;
            case '2': return 2;
            case '3': return 3;
            case '4': return 4;
            case '5': return 5;
            case '6': return 6;
            case '7': return 7;
            case '8': return 8;
            case '9': return 9;
            default: return INVALID_CHAR;
        }
    }
}
