package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));

        String outputString = convert(number);

        System.out.println("Here is your number in words... " + outputString);
    }
}

