package com.example.exe;
import java.util.Scanner;

public class ConversorNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a Nota 0-100");
        int a = sc.nextInt();

        if (a >= 90){
            System.out.println("Nota A");
        }else if (a >= 80){
            System.out.println("Nota B");
        }else if (a >= 70){
            System.out.println("Nota C");
        }else if (a >= 60){
            System.out.println("Nota D");
        }else System.out.println("Nota F");

        sc.close();
    }
}