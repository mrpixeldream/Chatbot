package com.company;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        String inputLine = null;
        Scanner input = new Scanner(System.in);

        try {
            while ((inputLine = input.nextLine()).equalsIgnoreCase("tschüss")) {

            }
        }
        catch (NoSuchElementException ex) {
            System.err.println("Da ging was schief. Quasi wie der Turm in Pisa.");
        }

    }
}
