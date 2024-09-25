package src.aula2;

import java.util.Scanner;

import src.aula2.Rectangle;

import java.util.Locale;

public class Progra {    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);
    Rectangle rect = new Rectangle();
Locale.setDefault(Locale.US);
    System.out.println("Enter rectangle width and height: ");
    System.out.print("Width: ");
    rect.Width = sc.nextDouble();
    System.out.print("Height: ");
    rect.Height = sc.nextDouble();

    System.out.printf("AREA = %.2f%n " , rect.area());
        System.out.printf("PERIMETER = %.2f%n " , rect.perimeter());
        System.out.printf("DIAGONAL = %.2f%n " , rect.diagonal());
}
}

