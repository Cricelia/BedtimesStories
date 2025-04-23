package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner asking = new Scanner(System.in);

        try
        {
            System.out.println("Pick a story");
            System.out.println("Options:\ngoldilocks.txt\nhansel_and_gretel.txt\nmary_had_a_little_lamb.txt");
            String option = asking.nextLine();
            // create a FileInputStream object pointing to
            // a specific file
            FileInputStream fis = new FileInputStream(option);
            // create a Scanner to reference the file to be read
            Scanner scanner = new Scanner(fis);
            String input;
            int lineNumber = 1;
            // read until there is no more data
            while(scanner.hasNextLine()) {
                input = scanner.nextLine();
                System.out.println(lineNumber + " " + input);
                lineNumber++;
            }
            // close the scanner and release the resources
            scanner.close();
        }
        catch(IOException e) {
            // display stack trace if there was an error
            e.printStackTrace();
        }
    }
}