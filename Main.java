package ru.vsu.cs.maslovaei;

import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длинну окружности: L = ");
        double l = scanner.nextDouble();

        double r = l/2/Math.PI;
        double s = Math.PI*r*r;

        System.out.printf("Для окружности длинной L = %1$.03f радиус R = %2$.03f площадь S = %3$.03f%n", l, r, s);
    }
}
