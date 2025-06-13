package com.example.exe;
import java.util.Scanner;

public class MaquinaVenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nDigite o seu saldo: ");
        float saldo = sc.nextFloat();
        boolean att = true;

        while (att){
            
            System.out.println("\n\n\nSaldo disponivel: " + saldo);
            System.out.println("\n\n ----- Menu de Produtos -----");
            System.out.println("1 - Bala (R$ 1,00)");
            System.out.println("2 - Chocolate (R$ 2,50)");
            System.out.println("3 - Refrigerante (R$ 4,00)");
            System.out.println("4 - Sair");
            System.out.println("\n");

            int op = sc.nextInt();
            switch (op) {
                case 1:
                    if (saldo < 1) System.out.println("Saldo insuficiente");
                    else{
                        saldo -= 1;
                        System.out.println("Bala comprada");
                    }
                    break;
                case 2:
                    if (saldo < 2.5) System.out.println("Saldo insuficiente");
                    else{
                        saldo -= 2.5;
                        System.out.println("Chocolate comprado");
                    }
                    break;
                case 3:
                    if (saldo < 1) System.out.println("Saldo insuficiente");
                    else{
                        saldo -= 4;
                        System.out.println("Refri comprado");
                    }
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