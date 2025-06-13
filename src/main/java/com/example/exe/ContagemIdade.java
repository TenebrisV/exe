package com.example.exe;
import java.util.Scanner;

public class ContagemIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;

        while (true){
            System.out.print("\nDigite a idade dos alunos: ");
            int a = sc.nextInt();

            if (a == 0) break;
            else i++;
        }
        System.out.println("Quantidade de alunos entrevistados: " + i);
        sc.close();
    }
}