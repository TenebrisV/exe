package com.example.exe;
import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a senha");
        
        while (true){
            int a = sc.nextInt();

            if (a == 1234){
                System.out.println("Acesso permitido");
                break;
            }else{
                System.out.println("Senha incorreta");
            }
        }
        
        sc.close();
    }
}