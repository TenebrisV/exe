package com.example.exe;

public class Soma5Num {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;

        while (i < 5){
            i++;
            sum += i;
        }

        System.out.println("A soma : " + sum);
    }
}