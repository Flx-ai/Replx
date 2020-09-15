package com.company;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        final double pi = 3.14;
        double cat1, cat2, c, r, s;
        Scanner num = new Scanner(System.in);
        System.out.println("Введите длину катета ");
        cat1 = num.nextDouble();


        cat2 = cat1;
        System.out.println("Длина другого катета = " + cat2);

        c = Math.sqrt(cat1 * cat1 + cat2 * cat2);
        System.out.println("Длина гипотенузы = " + c);

        r = c / 2;
        System.out.println("Радиус окружности равен = " + r);

        s = pi * r * r;
        System.out.printf("Для круга R = %1$.2f площадь s = %2$.2f",r,s );

    }
}

