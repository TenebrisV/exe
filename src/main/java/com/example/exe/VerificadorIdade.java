package com.example.exe;
import java.util.Scanner;

public class VerificadorIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age[] = new int[5];
        int i;

        for(i = 0; i < 5; i++){
            System.out.println("Entre com uma idade");
            age[i] = sc.nextInt();
        }

        System.out.println("\n\n");
        for(i = 0; i < 5; i++){
            System.out.println("Idade " + i + ": " + age[i]);
            if (age[i] < 18){
                System.out.println("Há pelo menos uma pessoa menor de idade");
                break;
            }
            if (i == 4) System.out.println("Todos são maiores de idade");
        }

        sc.close();
    }
}