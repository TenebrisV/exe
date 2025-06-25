package com.example.exe;
import java.util.Scanner;

public class CronometroArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float time[] = new float[5];
        int i;

        for(i = 0; i < 5; i++){
            System.out.println("Entre com um tempo (float)");
            time[i] = sc.nextFloat();
        }
        sc.close();


        System.out.println("\n\n");
        float   sum = 0, 
                menor = time[0], 
                maior = time[0];

        for(i = 0; i < 5; i++){
        System.out.println("tempo " + i + ": " + time[i]);
            sum += time[i];
            if (time[i] < maior) maior = time[i];
            if (time[i] > menor) menor = time[i];
        }
        System.out.println("\n\nTempo total: " + sum);
        System.out.println("Menor tempo: " + menor);
        System.out.println("Maior tempo: " + maior);
        
    }
}