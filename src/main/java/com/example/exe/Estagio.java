package com.example.exe;
import java.util.Scanner;

public class Estagio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Primeira nota");
        float a = sc.nextFloat();

        
        System.out.println("Segunda nota");
        float b = sc.nextFloat();

        float media = (a+b)/2;
        System.out.printf("Media: %.2f\n", media);
        sc.close();

        if (media >= 7) System.out.println("Aprovado");
        else System.out.println("Não aprovado");
    }
}