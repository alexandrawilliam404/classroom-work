import java.util.*;
public class ClassroomWork {
    public static void main(String[] args) {
        // Create an array of strings to store the classroom work titles
        String[] classroomWorkTitles = {"Math Homework", "Science Project", "English Essay"};

        // Get a random index from 0 to 2
        int randomIndex = (int)(Math.random() * 3);

        // Print the title of the selected classroom work
        System.out.println(classroomWorkTitles[randomIndex]);
    }
}
