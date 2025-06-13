package com.example.exe;
import java.util.Scanner;

public class TratamentoNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota");
        
        while (true){
            float a = sc.nextFloat();

            if (a >= 0 && a <= 10){
                System.out.println("Nota valida: " + a);
                break;
            }else{
                System.out.println("Nota inválida. Tente novamente");
            }
        }
        
        sc.close();
    }
}