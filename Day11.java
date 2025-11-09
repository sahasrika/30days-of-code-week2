import java.util.*;

public class Day10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in 5 subjects: ");
        int total = 0;
        for (int i = 0; i < 5; i++) total += sc.nextInt();

        double avg = total / 5.0;
        String grade = avg >= 90 ? "A+" : avg >= 80 ? "A" : avg >= 70 ? "B" : "C";
        System.out.println("Average: " + avg + " | Grade: " + grade);
    }
}
