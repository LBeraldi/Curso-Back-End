package org.example;

import java.util.Scanner;

public class Wrappers {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

         int i = 100 ;
         String s = " " + i;
        System.out.println(s);

        double d = 1.2;
        String s2 = " " + d;
        System.out.println(s2);

        //Integer x = 5;
        //int numeroDeVolta = x.intValue();
        Object o = 5;

        // -----------------------------------------------------------------

        double d2 = 4.1;
        long i3 = Math.round(d2);

        int x2 = -4;
        int y = Math.abs(x2);
        System.out.println(i3 + " / " + y);
    }
}
