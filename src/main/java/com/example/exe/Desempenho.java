package com.example.exe;
import java.util.Scanner;

public class Desempenho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a Nota 0-10");
        float a = sc.nextFloat();

        if (a >= 9){
            System.out.println("Nota Excelente");
        }else if (a >= 7){
            System.out.println("Nota Bom");
        }else if (a >= 5){
            System.out.println("Nota Regular");
        }else {
            System.out.println("Nota Insatisfatoria");
        }
        sc.close();
    }
}