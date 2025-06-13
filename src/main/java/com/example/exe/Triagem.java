package com.example.exe;
import java.util.Scanner;

public class Triagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade");
        int idade = sc.nextInt();

        System.out.println("Digite o seu tipo de plano (1 - Convênio e 2 - Particular)");
        int plano = sc.nextInt();

        System.out.println("Digite a especialidade desejada (1 - Clínica Geral, 2 - Pediatria, 3 - Cardiologia, 4 - Ortopedia)");
        int esp = sc.nextInt();

        if(idade > 65) System.out.println("Atendimento Prioritario(idoso)");
        else if (idade < 12) System.out.println("Atendimento prioritario(crianca)");
        else System.out.println("Atendimento Comum");

        switch (esp) {
            case 1:
                System.out.println("Especialidade: Clinica Geral");
                break;
            case 2:
                System.out.println("Especialidade: Pediatria");
                break;
            case 3:
                System.out.println("Especialidade: Cardiologia");
                break;
            case 4:
                System.out.println("Especialidade: Ortopedia");
                break;
            default:
            System.out.println("Especialidade Invalida");
                break;
        }

        if (plano == 1){
            if (idade > 60) System.out.println("Isento de Taxa de Consulta");
            else System.out.println("Taxa reduzidad R$40,00");
        }else System.out.println("Taxa integral R$100,00");

        sc.close();
    }
}