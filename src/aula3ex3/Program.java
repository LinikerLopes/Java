package src.aula3ex3;
import java.util.Scanner;
import java.util.Locale;
import src.aula3ex3.Student;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Student student = new Student();

        System.out.println("Nome: ");
        student.name = sc.nextLine();
        System.out.print("Nota 1 = ");
        student.nota1 = sc.nextDouble();
        System.out.print("Nota 2 = ");
        student.nota2 = sc.nextDouble();
        System.out.print("Nota 3 = ");
        student.nota3 = sc.nextDouble();

            System.out.printf("Nota final: %.2f%n", student.finalGrade());

            if(student.finalGrade() > 60.0){
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
                System.out.printf("Faltou: %.2f%n", student.missingPoints());

            }
    }
}
