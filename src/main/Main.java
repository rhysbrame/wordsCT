package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static main.converter.NumberToWords.*;

public class Main {

    public static void main(String[] args) throws IOException {

        String inputString;

        System.out.println("Enter your number: ");

        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));

        inputString = bufferRead.readLine();
        int number = stringToInt(inputString);

        String outputString = convert(number);

        System.out.println("Here is your number in words... " + outputString);
    }
}

