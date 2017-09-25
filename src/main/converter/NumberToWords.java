package main.converter;

public class NumberToWords {

    public static int stringToInt(String input) {
        return Integer.parseInt(input);
    };

    public static final String[] unique = {
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

        if (num < 20) {
            return unique[num];
        }

        if (num < 100) {
            return tens[num / 10] +  (num % 10 == 0 ? "" : " " + unique[num % 10]);
        }

        if (num < 1000) {
            return unique[num / 100] + " hundred" + (num % 100 == 0 ? "" : " and " + convertNumber(num % 100));
        }

        if (num < 1000000) {
            if (num % 1000 == 0) {
                return convertNumber(num / 1000) + " thousand";
            } else if (num % 1000 < 20) {
                return convertNumber(num / 1000) + " thousand and " + convertNumber(num % 1000);
            } else
                return convertNumber(num / 1000) + " thousand " +  convertNumber(num % 1000);
        }

        return null;
    }
}
