package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner in;

    public static void main(String[] args) {

        System.out.println("Witaj! Jak masz na imie?");
        String g;
        Scanner odczyt = new Scanner(System.in);
        g = odczyt.nextLine();
        Scanner wej = new Scanner(System.in);
        System.out.println("Witaj " + g + "!Zsumuje dla Ciebie 3 liczby.");
        System.out.println("Podaj pierwsza liczbe.");
        long a = wej.nextInt();
        System.out.println("Podaj druga liczbe.");
        long b = wej.nextInt();
        System.out.println("Podaj trzecia liczbe.");
        long c = wej.nextInt();
        long d = a + b + c;
        System.out.println("Suma podanych przez Ciebie liczb to:" + d + ". Nie ma za co! ;)");
        // write your code here
    }
}

