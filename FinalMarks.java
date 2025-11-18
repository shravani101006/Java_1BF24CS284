import CIE.*;
import SEE.*;
import java.util.*;

public class FinalMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        External[] students = new External[n];
        Internals[] internals = new Internals[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1));
            System.out.print("USN: ");
            String usn = sc.next();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Semester: ");
            int sem = sc.nextInt();

            students[i] = new External(usn, name, sem);
            internals[i] = new Internals();

            System.out.println("Enter 5 internal marks:");
            for (int j = 0; j < 5; j++)
                internals[i].internalMarks[j] = sc.nextInt();

            System.out.println("Enter 5 SEE marks:");
            for (int j = 0; j < 5; j++)
                students[i].seeMarks[j] = sc.nextInt();
        }

        System.out.println("\n----- FINAL MARKS -----");
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.println("USN: " + students[i].usn);
            System.out.println("Name: " + students[i].name);
            System.out.println("Semester: " + students[i].sem);

            System.out.print("Final Marks (per subject): ");
            for (int j = 0; j < 5; j++) {
                double finalMark = (internals[i].internalMarks[j] / 2.0)
                                 + (students[i].seeMarks[j] / 2.0);
                System.out.print(finalMark + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}