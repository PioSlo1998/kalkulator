package com.traintools.calculator;

import java.util.Scanner;

public class Calculator {

    public int adding() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int a = scan.nextInt();
        System.out.println("Podaj drugą liczbę");
        int b = scan.nextInt();
        int result = a + b;

        return result;
    }

    public int subtraction() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int a = scan.nextInt();
        System.out.println("Podaj drugą liczbę");
        int b = scan.nextInt();
        int result = a - b;

        return result;
    }
}
