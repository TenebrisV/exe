package com.example.exe;
import java.util.Scanner;

public class ContadorDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com um numero: ");
        int op = sc.nextInt();
        int num = 1;

        do{
            System.out.println(num);
            num++;
        }while (num <= op);

        sc.close();
    }
}