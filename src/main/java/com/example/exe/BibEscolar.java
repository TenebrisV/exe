package com.example.exe;
import java.util.Scanner;

public class BibEscolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;

        do{
            
            System.out.println("\n\n\n");
            System.out.println("\n\n ----- Menu principal -----");
            System.out.println("1 - Saldação");
            System.out.println("2 - Data");
            System.out.println("3 - Sair");
            System.out.println("\n");
            op = sc.nextInt();

            switch (op) {
                case 1:                    
                    System.out.println("Ola");
                    break;
                case 2:
                    System.out.println("11/09/2002");
                    break;
                case 3:
                    System.out.println("Encerrando");
                    break;
                default:
                System.out.println("Comando inválido");
                    break;
            }
        }while (op != 3);
        sc.close();
    }
}