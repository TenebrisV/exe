package com.example.exe;
import java.util.Scanner;

public class ControleAcesso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;

        do{
            System.out.print("Entre com a senha: ");
            String op = sc.nextLine();
            cont++;    
            
            if (op.equals("Java123")) {
                System.out.println("Bem Vindo");
                break;
            }
            else if (cont >= 3) {
                System.out.println("Acesso bloqueado");
                break;
            }else {
                System.out.println("Tente Novamente");
            }
        }while (true);

        sc.close();
    }
}