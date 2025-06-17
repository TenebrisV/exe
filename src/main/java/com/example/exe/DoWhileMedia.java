package com.example.exe;
import java.util.Scanner;

public class DoWhileMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float op = 0;

        float sum = 0;
        int cont = 0;

        do{
            System.out.print("Entre com uma nota: ");
            op = sc.nextFloat();
            
            if (op < 0) break;
            cont++;
            sum += op;
        }while (true);

        System.out.println("A media e: " + sum/cont);

        sc.close();
    }
}