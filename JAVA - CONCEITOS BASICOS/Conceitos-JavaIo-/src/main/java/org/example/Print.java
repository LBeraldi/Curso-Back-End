package org.example;
import java.io.*;
import java.util.Scanner;
public class Print {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);
        PrintStream ps = new PrintStream("arquivo.txt");
        while(s.hasNextLine()){
            ps.println(s.nextLine());
        }
    }
}
