package src.aula;
import java.util.Scanner;
import java.util.Locale;
public class Estoque{
    public static void main(String[] args){
            
        Scanner sc = new Scanner(System.in);
     sc.useLocale(Locale.US);
     System.out.println("Enter product data");
     String product  = sc.nextLine();
     double price = sc.nextDouble();
     int quantity = sc.nextInt();

     double soma = price * quantity;
     System.out.println("Product data: " + product + ", $ " + price + " ," + quantity + ", Total: " + soma );;
    }

    private static void useLocale(Locale us) {
    }

    }