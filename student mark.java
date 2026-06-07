import java.util.Scanner;

public class TeacherProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int marks[][] = new int[n][5];   // 2D array
        double avg[] = new double[n];    // 1D array

        // Input marks
        for (int i = 0; i < n; i++) {
            int sum = 0;
            System.out.println("Enter 5 marks for student " + (i + 1));

            for (int j = 0; j < 5; j++) {
                marks[i][j] = sc.nextInt();
                sum = sum + marks[i][j];
            }

            avg[i] = sum / 5.0; // average
        }

        // Sorting (Descending order)
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (avg[i] < avg[j]) {
                    double temp = avg[i];
                    avg[i] = avg[j];
                    avg[j] = temp;
                }
            }
        }

        // Output
        System.out.println("Average marks in descending order:");
        for (int i = 0; i < n; i++) {
            System.out.println(avg[i]);
        }
    }
}