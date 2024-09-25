package src.aula2ex2;
import src.aula2ex2.Employee;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        Employee emp = new Employee();

        System.out.println("Name: ");
        emp.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        emp.salary = sc.nextDouble();
        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.println("Employee" + emp);

        System.out.println("Which percentage to increse salary: ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println("update data: " + emp);
    }
}
