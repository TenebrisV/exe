package com.example.exe;
import java.util.Scanner;

public class AtendimentoAgendado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o dia da semana 1-7");
        int a = sc.nextInt();

        switch (a) {
            case 1:
                System.out.println("Atendimento Geral");
                break;
            case 2:
                System.out.println("Suporte Tecnico");
                break;
            case 3:
                System.out.println("Financeiro");
                break;
            case 4:
                System.out.println("Recursos Humanos");
                break;
            case 5:
                System.out.println("Vendas");                
                break;
            case 6:
                System.out.println("Marketing");                
                break;
            case 7:
                System.out.println("Fechado (Fim de semana)");                
                break;
            default:
            System.out.println("Dia inválido");
                break;
        }
        sc.close();
    }
}