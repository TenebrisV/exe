package com.example.exe;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Frase: ");
        String a = sc.nextLine();

        System.out.println("Frase: \n" + a);
        sc.close();
    }
}