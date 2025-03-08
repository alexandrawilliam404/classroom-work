import java.util.Random;
public class MyClass {
    public static void main(String[] args) {
        int num = new Random().nextInt(10); // Generate a random number between 0 and 9
        System.out.println("The number is: " + num);
    }
}
