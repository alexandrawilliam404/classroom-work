public class ClassroomWork {
    public static void main(String[] args) {
        // Example code to demonstrate basic Java programming concepts

        System.out.println("Hello, World!");
        
        int age = 18;
        String name = "Alice";
        boolean isStudent = true;

        if (isStudent && age >= 18) {
            System.out.println("You are a student and your age is " + age);
        } else {
            System.out.println("You are not a student or your age is less than 18.");
        }

        // Example of using if-else statements
        boolean isEven = 2 % 2 == 0;
        System.out.println("The number " + 45) + " is even: " + isEven;

        int[] numbers = {5, 3, 7, 9};
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        String name2 = "John";
        System.out.println(name2.length());
    }
}
