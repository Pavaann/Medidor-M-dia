import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.print("Digite o nome do aluno: ");
        student.name = sc.nextLine();
        System.out.print("Qual a nota do primeiro bimestre?  ");
        student.bimestre1 = sc.nextDouble();
        System.out.print("Qual é a nota do segundo bimestre?  ");
        student.bimestre2 = sc.nextDouble();
        System.out.print("Qual a nota do terceiro bimestre?  ");
        student.bimestre3 = sc.nextDouble();

        System.out.printf("Nota final: %.2f%n", student.notafinal());
        if (student.notafinal() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.precisandoDePontos());
        }
        else {
            System.out.println("PASS");
        }
        sc.close();
    }
}