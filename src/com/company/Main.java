package com.company;

public class Main {

    public static void main(String[] args) {
        int b1 = 2;
        for ( int i = 10; i <= 20; i = i + 1 ) {
            System.out.println(i);
            System.out.printf("Числа от 10 до 20 в дводрате %.0f \n", Math.pow(i, b1));
            // для вывода на экран целого значения используется "%.0f"

        }
        }
    }


