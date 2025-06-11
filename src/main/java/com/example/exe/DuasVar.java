package com.example.exe;
import java.util.Scanner;

public class DuasVar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Primeiro numero");
        int a = sc.nextInt();

        
        System.out.println("Segundo numero");
        int b = sc.nextInt();

        System.out.println("Soma: " + (a+b));
        sc.close();
    }
}