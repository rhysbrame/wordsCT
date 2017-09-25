package main.converter;

public class NumberToWords {

    public static int stringToInt(String input) {
        return Integer.parseInt(input);
    };

    public static final String[] children = {
            "", "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    public static final String[] tens = {
            "", "", "twenty", "thirty", "forty", "fifty",
            "sixty", "seventy", "eighty", "ninety"
    };

    public static String convert(int num) {
        if (num == 0) {
            return "zero";
        } else if (num >= 1000000000) {
            return "number too large";
        } else return convertNumber(num);
    }

    private static String convertNumber(int num) {
        return null;
    }
}
