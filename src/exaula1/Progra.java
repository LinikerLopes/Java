package src.exaula1;

import exaula1.Rectangle;

import java.util.Scanner;
import java.util.Locale;

public class Progra {    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);
    Rectangle rect = new Rectangle();
Locale.setDefault(Locale.US);
    System.out.println("Enter rectangle width and height: ");
    System.out.print("Width: ");
    rect.Width = sc.nextInt();
    System.out.print("Height: ");
    rect.Height = sc.nextInt();

    System.out.println(rect.area());
}
}

