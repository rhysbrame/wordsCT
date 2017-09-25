package main.converter;

public class NumberToWords {

    public static int stringToInt(String input) {
        return Integer.parseInt(input);
    };

    public static String convert(int num) {
        if (num == 0) {
            return "zero";
        }
        return null;
    }
}
