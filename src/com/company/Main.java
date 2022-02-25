package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введи число: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        for ( int i = 1; i <= n; i++ ) {
            sum = sum + i;
        }
        System.out.println("Сумма чисел до введенного = "+sum);
        System.out.println("Готово");
    }
}


