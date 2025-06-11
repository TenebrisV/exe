package com.example.exe;
import java.util.Scanner;

public class MediaNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Primeira nota");
        float a = sc.nextFloat();

        
        System.out.println("Segunda nota");
        float b = sc.nextFloat();

        float media = (a+b)/2;
        System.out.printf("Media: %.2f\n", media);
        sc.close();

        if (media >= 5) System.out.println("Aprovado");
        else System.out.println("Reprovado");
    }
}