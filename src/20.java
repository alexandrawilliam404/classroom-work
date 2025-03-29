import java.util.Scanner;

public class ClassRoomWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student name:");
        String studentName = scanner.nextLine();

        if (studentName.equals("Alice")) {
            System.out.println("You are the best student in our class.");
        } else {
            System.out.println("Sorry, but you didn't pass the test. You should improve your study habits.");
        }
    }
}
