package com.example.exe;
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nDigite a sua senha: ");
        float saldo = 1000;
        boolean att = true;

        while (true){
            int a = sc.nextInt();

            if (a == 4321){
                System.out.println("Acesso permitido");
                break;
            }else{
                System.out.println("Senha incorreta");
            }
        }

        while (att){
            
            System.out.println("\n\n\n");
            System.out.println("\n\n ----- Menu principal -----");
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            System.out.println("\n");

            int op = sc.nextInt();
            float temp;
            switch (op) {
                case 1:                    
                    System.out.println("Saldo disponivem: " + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor a ser depositado");
                    temp = sc.nextFloat();
                    saldo += temp;
                    break;
                case 3:
                    System.out.println("Digite o valor a ser sacado");
                    temp = sc.nextFloat();
                    saldo -= temp;
                    break;
                case 4:
                    System.out.println("encerrando");
                    att = false;
                    break;
            
                default:
                System.out.println("Comando inválido");
                    break;
            }
        }
        sc.close();
    }
}