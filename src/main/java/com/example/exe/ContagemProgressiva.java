package com.example.exe;
import java.util.Scanner;

public class ContagemProgressiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro maior que zero");
        int a = sc.nextInt();

        int i = 0;

        while (i < a){
            i++;
            System.out.println("Participante numero: " + i);
        }
        
        sc.close();
    }
}