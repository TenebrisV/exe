package com.example.exe;
import java.util.Scanner;

public class ContadorDoWhileComWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com um numero: ");
        int op = sc.nextInt();
        int num = 1;

        while (num <= op){
            System.out.println(num);
            num++;
        };

        sc.close();
    }
}