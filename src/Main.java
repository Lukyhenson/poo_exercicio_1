import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Put the student name: ");
        student.setName(sc.nextLine());

        System.out.println("Put the ClassRoom name: ");
        student.setClassRom(sc.nextLine());

        System.out.println("Put the value of VA1: ");
        student.setVa1(sc.nextDouble());

        System.out.println("Put the value of VA2: ");
        student.setVa2(sc.nextDouble());

        System.out.println("Put the value of VA3: ");
        student.setVa3(sc.nextDouble());

        System.out.println("Put the value of VA4: ");
        student.setVa4(sc.nextDouble());

        student.getAllInfo();
    }
}
