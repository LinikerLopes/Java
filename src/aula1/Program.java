package src.aula1;
import java.util.Scanner;

import src.aula1.Product;

import java.util.Locale;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            sc.useLocale(Locale.US);

        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.println("Quantity: ");
        product.quantity = sc.nextInt();

        System.out.println(product);
        
        System.out.println();

        System.out.println("Entre com a quantidade de produtos a adicionar ao estoque: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Produto atualizado: " + product);

    System.out.println();
        System.out.println("Entre com a quantidade de produtos a retirar do estoque: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Produto atualizado: " + product);



    }
    
}
