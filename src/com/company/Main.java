package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        String number1 = scanner.nextLine();
        String number2 = scanner.nextLine();
        scanner.close();

        BigInteger a = new BigInteger(number1);
        BigInteger b = new BigInteger(number2);

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
