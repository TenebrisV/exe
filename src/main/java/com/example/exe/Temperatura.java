package com.example.exe;
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a Temperatura");
        float a = sc.nextFloat();

        if (a <= 36){
            System.out.println("Hipotermia");
        }else if (a <= 37.4){
            System.out.println("Normal");
        }else if (a <= 38.5){
            System.out.println("Febre Leve");
        }else if (a <= 39.9){
            System.out.println("Febre Moderada");
        }else {
            System.out.println("Febre Alta");
        }

        sc.close();
    }
}