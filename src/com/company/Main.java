package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сумму вклада:   (0 для выхода)");
        float i = scan.nextFloat();
        if (i == 0) {
            System.out.println("Досвидания");
            return;}
        while (true) {
            System.out.println("Введите месяц:   ");
            Scanner scan2 = new Scanner(System.in);
            float b = scan2.nextFloat();
            float c = (float) 0.07;
            float n;
            n = i *(b*c);
            float sum;
            sum = i + n;
            if (b == 1) {
                System.out.println("За 1-й мес доход от вклада:  "+n);
            } else if (b == 2) {
                System.out.println("За 2-й мес доход от вклада:  "+n);
            } else if (b == 3) {
                System.out.println("За 3-й мес от вклада:  "+n);
            } else if (b == 4) {
                System.out.println("За 4-й мес доход от вклада:   "+n);
            } else if (b == 5) {
                System.out.println("За 5-й мес доход от вклада:  "+n);
            } else if (b == 6) {
                System.out.println("За 6-й мес доход от вклада:  "+n);
            } else if (b == 7) {
                System.out.println("За 7-й мес доход от вклада:  "+n);
            } else if (b == 8) {
                System.out.println("За 8-й месе доход от вклада:  "+n);
            } else if (b == 9) {
                System.out.println("За 9-й мес доход от вклада:  "+n);
            } else if (b == 10) {
                System.out.println("За 10-й мес доход от вклада:  "+n);
            } else if (b == 11) {
                System.out.println("За 11-й мес доход от вклада:  "+n);
            } else if (b == 12) {
                System.out.println("За 12-й мес доход от вклада:  "+n);
            } else if (b == 0) {
                System.out.println("Досвидания");
                return;}
            System.out.println("И того у вас будет:    "+sum);
        }
    }
}



